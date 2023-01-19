import java.util.ArrayList;

public class Hotel {
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private ArrayList<Bedroom> bedrooms;

    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms ) {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public void addBedroomToList(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }
    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addConferenceRoomsToList(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfGuestsInHotel() {
        int numberOfGuests = 0;
        for (Bedroom bedroom : bedrooms){
            numberOfGuests += bedroom.getGuestListSize();


        }
        return numberOfGuests;
    }
    public int getCapacityofHotel() {
        int totalCapacity = 0;
        for (Bedroom bedroom : bedrooms){
            totalCapacity += bedroom.getBedroomCapacity();


        }
        return totalCapacity;
    }

//    public void checkIn(Guest guest1) {
//        if(getCapacityofHotel()>getNumberOfGuestsInHotel()){
//            for (Bedroom bedroom:bedrooms){
//                if(ge)
//            }
//        }
//    }
}
