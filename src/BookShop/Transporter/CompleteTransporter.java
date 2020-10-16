
package BookShop.Transporter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Vector;
import javax.swing.JButton;

public class CompleteTransporter {
    private Long idTransp;
    private Long idAddress;
    private String transpName;
    private String transpMail;
    private String contactName;
    private String lastname;
    private String firstname;
    private String statusTransp;
    private String statusAddress;
    private String street;
    private String street2;
    private String zipCode;
    private String city;
    private String country;
    private String phone;
    private String note;
    private BigDecimal transpPrice;
    private int transpWeightMax;
    private int transpTransitTime;
    private int transpMeasurementmax;

    private JButton btn_Details = new JButton("Details");

    public CompleteTransporter() {
    }
    
    // Contructor for init JTable Transporters
    public CompleteTransporter(
            Long idTransp, String transpName, String contactName, String transpMail, String phone, String city, String country, String statusTransp, JButton btn_Details) {
        this.idTransp = idTransp;
        this.transpName = transpName;
        this.contactName = contactName;
        this.transpMail = transpMail;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.statusTransp = statusTransp;
        this.btn_Details = btn_Details;
    }
    
    // Constructor superTransporter - all informations
    public CompleteTransporter(
            Long idTransp, String transpName, String contactName, String transpMail, String phone, String street, String street2, String zipCode, String city, String country, String note, String statusTransp, 
            BigDecimal transpPrice, int transpWeightMax, int transpTransitTime, int transpMeasurementmax) {
        this.idTransp = idTransp;
        this.transpName = transpName;
        this.contactName = contactName;
        this.transpMail = transpMail;
        this.phone = phone;
        this.street = street;
        this.street2 = street2;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.note = note;
        this.statusTransp = statusTransp;
        this.transpWeightMax = transpWeightMax;
        this.transpTransitTime = transpTransitTime;
        this.transpMeasurementmax = transpMeasurementmax;
        }        

    ////////////////////////////////////////////////////////////////////////////
    // JTable //

    // Init JTable Transporters - VALUES
    public Vector getVectorTransp() {
        Vector v = new Vector();
            v.add(this.getIdTransp());
            v.add(this.getTranspName());
            v.add(this.getContactName());
            v.add(this.getTranspMail());
            v.add(this.getPhone());
            v.add(this.getCity());
            v.add(this.getCountry());
            v.add(this.getStatusTransp());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    ////////////////////////////////////////////////////////////////////////////

    public Long getIdTransp() {
        return idTransp;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public BigDecimal getTranspPrice() {
        return transpPrice;
    }

    public void setTranspPrice(BigDecimal transpPrice) {
        this.transpPrice = transpPrice;
    }

    public int getTranspWeightMax() {
        return transpWeightMax;
    }

    public void setTranspWeightMax(int transpWeightMax) {
        this.transpWeightMax = transpWeightMax;
    }

    public int getTranspTransitTime() {
        return transpTransitTime;
    }

    public void setTranspTransitTime(int transpTransitTime) {
        this.transpTransitTime = transpTransitTime;
    }

    public int getTranspMeasurementmax() {
        return transpMeasurementmax;
    }

    public void setTranspMeasurementmax(int transpMeasurementmax) {
        this.transpMeasurementmax = transpMeasurementmax;
    }

    public void setIdTransp(Long idTransp) {
        this.idTransp = idTransp;
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getTranspName() {
        return transpName;
    }

    public void setTranspName(String transpName) {
        this.transpName = transpName;
    }

    public String getTranspMail() {
        return transpMail;
    }

    public void setTranspMail(String TranspMail) {
        this.transpMail = TranspMail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStatusTransp() {
        return statusTransp;
    }

    public void setStatusTransp(String statusTransp) {
        this.statusTransp = statusTransp;
    }

    public String getStatusAddress() {
        return statusAddress;
    }

    public void setStatusAddress(String statusAddress) {
        this.statusAddress = statusAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public JButton getBtn_Details() {
        return btn_Details;
    }

    public void setBtn_Details(JButton btn_Details) {
        this.btn_Details = btn_Details;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.idTransp);
        hash = 71 * hash + Objects.hashCode(this.transpName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CompleteTransporter other = (CompleteTransporter) obj;
        if (!Objects.equals(this.idTransp, other.idTransp)) {
            return false;
        }
        if (!Objects.equals(this.transpName, other.transpName)) {
            return false;
        }
        return true;
    }

    
}
