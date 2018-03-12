package uk.ac.ncl.team15.insideurban.front.fragments;

/**
 * Abstract class for shared behaviour between the fragments.
 *
 * Created stubs 26/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation [date]:
 * @author
 * @author
 *
 */

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.ac.ncl.team15.insideurban.R;
import uk.ac.ncl.team15.insideurban.front.MainActivity;

public abstract class CustomFragment extends Fragment {

    private View inflatedView;

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    // This event fires 2nd, before views are created for the fragment
    // The onCreate method is called when the Fragment instance is being created, or re-created.
    // Use onCreate for any standard setup that does not require the activity to be fully created
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState);

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Add listeners to view objects here
    }

    // This method is called when the fragment is no longer connected to the Activity
    // Any references saved in onAttach should be nulled out here to prevent memory leaks.
    @Override
    public void onDetach() {
        super.onDetach();
    }

    // This method is called after the parent Activity's onCreate() method has completed.
    // Accessing the view hierarchy of the parent activity must be done in the onActivityCreated.
    // At this point, it is safe to search for activity View objects by their ID, for example.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    // This method is for any arguments needed for the fragment (similar to passing through constructor normally)
    @Override
    public void setArguments(Bundle bundle) {
    }

    protected View getInflatedView() {
        return null;
    }

    protected void setInflatedView(View inflatedView){
    }

    protected abstract void attachViewListeners();

}
