package de.danoeh.antennapod_mh.core.feed;

import de.danoeh.antennapod_mh.core.cast.RemoteMedia;

/**
 * Implements methods for FeedMedia that are flavor dependent.
 */
public class FeedMediaFlavorHelper {
    private FeedMediaFlavorHelper(){}
    static boolean instanceOfRemoteMedia(Object o) {
        return o instanceof RemoteMedia;
    }
}
