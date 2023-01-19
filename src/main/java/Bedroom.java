import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNum;

    private RoomType roomType;

    public Bedroom( int roomNum, RoomType roomType) {
        this.roomNum = roomNum;
        this.roomType = roomType;
    }

    public int getBedroomCapacity() {
        return this.roomType.getValue();
    }

    public void addGuestToList(Guest guest) {
        if(getGuestListSize() < getBedroomCapacity()){
            addsAGuest(guest);
        };
    }


    //    public Bedroom(int roomNum, RoomType roomType) {
//        super(guestList);
//        this.roomNum = roomNum;
//        this.roomType = roomType;
//    }

}
