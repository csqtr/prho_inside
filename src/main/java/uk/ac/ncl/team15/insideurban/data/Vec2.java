package uk.ac.ncl.team15.insideurban.data;

/**
 * Data structure class for holding 2D coordinates, as well as providing methods
 * for operations on 2D coordinates.
 *
 * Created stubs 14/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation 21/02/18:
 * @author Sam Butterfield B6029496
 * @author Jacob Stimson B6034029
 *
 */
public class Vec2 {
    private float x;
    private float y;

    // Default constructor
    public Vec2(){
        x = 0;
        y = 0;
    }

    // Value constructor
    public Vec2(float x, float y){
        setX( x );
        setY( y );
    }

    // Gives another Vec2 with the same values as this instance to avoid accidental mutation
    public Vec2 copyOf(){
        Vec2 copy = new Vec2( getX(), getY() );
        return copy;
    }

    // Utility method to find the distance between two points
    public static float distance(Vec2 v1, Vec2 v2){
        float tempX;
        float tempY;

        tempX = ( float ) Math.pow( ( v1.getX() - v2.getX() ), 2 );
        tempY = ( float ) Math.pow( ( v1.getY() - v2.getY() ), 2 );

        float distance = ( float ) Math.sqrt( tempX + tempY );

        return distance;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }



}
