package BookShop.Author;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author euggio
 */
public class AllAuthors 
{
    
    /**
     * Multi-args constructor
     * @param authorId the author ID
     * @param authorFirstname the author firstname
     * @param authorLastname the author lastname
     * @param authorBirthdate the author birthdate
     * @param authorDeathDate the author deathdate
     * @param authorStatus the author status
     */
    public AllAuthors(Long authorId, String authorFirstname, String 
        authorLastname, Date authorBirthdate, Date authorDeathDate, 
                                                            String authorStatus) 
    {
        this.authorId = authorId;
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.authorBirthdate = authorBirthdate;
        this.authorDeathdate = authorDeathDate;
        this.authorStatus = authorStatus;
    }
    
    /**
     * Puts author data in a vector
     * @return the vector
     */
    public Vector getVector() 
    {
        Vector v = new Vector();
            v.add(authorId);
            v.add(authorFirstname);
            v.add(authorLastname);
            v.add(authorBirthdate);
            v.add(authorDeathdate);
            v.add(authorStatus);
            
            return v;
    }

    /**
     * Gets an author ID
     * @return the ID
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * Sets an author ID
     * @param authorId the author ID
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * Gets an author's lastname
     * @return the author's last name
     */
    public String getAuthorLastname() {
        return authorLastname;
    }

    /**
     * Sets an author's lastname
     * @param authorLastname the author's lastname
     */
    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    /**
     * Gets an author's firstname
     * @return the author's firstname
     */
    public String getAuthorFirstname() {
        return authorFirstname;
    }

    /**
     * Sets an author's firstname
     * @param authorFirstname the author's firstname
     */
    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    /**
     * Gets an author's birthdate
     * @return the author's birthdate
     */
    public Date getAuthorBirthdate() {
        return authorBirthdate;
    }

    /**
     * Sets an author's birthdate
     * @param authorBirthdate the author's birthdate
     */
    public void setAuthorBirthdate(Date authorBirthdate) {
        this.authorBirthdate = authorBirthdate;
    }

    /**
     * Gets an author's deathdate
     * @return the author's deathdate
     */
    public Date getAuthorDeathdate() {
        return authorDeathdate;
    }

    /**
     * Sets an author's deathdate
     * @param authorDeathdate the author's deathdate
     */
    public void setAuthorDeathdate(Date authorDeathdate) {
        this.authorDeathdate = authorDeathdate;
    }
    
    /**
     * Gets an author's status
     * @return the author's status
     */
    public String getAuthorStatus() {
        return authorStatus;
    }
    
    /**
     * Sets an author's status
     * @param authorStatus the author's status
     */
    public void setAuthorStatus(String authorStatus) {
        this.authorStatus = authorStatus;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authorId != null ? authorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AllAuthors)) {
            return false;
        }
        AllAuthors other = (AllAuthors) object;
        if ((this.authorId == null && other.authorId != null) || (this.authorId 
                            != null && !this.authorId.equals(other.authorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + authorId;
    }
    
    // PRIVATE FIELDS ----------------------------------------------------------
    private Long authorId;
    private String authorFirstname;
    private String authorLastname;
    private Date authorBirthdate;
    private Date authorDeathdate;
    private String authorStatus;
}
