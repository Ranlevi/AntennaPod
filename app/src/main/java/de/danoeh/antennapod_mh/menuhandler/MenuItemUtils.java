package de.danoeh.antennapod_mh.menuhandler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import de.danoeh.antennapod_mh.R;
import de.danoeh.antennapod_mh.core.preferences.UserPreferences;

/**
 * Utilities for menu items
 */
public class MenuItemUtils extends de.danoeh.antennapod_mh.core.menuhandler.MenuItemUtils {

    public static void adjustTextColor(Context context, SearchView sv) {
        if(Build.VERSION.SDK_INT < 14) {
            EditText searchEditText = (EditText) sv.findViewById(R.id.search_src_text);
            if(UserPreferences.getTheme() == de.danoeh.antennapod_mh.R.style.Theme_AntennaPod_Dark) {
                searchEditText.setTextColor(Color.WHITE);
            } else {
                searchEditText.setTextColor(Color.BLACK);
            }
        }
    }

    @SuppressWarnings("ResourceType")
    public static void refreshLockItem(Context context, Menu menu) {
        final MenuItem queueLock = menu.findItem(de.danoeh.antennapod_mh.R.id.queue_lock);
        int[] lockIcons = new int[] { de.danoeh.antennapod_mh.R.attr.ic_lock_open, de.danoeh.antennapod_mh.R.attr.ic_lock_closed };
        TypedArray ta = context.obtainStyledAttributes(lockIcons);
        if (UserPreferences.isQueueLocked()) {
            queueLock.setTitle(de.danoeh.antennapod_mh.R.string.unlock_queue);
            queueLock.setIcon(ta.getDrawable(0));
        } else {
            queueLock.setTitle(de.danoeh.antennapod_mh.R.string.lock_queue);
            queueLock.setIcon(ta.getDrawable(1));
        }
        ta.recycle();
    }

}
