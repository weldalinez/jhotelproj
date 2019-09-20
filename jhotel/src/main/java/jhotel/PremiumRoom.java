package jhotel;

/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    //public double getDiscount()
    //{
    //    // put your code here
    //    return DISCOUNT;
    //}
    
    public void setDailyTariff(double dailytariff)
    {
        // put your code here
        super.setDailyTariff(dailytariff*DISCOUNT);
    }
}
