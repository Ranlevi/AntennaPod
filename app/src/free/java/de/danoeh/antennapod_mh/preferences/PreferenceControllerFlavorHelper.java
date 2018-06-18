package de.danoeh.antennapod_mh.preferences;

import de.danoeh.antennapod.core.preferences.UserPreferences;
import de.danoeh.antennapod_mh.preferences.PreferenceController;

/**
 * Implements functions from PreferenceController that are flavor dependent.
 */
public class PreferenceControllerFlavorHelper {

    static void setupFlavoredUI(PreferenceController.PreferenceUI ui) {
        ui.findPreference(UserPreferences.PREF_CAST_ENABLED).setEnabled(false);
    }
}
