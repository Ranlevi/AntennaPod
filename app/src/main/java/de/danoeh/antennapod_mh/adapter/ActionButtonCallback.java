package de.danoeh.antennapod_mh.adapter;

import de.danoeh.antennapod_mh.core.feed.FeedItem;
import de.danoeh.antennapod_mh.core.util.LongList;

interface ActionButtonCallback {
	/** Is called when the action button of a list item has been pressed. */
	void onActionButtonPressed(FeedItem item, LongList queueIds);
}
