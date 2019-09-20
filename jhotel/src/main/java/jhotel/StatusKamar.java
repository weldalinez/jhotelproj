package jhotel;

/**
 * Kelas ini akan membatasi status kamar yang dapat diterima
 *
 * @author Weldaline
 * @version 1506673800
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String status;
    
    /**
     * Metode untuk mengatur status kamar
     */
    StatusKamar(String status){
        this.status = status;
    }
    
    /**
     * Metode untuk mengambil nilai status kamar
     * @return status
     */
    public String toString(){
        return this.status;
    }
}
