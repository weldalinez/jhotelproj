package jhotel;

import java.util.*;
import java.text.*;
/**
 * Kelas pesanan digunakan untuk 
 *
 * @author Weldaline Zafira
 * @version 1-3-2018
 */
public class Pesanan
{
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.isAktif=true;
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.kamar=kamar;
//        this.biaya = jumlahHari * kamar.getDailyTariff();
        this.tanggalPesan=new Date();
        this.id=DatabasePesanan.getLastPesananID()+1;
        // initialise instance variables
        
    }

    public int getID()
     {
        return id;
    }

    /**
    * metode ini digunakan untuk mengakses nilai biaya yang sudah
    * diupdate di setBiaya
    * @return double ini akan mereturn nilai biaya dari setBiaya.
    */
    public double getBiaya() {
        return biaya;
    }

    /**
     * metode untuk mengambil nama pelanggan
     * @return nama_pelanggan
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
    * metode ini digunakan untuk mengakses nilai pelanggan yang
    * sudah diupdate di setPelanggan
    * @return Customer ini akan mereturn nilai pelanggan dari
    * setPelanggan.
    */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * metode ini digunakan untuk mengakses nilai isDiproses yang
     * sudah diupdate di setStatusDiproses
     * @return boolean ini akan mereturn nilai isDiproses dari
     * setStatusDiproses.
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
    * metode ini digunakan untuk mengakses nilai isDiproses yang
    * sudah diupdate di setStatusDiproses
    * @return boolean ini akan mereturn nilai isDiproses dari
    * setStatusDiproses.
    */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai isSelesai yang
    * sudah diupdate di setStatusSelesai
    * @return boolean ini akan mereturn nilai isSelesai dari
    * setStatusSelesai.
    */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * metode untuk mengambil data room
     * @return kamar 
     */
    public Room getRoom(){
        return kamar;
    }
    
    /**
     * metode untuk mengambil data tanggal pesan
     * @return kamar 
     */
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    
    public void setID(int id){
        this.id=id;
   }

    public void setBiaya()
    {
        //this.biaya = biaya;
        this.biaya = kamar.getDailyTariff()*jumlahHari;
    }

    public void setJumlahHari(double jumlahHari){
        this.jumlahHari=jumlahHari;
    }

    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;;
    }

    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
    }

    /**
    * metode ini digunakan untuk mengupdate nilai isDiproses yang
    * akan digunakan di getStatusDiproses
    * @param diproses
    */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    /** 
     * metode untuk mengupdate nilai kamar yang akan
     * digunakan di getRoom
     * @param kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar=kamar;
    }

    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
    
    /**
    * metode ini digunakan untuk mencetak nilai biaya
    * @return
    */
    public String toString()
    {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";

        if (getRoom()==null){
            return "Pesanan Dibuat oleh " + getPelanggan().getNama()
                    +"\nStatus: " + final_status + "\n";
        }
        return   getPelanggan().getNama() +
                " membooking kamar di hotel " + getRoom().getHotel().getNama() +
                " dengan nomor kamar " + getRoom().getNomorKamar() +
                " dan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString() +
                ".\nStatus: " + final_status + ".\n";

    }
}
