import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Billy");
        guest3 = new Guest("Bo");
        bedroom = new Bedroom(1,RoomType.DOUBLE);
    }

    @Test
    public void hasNoGuests(){

        assertEquals(0, bedroom.getGuestListSize());
    }
    @Test
    public void canAddAGuest(){
        bedroom.addGuestToList(guest1);
        assertEquals(1, bedroom.getGuestListSize());
    }
    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, bedroom.getBedroomCapacity());
    }
}
