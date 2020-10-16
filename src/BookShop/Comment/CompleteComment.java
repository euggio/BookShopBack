package BookShop.Comment;

import BookShop.Book.CompleteBook;
import java.util.Vector;

public class CompleteComment 
{
    Long customerId;
    String customerMail;
    String commentScore;
    String commentText;
    String customerIp;

    public CompleteComment(Long customerId, String customerMail, String commentScore, String commentText, String customerIp)
    {
        this.customerId = customerId;
        this.customerMail = customerMail;
        this.commentScore = commentScore;
        this.commentText = commentText;
        this.customerIp = customerIp;
    }
    
    public Vector getVector() {
        Vector v = new Vector();
            v.add(customerId);
            v.add(customerMail);
            v.add(commentScore);
            v.add(commentText);
            v.add(customerIp);
            return v;
    }
    
    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public String getCommentScore() {
        return commentScore;
    }

    public String getCommentText() {
        return commentText;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public void setCommentScore(String commentScore) {
        this.commentScore = commentScore;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompleteBook)) {
            return false;
        }
        CompleteComment other = (CompleteComment) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookShop.Class.Comment[ customerId=" + customerId + " ]";
    }
    
}
