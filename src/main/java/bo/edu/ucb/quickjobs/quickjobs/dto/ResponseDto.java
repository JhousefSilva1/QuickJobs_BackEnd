package bo.edu.ucb.quickjobs.quickjobs.dto;

public class ResponseDto <T> {

    private String Code;

    private T response;

    private String errorMessage;



    public ResponseDto() {
    }

    public ResponseDto(String Code, T response, String errorMessage) {
        this.Code = Code;
        this.response = response;
        this.errorMessage = errorMessage;
    }

    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public T getResponse() {
        return this.response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override

    public String toString() {
        return "{" +
            " Code='" + getCode() + "'" +
            ", response='" + getResponse() + "'" +
            ", errorMessage='" + getErrorMessage() + "'" +
            "}";
    }





}
