package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.Date;

public class ErrorDetails {
    private Date timestampDate;
    private String message;
    private String details;

    public Date getTimestampDate() {
        return timestampDate;
    }

    public void setTimestampDate(Date timestampDate) {
        this.timestampDate = timestampDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ErrorDetails(Date timestampDate, String message, String details) {
        this.timestampDate = timestampDate;
        this.message = message;
        this.details = details;
    }
}
