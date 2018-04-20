package de.danoeh.antennapod_mh.core.util.comparator;

import java.util.Comparator;

import de.danoeh.antennapod_mh.core.feed.FeedItem;

public class PlaybackCompletionDateComparator implements Comparator<FeedItem> {
	
	public int compare(FeedItem lhs, FeedItem rhs) {
		if (lhs.getMedia() != null
				&& lhs.getMedia().getPlaybackCompletionDate() != null
				&& rhs.getMedia() != null
				&& rhs.getMedia().getPlaybackCompletionDate() != null) {
			return rhs.getMedia().getPlaybackCompletionDate()
					.compareTo(lhs.getMedia().getPlaybackCompletionDate());
		}
		return 0;
	}
}
