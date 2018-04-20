package de.danoeh.antennapod_mh.core.feed;

import static de.danoeh.antennapod_mh.core.feed.FeedImageMother.anyFeedImage;

class FeedMother {

    public static Feed anyFeed() {
        FeedImage image = anyFeedImage();
        return new Feed(0, null, "title", "http://example.com", "This is the description",
                "http://example.com/payment", "Daniel", "en", null, "http://example.com/feed", image,
                null, "http://example.com/feed", true);
    }

}
