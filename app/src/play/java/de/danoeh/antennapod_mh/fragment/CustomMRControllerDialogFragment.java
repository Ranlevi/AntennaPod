package de.danoeh.antennapod_mh.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.support.v7.app.MediaRouteControllerDialogFragment;

import de.danoeh.antennapod_mh.dialog.CustomMRControllerDialog;

public class CustomMRControllerDialogFragment extends MediaRouteControllerDialogFragment {
    @Override
    public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle savedInstanceState) {
        return new CustomMRControllerDialog(context);
    }
}
