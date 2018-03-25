package de.danoeh.antennapod_mh.core.util.comparator;

import java.util.Comparator;

import de.danoeh.antennapod_mh.core.feed.Chapter;

public class ChapterStartTimeComparator implements Comparator<Chapter> {

	@Override
	public int compare(Chapter lhs, Chapter rhs) {
		if (lhs.getStart() == rhs.getStart()) {
			return 0;
		} else if (lhs.getStart() < rhs.getStart()) {
			return -1;
		} else {
			return 1;
		}
	}

}
