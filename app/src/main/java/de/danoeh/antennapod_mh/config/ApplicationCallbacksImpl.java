package de.danoeh.antennapod_mh.config;


import android.app.Application;
import android.content.Context;
import android.content.Intent;

import de.danoeh.antennapod_mh.PodcastApp;
import de.danoeh.antennapod_mh.activity.StorageErrorActivity;
import de.danoeh.antennapod_mh.core.ApplicationCallbacks;

public class ApplicationCallbacksImpl implements ApplicationCallbacks {

    @Override
    public Application getApplicationInstance() {
        return PodcastApp.getInstance();
    }

    @Override
    public Intent getStorageErrorActivity(Context context) {
        return new Intent(context, StorageErrorActivity.class);
    }

}
