package jhotel;

/**
 * Kelas Lokasi digunakan untuk 
 *
 * @author Weldaline Zafira
 * @version 1-3-2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        // initialise instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
    * metode ini digunakan untuk mengakses nilai x_coord yang
    * sudah diupdate di setX
    * @return x_coord
    */
    public float getX()
    {
        return x_coord;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai y_coord yang
    * sudah diupdate di setY
    * @return y_coord
    */
    public float getY()
    {
        return y_coord;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai deskripsiLokasi
    * yang sudah diupdate di setDeskripsi
    * @return deskripsiLokasi
    */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
    * metode ini digunakan untuk mengupdate nilai x_coord yang
    * akan digunakan di getX
    * @param x_coord
    */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    } 
    
    /**
    * metode ini digunakan untuk mengupdate nilai y_coord yang
    * akan digunakan di getY
    * @param y_coord
    */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }  
    
    /**
    * metode ini digunakan untuk mengupdate nilai deskripsiLokasi
    * yang akan digunakan di getDeskripsi
    * @param deskripsi
    */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }    
    
    /**
    * metode ini digunakan untuk mencetak nilai deskripsiLokasi,
    * koordinat x, dan koordinat y
    */
    public String toString()
    {
        return("Koordinat X\t\t: " +getX()+
        "\nKoordinat Y\t\t: " +getY()+
        "\nDeskripsi\t\t: " +getDeskripsi());
    }
}
