package de.danoeh.antennapod_mh.core.syndication.handler;

import java.util.Map;

import de.danoeh.antennapod_mh.core.feed.Feed;

/**
 * Container for results returned by the Feed parser
 */
public class FeedHandlerResult {

    public final Feed feed;
    public final Map<String, String> alternateFeedUrls;

    public FeedHandlerResult(Feed feed, Map<String, String> alternateFeedUrls) {
        this.feed = feed;
        this.alternateFeedUrls = alternateFeedUrls;
    }
}
