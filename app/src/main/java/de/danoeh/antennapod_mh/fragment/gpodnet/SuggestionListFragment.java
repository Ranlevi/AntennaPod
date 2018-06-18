package de.danoeh.antennapod_mh.fragment.gpodnet;

import java.util.Collections;
import java.util.List;

import de.danoeh.antennapod_mh.core.gpoddernet.GpodnetService;
import de.danoeh.antennapod_mh.core.gpoddernet.GpodnetServiceException;
import de.danoeh.antennapod_mh.core.gpoddernet.model.GpodnetPodcast;
import de.danoeh.antennapod_mh.core.preferences.GpodnetPreferences;

/**
 * Displays suggestions from gpodder.net
 */
public class SuggestionListFragment extends PodcastListFragment {
    private static final int SUGGESTIONS_COUNT = 50;

    @Override
    protected List<GpodnetPodcast> loadPodcastData(GpodnetService service) throws GpodnetServiceException {
        if (GpodnetPreferences.loggedIn()) {
            service.authenticate(GpodnetPreferences.getUsername(), GpodnetPreferences.getPassword());
            return service.getSuggestions(SUGGESTIONS_COUNT);
        } else {
            return Collections.emptyList();
        }
    }
}
