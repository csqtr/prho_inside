package uk.ac.ncl.team15.insideurban.front.listeners;

/**
 * On Menu Fragment Replacement Button Click Listener.
 * This is for any buttons that replace the menu fragments with a different fragment.
 *
 * Created 26/02/18:
 * @author Ralph Ridley 160249909
 *
 */

import android.app.Activity;
import android.view.View;

import uk.ac.ncl.team15.insideurban.front.MainActivity;

public class OnMFRBClickListener implements View.OnClickListener {

    private MainActivity activity;
    private MainActivity.EMenuFragments eFrag;

    // Construct with the activity and the fragment that this listener will replace the current menu fragment with.
    public OnMFRBClickListener(MainActivity activity, MainActivity.EMenuFragments eFrag) {
        this.activity = activity;
        this.eFrag = eFrag;
    }

    // When a view with this listener is clicked replace the menu fragment.
    public void onClick(View view) {
            activity.replaceMenuFragment(eFrag);
    }

}
