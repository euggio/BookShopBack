
package BookShop.Class;

import java.util.Objects;
import java.util.Vector;


public class Address {
    
    private Long AddressId;
    private String AddressLastname;
    private String AddressFirstname;
    private String AddressStreet;
    private String AddressStreet2;
    private String AddressZip;
    private String AddressCity;
    private String AddressCountry;
    private String AddressPhone;
    private String AddressLabel;
    private String AddressCompany;
    private String AddressNote;

    public Address() {
    }

    // Contrustor for research comboBox by city or country
    public Address(String AddressCity, String AddressCountry) {
        this.AddressCity = AddressCity;
        this.AddressCountry = AddressCountry;
    }

    public Address(Long AddressId, String AddressLastname, String AddressFirstname, String AddressStreet, String AddressZip, String AddressCity, String AddressCountry, String AddressPhone) {
        this.AddressId = AddressId;
        this.AddressLastname = AddressLastname;
        this.AddressFirstname = AddressFirstname;
        this.AddressStreet = AddressStreet;
        this.AddressZip = AddressZip;
        this.AddressCity = AddressCity;
        this.AddressCountry = AddressCountry;
        this.AddressPhone = AddressPhone;
    }

    public Address(Long AddressId, String AddressLabel, String AddressCompany, String AddressLastname, String AddressFirstname, String AddressStreet, String AddressStreet2, String AddressZip, String AddressCity, String AddressCountry, String AddressPhone, String AddressNote) {
        this.AddressId = AddressId;
        this.AddressLabel = AddressLabel;
        this.AddressCompany = AddressCompany;
        this.AddressLastname = AddressLastname;
        this.AddressFirstname = AddressFirstname;
        this.AddressStreet = AddressStreet;
        this.AddressStreet2 = AddressStreet2;
        this.AddressZip = AddressZip;
        this.AddressCity = AddressCity;
        this.AddressCountry = AddressCountry;
        this.AddressPhone = AddressPhone;  
        this.AddressNote = AddressNote;  
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // Init JTable Addresses - VALUES
    public Vector getVectorAddress() {
        Vector v = new Vector();
            v.add(this.getAddressId());
            v.add(this.getAddressLabel());
            v.add(this.getAddressCompany());
            v.add(this.getAddressLastname());
            v.add(this.getAddressFirstname());
            v.add(this.getAddressStreet());
            v.add(this.getAddressStreet2());
            v.add(this.getAddressZip());
            v.add(this.getAddressCity());
            v.add(this.getAddressCountry());
            v.add(this.getAddressPhone());
            
            return v;
    }

    ////////////////////////////////////////////////////////////////////////////
    public Long getAddressId() {
        return AddressId;
    }

    public void setAddressId(Long AddressId) {
        this.AddressId = AddressId;
    }

    public String getAddressLastname() {
        return AddressLastname;
    }

    public void setAddressLastname(String AddressLastname) {
        this.AddressLastname = AddressLastname;
    }

    public String getAddressFirstname() {
        return AddressFirstname;
    }

    public void setAddressFirstname(String AddressFirstname) {
        this.AddressFirstname = AddressFirstname;
    }

    public String getAddressStreet() {
        return AddressStreet;
    }

    public void setAddressStreet(String AddressStreet) {
        this.AddressStreet = AddressStreet;
    }

    public String getAddressStreet2() {
        return AddressStreet2;
    }

    public void setAddressStreet2(String AddressStreet2) {
        this.AddressStreet2 = AddressStreet2;
    }

    public String getAddressZip() {
        return AddressZip;
    }

    public void setAddressZip(String AddressZip) {
        this.AddressZip = AddressZip;
    }

    public String getAddressCity() {
        return AddressCity;
    }

    public void setAddressCity(String AddressCity) {
        this.AddressCity = AddressCity;
    }

    public String getAddressCountry() {
        return AddressCountry;
    }

    public void setAddressCountry(String AddressCountry) {
        this.AddressCountry = AddressCountry;
    }

    public String getAddressPhone() {
        return AddressPhone;
    }

    public void setAddressPhone(String AddressPhone) {
        this.AddressPhone = AddressPhone;
    }

    public String getAddressLabel() {
        return AddressLabel;
    }

    public void setAddressLabel(String AddressLabel) {
        this.AddressLabel = AddressLabel;
    }

    public String getAddressCompany() {
        return AddressCompany;
    }

    public void setAddressCompany(String AddressCompany) {
        this.AddressCompany = AddressCompany;
    }

    public String getAddressNote() {
        return AddressNote;
    }

    public void setAddressNote(String AddressNote) {
        this.AddressNote = AddressNote;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.AddressId);
        hash = 71 * hash + Objects.hashCode(this.AddressPhone);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.AddressId, other.AddressId)) {
            return false;
        }
        if (!Objects.equals(this.AddressPhone, other.AddressPhone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return AddressStreet + " " + AddressZip + " " + AddressCity + " " + AddressCountry;
    }
    
    
    
}
