package bo.edu.ucb.quickjobs.quickjobs.util;

public class QuickJobsException extends RuntimeException{
    public QuickJobsException(String message) {
        super(message);
    }

    public QuickJobsException(String message, Throwable cause) {
        super(message, cause);
    }
}
