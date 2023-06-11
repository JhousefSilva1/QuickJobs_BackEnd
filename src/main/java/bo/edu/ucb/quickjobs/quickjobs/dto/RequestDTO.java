package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.sql.Date;
import java.sql.Time;

public class RequestDTO {

    private int requestId;
    private int personId;
    private Date beginDate;
    private Date endDate;
    private Time beginHour;
    private Time endHour;
    private int totallyHours;
    private int priceHour;
    private String statusRequest;

    // Constructor sin argumentos
    public RequestDTO() {
    }

    // Constructor con todos los campos
    public RequestDTO(int requestId, int personId, Date beginDate, Date endDate, Time beginHour,
                      Time endHour, int totallyHours, int priceHour, String statusRequest) {
        this.requestId = requestId;
        this.personId = personId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.beginHour = beginHour;
        this.endHour = endHour;
        this.totallyHours = totallyHours;
        this.priceHour = priceHour;
        this.statusRequest = statusRequest;
    }

    // Getter y Setter para requestId
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    // Getter y Setter para personId
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    // Getter y Setter para beginDate
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    // Getter y Setter para endDate
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // Getter y Setter para beginHour
    public Time getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(Time beginHour) {
        this.beginHour = beginHour;
    }

    // Getter y Setter para endHour
    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    // Getter y Setter para totallyHours
    public int getTotallyHours() {
        return totallyHours;
    }

    public void setTotallyHours(int totallyHours) {
        this.totallyHours = totallyHours;
    }

    // Getter y Setter para priceHour
    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }

    // Getter y Setter para statusRequest
    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }

    // toString
    @Override
    public String toString() {
        return "RequestDTO{" +
                "requestId=" + requestId +
                ", personId=" + personId +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", beginHour=" + beginHour +
                ", endHour=" + endHour +
                ", totallyHours=" + totallyHours +
                ", priceHour=" + priceHour +
                ", statusRequest='" + statusRequest + '\'' +
                '}';
    }
}
