package uk.ac.ncl.team15.insideurban.data;

/**
 * Data structure class for holding information about a room.
 * Each instance has a unique ID, with 0 reserved for the default RoomDesc.
 *
 * Created stubs 14/02/18:
 * @author Ralph Ridley 160249909
 *
 * Implementation [date]:
 * @author
 * @author
 *
 */
import java.util.HashMap;
import java.util.Map;

public class RoomDesc {

    public static Map<Integer, RoomDesc> ROOMDESCS = new HashMap<Integer, RoomDesc>();

    private int id;
    private String altName;
    private String roomName;
    private String description;


    public RoomDesc(int id, String altName, String roomName, String description) {
        this.id = id;
        this.altName = altName;
        this.roomName = roomName;
        this.description = description;
        ROOMDESCS.put(id, this);
    }

    public int getId() {
        return id;
    }

    public String getAltName() {
        return altName;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

}