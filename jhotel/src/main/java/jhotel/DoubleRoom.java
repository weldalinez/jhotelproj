package jhotel;

/**
 * Write a description of class DoubleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public DoubleRoom(Hotel hotel,String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
    }
    
    public void setCustomer2(Customer customer2)
    {
        // put your code here
        this.customer2=customer2;
    }
}
