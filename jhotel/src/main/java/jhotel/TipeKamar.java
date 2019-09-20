package jhotel;

/**
 * kelas ini akan membatasi tipe kamar yang dapat diterima
 *
 * @author Weldaline
 * @version 1506673800
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private final String type;
    
    private TipeKamar(String type){
        this.type=type;
    }
    
    /**
     * Metode untuk mengatur tipe kamar
     * @return tipe
     */
    public String toString(){
        return this.type;
    }
}

