package com.ultraplayer.app;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/**
 * Buffer adaptativo para o player único do Fusion.
 * Live mantém uma reserva moderada para iniciar rápido; VOD usa mais reserva
 * para atravessar pequenas oscilações da rede sem consumir memória em excesso.
 */
final class FusionLoadControl extends DefaultLoadControl {
    private static final long LIVE_MAX_BUFFER_US = 12_000_000L;
    private static final long VOD_MAX_BUFFER_US = 45_000_000L;
    private static final long LIVE_START_US = 1_200_000L;
    private static final long LIVE_REBUFFER_US = 3_000_000L;

    private final DefaultLoadControl delegate;
    private volatile boolean live;

    FusionLoadControl(boolean live) {
        this.live = live;
        this.delegate = new DefaultLoadControl.Builder()
                .setBufferDurationsMs(8_000, 45_000, 2_500, 5_000)
                .setPrioritizeTimeOverSizeThresholds(true)
                .build();
    }

    void setLive(boolean live) {
        this.live = live;
    }

    private long maxBufferUs() {
        return live ? LIVE_MAX_BUFFER_US : VOD_MAX_BUFFER_US;
    }

    @Override
    public void onPrepared(PlayerId playerId) {
        delegate.onPrepared(playerId);
    }

    @Override
    public void onPrepared() {
        delegate.onPrepared();
    }

    @Override
    public void onTracksSelected(LoadControl.Parameters parameters,
                                 TrackGroupArray trackGroups,
                                 ExoTrackSelection[] selections) {
        delegate.onTracksSelected(parameters, trackGroups, selections);
    }

    @Override
    public void onStopped(PlayerId playerId) {
        delegate.onStopped(playerId);
    }

    @Override
    public void onStopped() {
        delegate.onStopped();
    }

    @Override
    public void onReleased(PlayerId playerId) {
        delegate.onReleased(playerId);
    }

    @Override
    public void onReleased() {
        delegate.onReleased();
    }

    @Override
    public Allocator getAllocator() {
        return delegate.getAllocator();
    }

    @Override
    public long getBackBufferDurationUs(PlayerId playerId) {
        return delegate.getBackBufferDurationUs(playerId);
    }

    @Override
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return delegate.retainBackBufferFromKeyframe(playerId);
    }

    @Override
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        if (parameters.bufferedDurationUs >= maxBufferUs()) return false;
        return delegate.shouldContinueLoading(parameters);
    }

    @Override
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        if (!live) return delegate.shouldStartPlayback(parameters);
        long minimum = parameters.rebuffering ? LIVE_REBUFFER_US : LIVE_START_US;
        return parameters.bufferedDurationUs >= minimum;
    }

    @Override
    public boolean shouldContinuePreloading(Timeline timeline,
                                             MediaSource.MediaPeriodId mediaPeriodId,
                                             long bufferedDurationUs) {
        return delegate.shouldContinuePreloading(timeline, mediaPeriodId, bufferedDurationUs);
    }
}
