package de.danoeh.antennapod_mh.config;

import de.danoeh.antennapod_mh.core.DBTasksCallbacks;
import de.danoeh.antennapod_mh.core.preferences.UserPreferences;
import de.danoeh.antennapod_mh.core.storage.APDownloadAlgorithm;
import de.danoeh.antennapod_mh.core.storage.AutomaticDownloadAlgorithm;
import de.danoeh.antennapod_mh.core.storage.EpisodeCleanupAlgorithm;

public class DBTasksCallbacksImpl implements DBTasksCallbacks {

    @Override
    public AutomaticDownloadAlgorithm getAutomaticDownloadAlgorithm() {
        return new APDownloadAlgorithm();
    }

    @Override
    public EpisodeCleanupAlgorithm getEpisodeCacheCleanupAlgorithm() {
        return UserPreferences.getEpisodeCleanupAlgorithm();
    }
}
