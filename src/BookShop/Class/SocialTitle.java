
package BookShop.Class;

import java.util.Objects;

public class SocialTitle {
    private Long SocialtitleId;
    private String SocialtitleLabel;

    public SocialTitle() {
    }

    public SocialTitle(Long SocialtitleId, String SocialtitleLabel) {
        this.SocialtitleId = SocialtitleId;
        this.SocialtitleLabel = SocialtitleLabel;
    }

    public Long getSocialtitleId() {
        return SocialtitleId;
    }

    public void setSocialtitleId(Long SocialtitleId) {
        this.SocialtitleId = SocialtitleId;
    }

    public String getSocialtitleLabel() {
        return SocialtitleLabel;
    }

    public void setSocialtitleLabel(String SocialtitleLabel) {
        this.SocialtitleLabel = SocialtitleLabel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.SocialtitleId);
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
        final SocialTitle other = (SocialTitle) obj;
        if (!Objects.equals(this.SocialtitleId, other.SocialtitleId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return SocialtitleLabel;
    }
    
    
    
}
