package BookShop.OrderCat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;

/**
 *
 * @author gregs
 */
public class CompleteOrder {
    private Long OrderdataNum;
    private Date OrderdataDate, DeliveryStatusDate, PaymentStatusDate;
    private BigDecimal PackageShippingCost, OrderdataTotalAmount;
    private String PackageNumber, OrderdataInvoice, OrderdataTerms, OrderdataCustomerIp, TransporterName, PaymentStatusLabel, CustomerMail, CmdLineBookIsbn, PaymentCorpName, PaymentStatusTransactionNum ;
    private int PackageLength, PackageHeight, PackageWeight, PackageWidth, BookPrice, CmdLineQty, BookStock, TotalAmountBookQty, TransporterWeightMax, TransporterPrice, ValueSelected;
    private JButton btn_Details = new JButton("Details");
    
    public CompleteOrder() {
    }
    
    ///Table OrdersResume Constructor///
    public CompleteOrder(Long OrderdataNum, Date OrderdataDate, String OrderdataInvoice, String OrderdataTerms, String OrderdataCustomerIp, JButton btn_Details) {
        this.OrderdataNum = OrderdataNum;
        this.OrderdataDate = OrderdataDate;
        this.OrderdataInvoice = OrderdataInvoice;
        this.OrderdataTerms = OrderdataTerms;
        this.OrderdataCustomerIp = OrderdataCustomerIp;
        this.btn_Details = btn_Details;
    }
    
    ///Table shipping///
    public CompleteOrder(Date DeliveryStatusDate, String TransporterName, int PackageWeight, BigDecimal PackageShippingCost, String PackageNumber ) {
        this.DeliveryStatusDate = DeliveryStatusDate;
        this.TransporterName = TransporterName;
        this.PackageWeight = PackageWeight;
        this.PackageShippingCost = PackageShippingCost;
        this.PackageNumber = PackageNumber;
    }   
    
    ///Table payment///
    public CompleteOrder(String PaymentStatusTransactionNum, String PaymentCorpName, BigDecimal OrderdataTotalAmount, String OrderdataCustomerIp ) {
        this.PaymentStatusTransactionNum = PaymentStatusTransactionNum;
        this.PaymentCorpName = PaymentCorpName;
        this.OrderdataTotalAmount = OrderdataTotalAmount;
        this.OrderdataCustomerIp = OrderdataCustomerIp;
    }   
    
    
    ///Table Products///
    public CompleteOrder(String CmdLineBookIsbn, int BookPrice, int CmdLineQty, int BookStock, int TotalAmountBookQty ) {
        this.CmdLineBookIsbn = CmdLineBookIsbn;
        this.BookPrice = BookPrice;
        this.CmdLineQty = CmdLineQty;
        this.BookStock = BookStock;
        this.TotalAmountBookQty = TotalAmountBookQty;
        
    }   
    
    ///Email Customer///
    public CompleteOrder(String CustomerMail ) {
        this.CustomerMail = CustomerMail;
    }   

    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
// Init JTable OrdersResume - VALUES
    public Vector getVectorOrdersResume() {
        Vector v = new Vector();
            v.add(this.getOrderdataNum());
            v.add(this.getOrderdataDate());
            v.add(this.getOrderdataInvoice());
            v.add(this.getOrderdataTerms());
            v.add(this.getOrderdataCustomerIp());
            v.add(this.getBtn_Details());
            
            return v;
    }
    
    // Init JTable shipping - VALUES
    public Vector getVectorShipping() {
        Vector v = new Vector();
            v.add(this.getDeliveryStatusDate());
            v.add(this.getTransporterName());
            v.add(this.getPackageWeight());
            v.add(this.getPackageShippingCost());
            v.add(this.getPackageNumber());
            
            return v;
    }
    
   
    
    // Init JTable payment - VALUES
    public Vector getVectorPayment() {
        Vector v = new Vector();
            v.add(this.getPaymentStatusTransactionNum());
            v.add(this.getPaymentCorpName());
            v.add(this.getOrderdataTotalAmount());
            v.add(this.getOrderdataCustomerIp());
            
            return v;
    }
    
    // Init JTable products - VALUES
    public Vector getVectorProducts() {
        Vector v = new Vector();
            v.add(this.getCmdLineBookIsbn());
            v.add(this.getBookPrice());
            v.add(this.getCmdLineQty());
            v.add(this.getBookStock());
            v.add(this.getTotalAmountBookQty());
            
            return v;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    

    public Date getDeliveryStatusDate() {
        return DeliveryStatusDate;
    }

    public void setDeliveryStatusDate(Date DeliveryStatusDate) {
        this.DeliveryStatusDate = DeliveryStatusDate;
    }

    public Date getPaymentStatusDate() {
        return PaymentStatusDate;
    }

    public void setPaymentStatusDate(Date PaymentStatusDate) {
        this.PaymentStatusDate = PaymentStatusDate;
    }

    public String getPackageNumber() {
        return PackageNumber;
    }

    public void setPackageNumber(String PackageNumber) {
        this.PackageNumber = PackageNumber;
    }

    public String getTransporterName() {
        return TransporterName;
    }

    public void setTransporterName(String TransporterName) {
        this.TransporterName = TransporterName;
    }

    public String getPaymentStatusLabel() {
        return PaymentStatusLabel;
    }

    public void setPaymentStatusLabel(String PaymentStatusLabel) {
        this.PaymentStatusLabel = PaymentStatusLabel;
    }

    public JButton getBtn_Details() {
        return btn_Details;
    }

    public void setBtn_Details(JButton btn_Details) {
        this.btn_Details = btn_Details;
    }

    public int getPackageLength() {
        return PackageLength;
    }

    public void setPackageLength(int PackageLength) {
        this.PackageLength = PackageLength;
    }

    public int getPackageHeight() {
        return PackageHeight;
    }

    public void setPackageHeight(int PackageHeight) {
        this.PackageHeight = PackageHeight;
    }

    public int getPackageWidth() {
        return PackageWidth;
    }

    public void setPackageWidth(int PackageWidth) {
        this.PackageWidth = PackageWidth;
    }

    public BigDecimal getPackageShippingCost() {
        return PackageShippingCost;
    }

    public void setPackageShippingCost(BigDecimal PackageShippingCost) {
        this.PackageShippingCost = PackageShippingCost;
    }

    public String getPaymentStatusTransactionNum() {
        return PaymentStatusTransactionNum;
    }

    public void setPaymentStatusTransactionNum(String PaymentStatusTransactionNum) {
        this.PaymentStatusTransactionNum = PaymentStatusTransactionNum;
    }

    public String getCmdLineBookIsbn() {
        return CmdLineBookIsbn;
    }

    public void setCmdLineBookIsbn(String CmdLineBookIsbn) {
        this.CmdLineBookIsbn = CmdLineBookIsbn;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }

    public int getCmdLineQty() {
        return CmdLineQty;
    }

    public void setCmdLineQty(int CmdLineQty) {
        this.CmdLineQty = CmdLineQty;
    }

    public int getBookStock() {
        return BookStock;
    }

    public void setBookStock(int BookStock) {
        this.BookStock = BookStock;
    }

    public int getTotalAmountBookQty() {
        return TotalAmountBookQty;
    }

    public void setTotalAmountBookQty(int TotalAmountBookQty) {
        this.TotalAmountBookQty = TotalAmountBookQty;
    }

    public int getTransporterWeightMax() {
        return TransporterWeightMax;
    }

    public void setTransporterWeightMax(int TransporterWeightMax) {
        this.TransporterWeightMax = TransporterWeightMax;
    }

    public int getTransporterPrice() {
        return TransporterPrice;
    }

    public void setTransporterPrice(int TransporterPrice) {
        this.TransporterPrice = TransporterPrice;
    }

    public BigDecimal getOrderdataTotalAmount() {
        return OrderdataTotalAmount;
    }

    public void setOrderdataTotalAmount(BigDecimal OrderdataTotalAmount) {
        this.OrderdataTotalAmount = OrderdataTotalAmount;
    }

    public String getPaymentCorpName() {
        return PaymentCorpName;
    }

    public void setPaymentCorpName(String PaymentCorpName) {
        this.PaymentCorpName = PaymentCorpName;
    }

    public int getPackageWeight() {
        return PackageWeight;
    }

    public void setPackageWeight(int PackageWeight) {
        this.PackageWeight = PackageWeight;
    }

    public int getValueSelected() {
        return ValueSelected;
    }

    public void setValueSelected(int ValueSelected) {
        this.ValueSelected = ValueSelected;
    }

    public Date getOrderdataDate() {
        return OrderdataDate;
    }

    public void setOrderdataDate(Date OrderDataDate) {
        this.OrderdataDate = OrderDataDate;
    }

    public String getOrderdataInvoice() {
        return OrderdataInvoice;
    }

    public void setOrderdataInvoice(String OrderDataInvoice) {
        this.OrderdataInvoice = OrderDataInvoice;
    }

    public String getOrderdataTerms() {
        return OrderdataTerms;
    }

    public void setOrderdataTerms(String OrderDataTerms) {
        this.OrderdataTerms = OrderDataTerms;
    }

    public String getOrderdataCustomerIp() {
        return OrderdataCustomerIp;
    }

    public void setOrderdataCustomerIp(String OrderdataCustomerIp) {
        this.OrderdataCustomerIp = OrderdataCustomerIp;
    }

    public Long getOrderdataNum() {
        return OrderdataNum;
    }

    public void setOrderdataNum(Long OrderdataNum) {
        this.OrderdataNum = OrderdataNum;
    }

    
    
    
   
    

   

    
}
