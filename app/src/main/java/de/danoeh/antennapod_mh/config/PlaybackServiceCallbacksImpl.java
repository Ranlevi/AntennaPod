package de.danoeh.antennapod_mh.config;

import android.content.Context;
import android.content.Intent;

import de.danoeh.antennapod_mh.R;
import de.danoeh.antennapod_mh.activity.AudioplayerActivity;
import de.danoeh.antennapod_mh.activity.CastplayerActivity;
import de.danoeh.antennapod_mh.activity.VideoplayerActivity;
import de.danoeh.antennapod_mh.core.PlaybackServiceCallbacks;
import de.danoeh.antennapod_mh.core.feed.MediaType;


public class PlaybackServiceCallbacksImpl implements PlaybackServiceCallbacks {
    @Override
    public Intent getPlayerActivityIntent(Context context, MediaType mediaType, boolean remotePlayback) {
        if (remotePlayback) {
            return new Intent(context, CastplayerActivity.class);
        }
        if (mediaType == MediaType.VIDEO) {
            return new Intent(context, VideoplayerActivity.class);
        } else {
            return new Intent(context, AudioplayerActivity.class);
        }
    }

    @Override
    public boolean useQueue() {
        return true;
    }

    @Override
    public int getNotificationIconResource(Context context) {
        return R.drawable.ic_stat_antenna_default;
    }
}
