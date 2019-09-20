package jhotel;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class HotelController {
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelsList()
    {
        ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
        return hotel;
    }

    @RequestMapping(value = "/hotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel)
    {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}