package jhotel;

import static jhotel.StatusKamar.Vacant;

/**
 * Class Administrasi untuk mengatur dan membatasi pesanan
 *
 * @author Weldaline Zafira
 * @version 10-3-2018
 */
public class Administrasi
{
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if(kamar.getStatusKamar().equals(StatusKamar.Vacant))
        {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            kamar.setStatusKamar(StatusKamar.Booked);
        }
        else
        {
            pesan.setStatusAktif(false);
        }
        //DatabaseRoom.getRoom(kamar.getHotel(),kamar.getNomorKamar()).setStatusKamar(StatusKamar.Booked);
    }
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
            //pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(Vacant);
    }
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
            //pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(Vacant);
    }
    public static void pesananDibatalkan(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(Vacant);
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(Vacant);
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
    }

    //public static void cariKamarKosong(){}
}
