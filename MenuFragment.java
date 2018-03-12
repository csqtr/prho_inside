package uk.ac.ncl.team15.insideurban.front.fragments;

/**
 *Fragment for the base sliding menu.
 *
 * Created stubs 26/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation [date]:
 * @author
 * @author
 *
 */


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MenuFragment extends CustomFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //setInflatedView(inflater.inflate(R.layout.[layout], container, false))

        inflatedView = inflater.inflate(R.layout.menu_fragment, container, false);
        setInflatedView( inflatedView );

        return inflatedView;
    }

    @Override
    protected void attachViewListeners() {
    }

}
