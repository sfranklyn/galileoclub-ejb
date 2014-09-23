/*
 * News.java
 * 
 * Created on Feb 2, 2009, 11:10:24 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "news", catalog = "galileoclub", schema = "",
uniqueConstraints = {@UniqueConstraint(columnNames = {"news_date"})})
@NamedQueries({
    @NamedQuery(name = "News.selectAll",
    query = "SELECT n FROM News n ORDER BY n.newsDate DESC"),
    @NamedQuery(name = "News.selectAllCount",
    query = "SELECT COUNT(n) FROM News n")
})
public class News implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "news_id", nullable = false)
    private Integer newsId;
    @Basic(optional = false)
    @Column(name = "news_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date newsDate;
    @Basic(optional = false)
    @Lob
    @Column(name = "news_text", nullable = false, length = 65535)
    private String newsText;
    @Column(name = "news_status")
    private Character newsStatus;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    @ManyToOne(optional = false)
    private Users userId;
    

    public News() {
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MMM-yyyy HH:mm:ss");
        return dtf.print(newsDate.getTime());
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public Character getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(Character newsStatus) {
        this.newsStatus = newsStatus;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsId != null ? newsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof News)) {
            return false;
        }
        News other = (News) object;
        if ((this.newsId == null && other.newsId != null) || (this.newsId != null && !this.newsId.equals(other.newsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
