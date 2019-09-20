package jhotel;

/**
 * Kelas berisi data kamar yang dapat dipesan
 *
 * @author Weldaline Z
 * @version 10-3-2018
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
//  private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
//  private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
//      this.isAvailable=isAvailable;
        this.status_kamar = StatusKamar.Vacant;
    }

    /**
     * metode untuk mengambil nilai hotel
     * @return    hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    
    /**
     * metode untuk mengambil nilai nomor kamar
     * @return    nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * metode untuk mengambil nilai dailyTariff
     * @return    dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    /**
     * metode untuk mengambil nilai status kamar
     * @return    status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    public abstract TipeKamar getTipeKamar();
    
     /**
     * metode untuk menentukan nilai hotel
     *   @param hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel=hotel;
    }
    
    /**
     * metode untuk menentukan nilai nomor kamar
     *   @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar=nomor_kamar;
    }
    
    public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff=dailytariff;
    }
    
    /**
     * metode untuk menentukan nilai status kamar
     * @param status_kamar
     *   
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar=status_kamar;
    }

    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "Hotel\t\t: " + getHotel().getNama()
                    + "\nTipeKamar\t: " + getTipeKamar()
                    + "\nHarga\t\t: " + getDailyTariff()
                    + "\nStatusKamar\t: " + getStatusKamar().toString() + "\n";
        }
        else
        {
            return "Hotel: " + getHotel().getNama()
                    + "\nTipeKamar: " + getTipeKamar()
                    + "\nHarga:" + getDailyTariff()
                    + "\nStatus Kamar: " + getStatusKamar().toString()
                    + "\nPelanggan: " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama() + "\n";
        }
    }
}