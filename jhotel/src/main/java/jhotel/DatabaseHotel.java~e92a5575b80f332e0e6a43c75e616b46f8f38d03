package jhotel;
import java.util.*;


/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Weldaline Zafira
 * @version 10-3-2018
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID(){return LAST_HOTEL_ID;}

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for (Hotel hotel : HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID()) {
                throw new HotelSudahAdaException(baru);
            }
            else if(hotel.getLokasi() == baru.getLokasi()) {
                throw new HotelSudahAdaException(baru);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    public static Hotel getHotel(int id){
        for (Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == id) return hotel;
        }
        return null;
    }


    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == id) {
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException e) {
                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}
