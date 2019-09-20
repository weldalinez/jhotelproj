package jhotel;
import java.util.*;

/**
 * Kelas DatabaseCustomer digunakan untuk mengatur list
 * customer
 *
 * @author Weldaline Zafira
 * @version 1-3-2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * metode ini digunakan untuk menambah nilai Customer dan
     * hasil akhirnya akan dilihat di getCustomerDatabase()
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (Customer cust : CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID() || cust.getEmail().compareTo(baru.getEmail()) == 0){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public static Customer getCustomerLogin(String email, String password){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getEmail().compareTo(email) == 0 && cust.getPassword().compareTo(password) == 0){
                return cust;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        for (Customer cust : CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan : DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){
                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }
}
