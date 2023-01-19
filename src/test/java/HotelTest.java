import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;


    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Billy");
        guest3 = new Guest("Bo");
        conferenceRoom1 = new ConferenceRoom("Mike Richie_ Room",20);
        conferenceRoom2 = new ConferenceRoom("Susan Powell",2);
        bedroom1 = new Bedroom(101,RoomType.DOUBLE);
        bedroom2 = new Bedroom(69,RoomType.SINGLE);
        hotel = new Hotel(bedrooms,conferenceRooms);
        hotel.addBedroomToList(bedroom1);
        hotel.addBedroomToList(bedroom2);
    }

    @Test
    public void hasTwoBedrooms(){

        assertEquals(2, hotel.getNumberOfBedrooms());
    }
    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuestToList(guest1);
//        assertEquals(true, hotel.roomCheckedIn());
    }
    @Test
    public void cannotAddMoreGuestsThanRoomCapacity(){
        bedroom1.addGuestToList(guest1);
        bedroom1.addGuestToList(guest2);
        bedroom1.addGuestToList(guest3);
        assertEquals(2, bedroom1.getGuestListSize());
    }

    @Test
    public void hotelCanCheckGuestIn(){
        hotel.checkIn(guest1);
        assertEquals();
    }
    @Test
    public void canGetNumberOfGuestsInHotel() {
        bedroom1.addGuestToList(guest1);
        bedroom2.addGuestToList(guest2);

        assertEquals(2, hotel.getNumberOfGuestsInHotel());
    }
    @Test
    public void canGetCapacityOfHotel() {

        assertEquals(3, hotel.getCapacityofHotel());
    }

    }
