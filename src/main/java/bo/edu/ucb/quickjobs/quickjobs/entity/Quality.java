package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Quality")
public class Quality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Quality_id_Quality")
    private Long id;

    @Column(name = "qj_Quality_Quality")
    private String quality;

    @Column(name = "qj_Quality_Comment")
    private String comment;

    @Column(name = "qj_Quality_Status")
    private int status;

    @Column(name = "qj_Quality_tx_user")
    private String user;

    @Column(name = "qj_Quality_tx_host")
    private String host;

    @Column(name = "qj_Quality_tx_date")
    private Date date;

    @Column(name = "qj_Quality_Version")
    private int version;

    public Quality() {
        // Constructor vacío
    }

    public Quality(String quality, String comment, int status, String user, String host, Date date, int version) {
        this.quality = quality;
        this.comment = comment;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Quality{" +
                "id=" + id +
                ", quality='" + quality + '\'' +
                ", comment='" + comment + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
