import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guestList;

    public Room() {
        this.guestList = new ArrayList<Guest>();
    }

    public int getGuestListSize() {
        return guestList.size();
    }

    public void addsAGuest(Guest guest) {
        guestList.add(guest);
    }
}
