package BookShop.Publisher;

import java.util.Vector;

public class CompletePublisher
{
    private Long publisherId;
    private String publisherName;
    private String publisherMail;
    private String publisherContactName;
    private String publisherStatus;
    
    public CompletePublisher(Long publisherId, String publisherName, String publisherMail, String publisherContactName, String publisherStatus) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherMail = publisherMail;
        this.publisherContactName = publisherContactName;
        this.publisherStatus = publisherStatus;
    }

    public Vector getVector() {
        Vector v = new Vector();
            v.add(publisherId);
            v.add(publisherName);
            v.add(publisherMail);
            v.add(publisherContactName);     
            v.add(publisherStatus);
            return v;
    }
        
    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherMail() {
        return publisherMail;
    }

    public void setPublisherMail(String publisherMail) {
        this.publisherMail = publisherMail;
    }

    public String getPublisherContactName() {
        return publisherContactName;
    }

    public void setPublisherContactName(String publisherContactName) {
        this.publisherContactName = publisherContactName;
    }

    public String getPublisherStatus() {
        return publisherStatus;
    }

    public void setPublisherStatus(String publisherStatus) {
        this.publisherStatus = publisherStatus;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (publisherId != null ? publisherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompletePublisher)) {
            return false;
        }
        CompletePublisher other = (CompletePublisher) object;
        if ((this.publisherId == null && other.publisherId != null) || (this.publisherId != null && !this.publisherId.equals(other.publisherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + publisherId;
    }
}
