package de.danoeh.antennapod_mh.fragment.gpodnet;

import java.util.List;

import de.danoeh.antennapod_mh.core.gpoddernet.GpodnetService;
import de.danoeh.antennapod_mh.core.gpoddernet.GpodnetServiceException;
import de.danoeh.antennapod_mh.core.gpoddernet.model.GpodnetPodcast;

/**
 *
 */
public class PodcastTopListFragment extends PodcastListFragment {
    private static final String TAG = "PodcastTopListFragment";
    private static final int PODCAST_COUNT = 50;

    @Override
    protected List<GpodnetPodcast> loadPodcastData(GpodnetService service) throws GpodnetServiceException {
        return service.getPodcastToplist(PODCAST_COUNT);
    }
}
