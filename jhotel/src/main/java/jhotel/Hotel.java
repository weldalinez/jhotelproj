package jhotel;

/**
 * Kelas Hotel digunakan untuk mendapatkan data hotel
 *
 * @author Weldaline Zafira
 * @version 1-3-2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        // initialise instance variables
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID()+1;
    }

    public int getID()
    {
        return id;
    }

    /**
    * metode ini digunakan untuk mengakses nilai bintang yang
    * sudah diupdate di setBintang
    * @return int ini akan mereturn nilai bintang dari setBintang.
    */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai nama yang sudah
    * diupdate di setNama
    * @return String ini akan mereturn nilai nama dari setNama.
    */
    public String getNama()
    {
        return nama;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai lokasi yang
    * sudah diupdate di setLokasi
    * @return Lokasi ini akan mereturn nilai lokasi dari
    * setLokasi.
    */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

//    public void setID(int id) {
//        this.id = id;
//    }

    /**
    * metode ini digunakan untuk mengupdate nilai nama yang
    * akan digunakan di getNama
    * @param nama
    */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
    * metode ini digunakan untuk mengupdate nilai lokasi yang
    * akan digunakan di getLokasi
    * @param lokasi
    */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
    * metode ini digunakan untuk mengupdate nilai isSelesai yang
    * akan digunakan di getStatusSelesai
    * @param bintang
    */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
       
    /**
    * metode ini digunakan untuk mencetak nilai nama hotel,
    * lokasi, dan bintang hotel
    */
    public String toString()
    {
        return "Hotel\t: " + getNama()
                +"\nBintang\t: " + getBintang()
                + "\nLokasi\t: " + getLokasi().getDeskripsi() + "\n";
    }
}
