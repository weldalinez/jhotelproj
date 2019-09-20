package jhotel;

import java.awt.desktop.*;
import java.util.GregorianCalendar;

import static java.time.Month.JANUARY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/**
 * Write a description of class JHotel here.
 *
 * @author Weldaline Zafira
 * @version 2018
 */
public class JHotel
{
        /**
     * Constructor for objects of class Pesanan
     */
    public JHotel()
    {
    }

    public static void main(String args[])
    {

        Hotel h1 = new Hotel("H1", new Lokasi(1, 2, "Depok1"), 1);
        try{
            DatabaseHotel.addHotel(h1);
        }
        catch (HotelSudahAdaException e)
        {
            e.getMessage();
        }

        Room r1 = new SingleRoom(DatabaseHotel.getHotel(1), "A1");
        try{
            DatabaseRoom.addRoom(r1);
        }
        catch (RoomSudahAdaException e)
        {
            e.getMessage();
        }

        Room r2 = new DoubleRoom(DatabaseHotel.getHotel(1), "B2");
        try{
            DatabaseRoom.addRoom(r2);
        }
        catch (RoomSudahAdaException e)
        {
            e.getMessage();
        }

        Room r3 = new PremiumRoom(DatabaseHotel.getHotel(1), "C3");
        try{
            DatabaseRoom.addRoom(r3);
        }
        catch (RoomSudahAdaException e)
        {
            e.getMessage();
        }

        SpringApplication.run(JHotel.class, args);

        /**
         * Hotel h2 = new Hotel("H2", new Lokasi(3, 4, "Depok2"), 2);
         try{
         DatabaseHotel.addHotel(h2);
         }
         catch (HotelSudahAdaException e)
         {
         e.getMessage();
         }

         Room r1 = new SingleRoom(DatabaseHotel.getHotel(1), "A1");
         try{
         DatabaseRoom.addRoom(r1);
         }
         catch (RoomSudahAdaException e)
         {
         e.getMessage();
         }

         Room r2 = new DoubleRoom(DatabaseHotel.getHotel(1), "B2");
         try{
         DatabaseRoom.addRoom(r2);
         }
         catch (RoomSudahAdaException e)
         {
         e.getMessage();
         }

         Room r3 = new PremiumRoom(DatabaseHotel.getHotel(2), "C3");
         try{
         DatabaseRoom.addRoom(r3);
         }
        catch (RoomSudahAdaException e)
        {
            e.getMessage();
        }

        SpringApplication.run(JHotel.class, args);
*/
        //    try {
    //        Lokasi a = new Lokasi(5, 6, "Depok3");
    //        DatabaseHotel.addHotel(new Hotel("H1", new Lokasi(1, 2, "Depok1"), 1));
    //        DatabaseHotel.addHotel(new Hotel("H2", new Lokasi(3, 4, "Depok2"), 2));
    //        DatabaseHotel.addHotel(new Hotel("H3", a, 3));
    //        DatabaseHotel.addHotel(new Hotel("H3", a, 3));
    //    } catch(HotelSudahAdaException e){
    //        System.out.println("\n---Tes Hotel");
    //        System.out.println(e.getPesan());
    //    }

    //    try {
    //        DatabaseCustomer.addCustomer(new Customer("Me", 2000, 1, 4, "me@ui.ac.id"));
    //        DatabaseCustomer.addCustomer(new Customer("You", 2001, 2, 5, "you@ui.ac.id"));
    //        DatabaseCustomer.addCustomer(new Customer("Them", 2002, 3, 6, "them@ui.ac.id"));
    //        DatabaseCustomer.addCustomer(new Customer("Them", 2002, 3, 6, "them@ui.ac.id"));
    //    }
    //    catch(PelangganSudahAdaException e){
    //        System.out.println("---Tes Pelanggan");
    //        System.out.println(e.getPesan());
    //    }

    //    try {
    //        DatabasePesanan.addPesanan(new Pesanan(4, DatabaseCustomer.getCustomer(1)));
    //        DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(2)));
    //        DatabasePesanan.addPesanan(new Pesanan(6, DatabaseCustomer.getCustomer(3)));
    //        DatabasePesanan.addPesanan(new Pesanan(6, DatabaseCustomer.getCustomer(3)));
    //    } catch(PesananSudahAdaException e){
    //        System.out.println("\n---Tes Pesanan");
    //        System.out.println(e.getPesan());
    //    }

    //    try {
    //        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A1"));
    //        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B2"));
    //        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C3"));
    //        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D4"));
    //        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D4"));

   //     } catch(RoomSudahAdaException e) {
   //         System.out.println("\n---Tes Room");
   //         System.out.println(e.getPesan());
   //     }

    //    try{
    //        DatabaseHotel.removeHotel(11);
    //    }
    //    catch(HotelTidakDitemukanException e){
    //        System.out.println("\n---Tes Hotel Tidak Ditemukan");
    //        System.out.println(e.getPesan());
    //    }

    //    try{
    //        DatabaseCustomer.removeCustomer(10);
    //    } catch(PelangganTidakDitemukanException e){
    //        System.out.println("\n---Tes Pelanggan Tidak Ditemukan");
    //        System.out.println(e.getPesan());
    //    }

    //    Customer me = new Customer("Wel",2018,1,1,"weldaline.zafira@ui.ac.id");
    //    Pesanan pesan = new Pesanan(7,me);

    //    try{
    //        DatabasePesanan.removePesanan(pesan);
    //    }
    //    catch(PesananTidakDitemukanException e){
    //        System.out.println("\n---Tes Pesanan Tidak Ditemukan");
    //        System.out.println(e.getPesan());
    //    }

   //     try{
    //        DatabaseRoom.removeRoom(DatabaseHotel.getHotel(1),"TES123");
    //    }
    //    catch(RoomTidakDitemukanException e){
    //        System.out.println("\n---Tes Room Tidak Ditemukan");
    //        System.out.println(e.getPesan());
    //    }

    //    System.out.println("\n\n===========HASIL==========");

    //    System.out.println(DatabaseCustomer.getCustomerDatabase());
    //    System.out.println("\n");
    //    System.out.println(DatabaseHotel.getHotelDatabase());
    //    System.out.println("\n");
    //    System.out.println(DatabaseRoom.getRoomDatabase());
    //    System.out.println("\n");
    //    System.out.println(DatabasePesanan.getPesananDatabase());

//        System.out.println("\nPrint Database Hotel--------------------");
//        for(Hotel hotel : DatabaseHotel.getHotelDatabase())
//            {
//                System.out.println(hotel);
//            }

//        System.out.println("\nPrint Database Customer------------------");
//        for(Customer cust : DatabaseCustomer.getCustomerDatabase())
//            {
//                System.out.println(cust);
//            }

//        System.out.println("\nPrint Database Pesanan-------------------");
//        for(Pesanan db : DatabasePesanan.getPesananDatabase())
//        {
//            System.out.println(db);
//        }

//        System.out.println("\nPrint Database Room---------------------");
//        for(Room room : DatabaseRoom.getRoomDatabase()) {
//            System.out.println(room);
//        }

//        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A1"));
//        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "D4"));
//        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B2"));

//        System.out.println("\nPrint Database Administrasi-------------");
//        for(Pesanan ad : DatabasePesanan.getPesananDatabase()) {
//            System.out.println(ad);
//        }

//        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(2));
//        System.out.println("\nPrint Pesanan Dibatalkan----------------");
//        for(Pesanan bat : DatabasePesanan.getPesananDatabase()) {
//            System.out.println(bat);
//        }

//        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(1));
//        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(3));

//        System.out.println("\nPrint Pesanan Selesai-------------------");
//        for(Pesanan sel : DatabasePesanan.getPesananDatabase()) {
//            System.out.println(sel);
//        }
    }
}