package BookShop.Book;

import java.math.BigDecimal;
import java.util.Vector;

public class CompleteBook 
{
    private String bookIsbn;
    private String bookSubtitle;
    private String bookTitle;
    private String bookAuthor;
    private String bookCategory;
    private String bookSubcategory;
    private String bookPublisher;
    private String bookStatus;
    private BigDecimal bookPrice;
    private int bookStock;
    private String bookSummary;
    
    public CompleteBook(String bookIsbn, String bookTitle, String bookAuthor, String bookSubcategory, BigDecimal bookPrice) {
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookSubcategory = bookSubcategory;
        this.bookPrice = bookPrice;
    }
    
    public CompleteBook(String bookIsbn, String bookTitle, String bookAuthor, String bookSubcategory, BigDecimal bookPrice, String bookStatus) {
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookSubcategory = bookSubcategory;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
    }
    
    public CompleteBook(String bookTitle, String bookSubtitle, String bookAuthor, String bookSubcategory, String bookCategory, String bookPublisher, BigDecimal bookPrice, int bookStock) {
        this.bookTitle = bookTitle;
        this.bookSubtitle = bookSubtitle;
        this.bookAuthor = bookAuthor;
        this.bookSubcategory = bookSubcategory;
        this.bookCategory = bookCategory;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
        this.bookStock = bookStock;
    }

    public CompleteBook(String bookIsbn, String bookTitle, String bookSubtitle, String bookAuthor, String bookSubcategory, String bookPublisher, BigDecimal bookPrice, int bookStock, String bookSummary) {
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookSubtitle = bookSubtitle;
        this.bookAuthor = bookAuthor;
        this.bookSubcategory = bookSubcategory;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
        this.bookStock = bookStock;
        this.bookSummary = bookSummary;
    }

    public Vector getVector() {
        Vector v = new Vector();
            v.add(bookIsbn);
            v.add(bookTitle);
            v.add(bookAuthor);
            v.add(bookSubcategory);
            v.add(bookPrice);  
            v.add(bookStatus);
            return v;
    }

    public Vector getVectorBP() {
        Vector v = new Vector();
            v.add(bookIsbn);
            v.add(bookTitle);
            v.add(bookCategory);
            v.add(bookSubcategory);
            v.add(bookAuthor);  
            return v;
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

    public String getBookSubtitle() {
        return bookSubtitle;
    }

    public void setBookSubtitle(String bookSubtitle) {
        this.bookSubtitle = bookSubtitle;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }
    
    public String getBookAuthor() {
        return bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    public String getBookSubcategory() {
        return bookSubcategory;
    }

    public void setBookSubcategory(String bookSubcategory) {
        this.bookSubcategory = bookSubcategory;
    }
    
    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
 
    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }
    
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookIsbn != null ? bookIsbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompleteBook)) {
            return false;
        }
        CompleteBook other = (CompleteBook) object;
        if ((this.bookIsbn == null && other.bookIsbn != null) || (this.bookIsbn != null && !this.bookIsbn.equals(other.bookIsbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookShop.Class.Book[ bookIsbn=" + bookIsbn + " ]";
    }
}
