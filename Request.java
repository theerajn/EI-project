// Request.java
package Behavioral_chain;

public class Request {
    private String data;
    private String errorMessage;

    public Request(String data) {
        this.data = data;
        this.errorMessage = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
