
package BookShop.Customer;

import java.sql.Date;
import java.util.Vector;
import javax.swing.JButton;

public class CompleteCustomer {
    private Long idCusto;
    private Long idAddress;
    private String customerMail;
    private String socialTitle;
    private Long socialTitleId;
    private String lastname;
    private String firstname;
    private String statusCusto;
    private Date birthdate;
    private Date signIn;
    private String note;
    private String statusAddress;
    private String street;
    private String zipCode;
    private String city;
    private String country;
    private String phone;
    private JButton btn_Details = new JButton("Details");
    
    private Long orderNum;
    private Date orderDate;
    private Date deliveryStatusDate;
    private String packageNumber;
    private String orderInvoice;
    private String orderCustomerIp;
    private String orderTotalAmount;
    
    private Date commentDate;
    private String bookIsbn;
    private String bookTitle;
    private String commentStatus;

    public CompleteCustomer() {
    }

    // Constructor for init JTable Customers
    public CompleteCustomer(Long idCusto, String socialTitle, String lastname, String firstname, String customerMail, String statusCusto, JButton btn_Details) {
        this.idCusto = idCusto;
        this.socialTitle = socialTitle;
        this.lastname = lastname;
        this.firstname = firstname;
        this.customerMail = customerMail;
        this.statusCusto = statusCusto;
        this.btn_Details = btn_Details;
    }
    
    // Constructor for init JTable Addresses
    public CompleteCustomer(Long idAddress, Long idCusto, String lastname, String firstname, String street, String zipCode, String city, String country, String phone, JButton btn_Details) {
        this.idAddress = idAddress;
        this.lastname = lastname;
        this.firstname = firstname;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.statusAddress = statusAddress;
        this.btn_Details = btn_Details;
        }     
    
    // Constructor superCustomer - all informations/attributes
    public CompleteCustomer(Long idCusto, Long socialTitleId, String lastname, String firstname, String customerMail, Date birthdate, Date signIn, String statusCusto, String note) {
        this.idCusto = idCusto;
        this.socialTitleId = socialTitleId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.customerMail = customerMail;
        this.birthdate = birthdate;
        this.signIn = signIn;
        this.statusCusto = statusCusto;
        this.note = note; 
    }
    
    // Constructor for init JTable Order by Custo
    public CompleteCustomer(Long orderNum, String orderInvoice, Date orderDate, String orderTotalAmount, String packageNumber, Date deliveryStatusDate, String orderCustomerIp, JButton btn_Details) {
        this.orderNum = orderNum;
        this.orderInvoice = orderInvoice;
        this.orderDate = orderDate;
        this.orderTotalAmount = orderTotalAmount;
        this.packageNumber = packageNumber;
        this.deliveryStatusDate = deliveryStatusDate;
        this.orderCustomerIp = orderCustomerIp;
        this.btn_Details = btn_Details;
    }
    
    // Constructor for init JTable Comment by Custo
    public CompleteCustomer(Date commentDate, Long orderNum, String bookIsbn, String bookTitle, String commentStatus, String note, JButton btn_Details) {
        this.commentDate = commentDate;
        this.orderNum = orderNum;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.commentStatus = commentStatus;
        this.note = note;
        this.btn_Details = btn_Details;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // getVector //

    // Init JTable Customers - VALUES
    public Vector getVectorCusto() {
        Vector v = new Vector();
            v.add(this.getIdCusto());
            v.add(this.getSocialTitle());
            v.add(this.getLastname());
            v.add(this.getFirstname());
            v.add(this.getCustomerMail());
            v.add(this.getStatusCusto());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    // Init JTable Customers - VALUES
    public Vector getVectorCompCusto() {
        Vector v = new Vector();
            v.add(this.getIdCusto());
            v.add(this.getSocialTitleId());
            v.add(this.getLastname());
            v.add(this.getFirstname());
            v.add(this.getCustomerMail());
            v.add(this.getBirthdate());
            v.add(this.getSignIn());
            v.add(this.getStatusCusto());
            v.add(this.getNote());
            
            return v;
    }
    
    // Init JTable Addresses - VALUES
    public Vector getVectorAddress() {
        Vector v = new Vector();
            v.add(this.getIdAddress());
            v.add(this.getLastname());
            v.add(this.getFirstname());
            v.add(this.getStreet());
            v.add(this.getZipCode());
            v.add(this.getCity());
            v.add(this.getCountry());
            v.add(this.getPhone());
            v.add(this.getStatusAddress());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    // Init JTable Orders by Customer - VALUES
    public Vector getVectorOrderCusto() {
        Vector v = new Vector();
            v.add(this.getOrderNum());
            v.add(this.getOrderInvoice());
            v.add(this.getOrderDate());
            v.add(this.getOrderTotalAmount());
            v.add(this.getPackageNumber());
            v.add(this.getDeliveryStatusDate());
            v.add(this.getOrderCustomerIp());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    // Init JTable Comments by Customer - VALUES
    public Vector getVectorCommentCusto() {
        Vector v = new Vector();
            v.add(this.getCommentDate());
            v.add(this.getOrderNum());
            v.add(this.getBookIsbn());
            v.add(this.getBookTitle());
            v.add(this.getCommentStatus());
            v.add(this.getNote());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    ////////////////////////////////////////////////////////////////////////////

    public Long getIdCusto() {
        return idCusto;
    }

    public void setIdCusto(Long idCusto) {
        this.idCusto = idCusto;
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getSocialTitle() {
        return socialTitle;
    }

    public void setSocialTitle(String socialTitle) {
        this.socialTitle = socialTitle;
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

    public Long getSocialTitleId() {
        return socialTitleId;
    }

    public void setSocialTitleId(Long socialTitleId) {
        this.socialTitleId = socialTitleId;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getSignIn() {
        return signIn;
    }

    public void setSignIn(Date signIn) {
        this.signIn = signIn;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
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

    public String getStatusCusto() {
        return statusCusto;
    }

    public void setStatusCusto(String statusCusto) {
        this.statusCusto = statusCusto;
    }

    public String getRoad() {
        return street;
    }

    public void setRoad(String road) {
        this.street = road;
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

    public JButton getBtn_Details() {
        return btn_Details;
    }

    public void setBtn_Details(JButton btn_Details) {
        this.btn_Details = btn_Details;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryStatusDate() {
        return deliveryStatusDate;
    }

    public void setDeliveryStatusDate(Date deliveryStatusDate) {
        this.deliveryStatusDate = deliveryStatusDate;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(String orderInvoice) {
        this.orderInvoice = orderInvoice;
    }

    public String getOrderCustomerIp() {
        return orderCustomerIp;
    }

    public void setOrderCustomerIp(String orderCustomerIp) {
        this.orderCustomerIp = orderCustomerIp;
    }

    public String getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(String orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    @Override
    public String toString() {
        return lastname + firstname;
    }

    public String toStringShipping() {
        return street + " " + zipCode + " " + city + " " + country;
    }

    
}
