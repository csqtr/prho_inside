package uk.ac.ncl.team15.insideurban.front.listeners;

/**
 * Listener for changing the color settings.
 *
 * Created stubs 26/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation [date]:
 * @author
 * @author
 *
 */

import android.view.View;

public class OnColorBlindSelect implements View.OnClickListener {

    public enum ColorMode {
        DEFAULT("default"), PROTANOPIA("protanopia"),
        DEUTERANOPIA("deuteranopia"), TRITANOPIA("tritanopia");

        private String value;

        ColorMode(String value) {
            this.value = value;
        }

    }

    public OnColorBlindSelect(ColorMode mode) {
    }

    @Override
    public void onClick(View view) {
        // Set the colorString in MainActivity
    }

}
