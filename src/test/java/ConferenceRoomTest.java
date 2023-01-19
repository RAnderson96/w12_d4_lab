//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class ConferenceRoomTest {
//    ConferenceRoom conferenceRoom;
//    Bedroom bedroom;
//    Guest guest1;
//    Guest guest2;
//    Guest guest3;
//    @Before
//    public void before(){
//        guest1 = new Guest("Bob");
//        guest2 = new Guest("Billy");
//        guest3 = new Guest("Bo");
//        conferenceRoom = new ConferenceRoom("Mike Richie_ Room",20);
//        bedroom = new Bedroom(1,RoomType.DOUBLE);
//    }
//
//    @Test
//    public void hasNoGuests(){
//
//        assertEquals(0, conferenceRoom.getGuestListSize());
//    }
//    @Test
//    public void canAddAGuest(){
//        conferenceRoom.addGuestToList(guest1);
//        assertEquals(1, conferenceRoom.getGuestListSize());
//    }
//    @Test
//    public void guestAddedToBedroomNotConferenceRoom(){
//        bedroom.addGuestToList(guest1);
//        assertEquals(0, conferenceRoom.getGuestListSize());
//    }
//}
