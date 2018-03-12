package uk.ac.ncl.team15.insideurban.front.views;

/**
 * Canvas view for drawing the map and paths.
 *
 * Created stubs 26/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation [date]:
 * @author
 * @author
 *
 */

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

import uk.ac.ncl.team15.insideurban.data.USBNode;

public class MapCanvas extends View {

    public MapCanvas(Context context, AttributeSet attr){
        super(context, attr);
    }

    @Override
    public void onDraw(Canvas canvas){
    }

    public void changeMap(int map) {
    }

    public void drawPath(List<USBNode> nodes) {
    }

}
