package jhotel;
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.*;

/**
 * Kelas Customer digunakan untuk mendapatkan data customer
 *
 * @author Weldaline Zafira
 * @version 1-3-2018
 */
public class Customer
{
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String nama,int year,int month, int date, String email, String password)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(year,month-1,date).getTime();
        this.email= email;
        this.password=password;
    }
    
    public Customer(String nama, Date dob, String email)
    {
        // initialise instance variables
       // this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
    }

    /**
    * metode ini digunakan untuk mengakses nilai id yang sudah
    * diupdate di setID
    * 
    */
    public int getID()
    {
        return id;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai nama yang sudah
    * diupdate di setNama
    * 
    */
    public String getNama()
    {
        return nama;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai EMAIL yang sudah
    * diupdate di setEMAIL
    * 
    */
    public String getEmail()
    {
        return email;
    }
    
    /**
    * metode ini digunakan untuk mengakses nilai DOB yang sudah
    * diupdate di setDOB
    * 
    */
    public Date getDOB()
    {
        //System.out.printf("%1$s %2$td %2$tB %2$tY", "DOB: ", dob);
        return dob;
    }

    public String getPassword()
    {
        return password;
    }

    /**
    * metode ini digunakan untuk mengupdate nilai id yang
    * akan digunakan di getID
    * @param id
    */
    public void setID(int id)
    {
        this.id = id;
    }
    
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
    * metode ini digunakan untuk mengupdate nilai EMAIL yang
    * akan digunakan di getEmail
    * @param email
    */
    public void setEmail(String email)
    {
        String REGEX = "[^.][^\\s]+\\b@\\b[^-][^\\s]+";
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(email);
        System.out.println("Email " +email+"\n"+m.matches());
    }
    
    /**
    * metode ini digunakan untuk mengupdate nilai dob yang
    * akan digunakan di getDOB
    * @param dob
    */
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "ID\t\t: " + getID()
                    + "\nName\t: " + getNama()
                    + "\nE-Mail\t: " + getEmail()
                    + "\nDoB\t\t: " + dobformat.format(getDOB())
                    + "\nBooking Order is in progress\n";
        }
        else
        {
            return "ID: " + getID()
                    + "\nName: " + getNama()
                    + "\nE-Mail: " + getEmail()
                    + "\nDoB: " + dobformat.format(getDOB());
        }
    }
    
 //   /**
 //   * metode ini digunakan untuk mencetak nilai nama
  //  * @return
   // */
//public void printData()
    //{
        
    } 
