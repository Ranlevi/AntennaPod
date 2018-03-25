package de.danoeh.antennapod_mh.core.event;

import de.danoeh.antennapod_mh.core.feed.FeedMedia;

public class FeedMediaEvent {

    public enum Action {
        UPDATE
    }

    private final Action action;
    private final FeedMedia media;

    private FeedMediaEvent(Action action, FeedMedia media) {
        this.action = action;
        this.media = media;
    }

    public static FeedMediaEvent update(FeedMedia media) {
        return new FeedMediaEvent(Action.UPDATE, media);
    }

}
