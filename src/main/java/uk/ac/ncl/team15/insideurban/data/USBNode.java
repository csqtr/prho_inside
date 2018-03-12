package uk.ac.ncl.team15.insideurban.data;

/**
 * Data structure class for storing information of a Node.
 *
 * Created stubs 14/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation 16/02/18:
 * @author Irmantas Zelionis b6045919
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USBNode {

    public static Map<Integer, USBNode> NODES = new HashMap<Integer, USBNode>();

    private int id;
    private int rdid;
    private Vec2 position;
    private List<Integer> connecting;
    private int level;
    private boolean isAccessible;

    // Simple constructor with fields
    public USBNode(int id, int rdid, Vec2 position, List<Integer> connecting, int level, boolean isAccessible){
        this.id = id;
        this.rdid = rdid;
        this.position = position;
        this.connecting = connecting;
        this.level = level;
        this.isAccessible = isAccessible;
        NODES.put(id, this);
    }

    // Simple getters
    public int getID(){
        return this.id;
    }

    public int getRDID(){
        return this.rdid;
    }

    public Vec2 getPosition(){
        return this.position;
    }
    public List<Integer> getConnecting(){
        return this.connecting;
    }
    public int getLevel(){
        return this.level;
    }
    public boolean isAccessible(){
        return this.isAccessible;
    }

}