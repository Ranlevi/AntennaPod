package de.danoeh.antennapod_mh.core.util.comparator;

import de.danoeh.antennapod_mh.core.feed.FeedItem;

import java.util.Comparator;

/** Compares the pubDate of two FeedItems for sorting*/
public class FeedItemPubdateComparator implements Comparator<FeedItem> {

	/** Returns a new instance of this comparator in reverse order. 
	public static FeedItemPubdateComparator newInstance() {
		FeedItemPubdateComparator
	}*/
	@Override
	public int compare(FeedItem lhs, FeedItem rhs) {
		return rhs.getPubDate().compareTo(lhs.getPubDate());
	}

}
