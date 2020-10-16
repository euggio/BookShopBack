
package BookShop.Class;

import java.util.Objects;

public class StatusType {
    
    private Long StatusTypeID;
    private String StatusTypeLabel;

    public StatusType() {
    }

    public StatusType(Long StatusTypeID, String StatusTypeLabel) {
        this.StatusTypeID = StatusTypeID;
        this.StatusTypeLabel = StatusTypeLabel;
    }

    public Long getStatusTypeID() {
        return StatusTypeID;
    }

    public void setStatusTypeID(Long StatusTypeID) {
        this.StatusTypeID = StatusTypeID;
    }

    public String getStatusTypeLabel() {
        return StatusTypeLabel;
    }

    public void setStatusTypeLabel(String StatusTypeLabel) {
        this.StatusTypeLabel = StatusTypeLabel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.StatusTypeID);
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
        final StatusType other = (StatusType) obj;
        if (!Objects.equals(this.StatusTypeID, other.StatusTypeID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return StatusTypeLabel;
    }
    
    
    
}
