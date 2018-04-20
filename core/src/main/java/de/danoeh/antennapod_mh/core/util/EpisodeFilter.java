package de.danoeh.antennapod_mh.core.util;

import java.util.ArrayList;
import java.util.List;

import de.danoeh.antennapod_mh.core.feed.FeedItem;

class EpisodeFilter {

	private EpisodeFilter() {

	}

	/** Return a copy of the itemlist without items which have no media. */
	public static ArrayList<FeedItem> getEpisodeList(List<FeedItem> items) {
		ArrayList<FeedItem> episodes = new ArrayList<>(items);
		for (FeedItem item : items) {
			if (item.getMedia() == null) {
				episodes.remove(item);
			}
		}
		return episodes;
	}

	public static int countItemsWithEpisodes(List<FeedItem> items) {
		int count = 0;
		for (FeedItem item : items) {
			if (item.getMedia() != null) {
				count++;
			}
		}
		return count;
	}

	public static FeedItem accessEpisodeByIndex(List<FeedItem> items,
			int position) {
		int count = 0;
		for (FeedItem item : items) {

			if (item.getMedia() != null) {
				if (count == position) {
					return item;
				} else {
					count++;
				}
			}
		}
		return null;
	}
}
