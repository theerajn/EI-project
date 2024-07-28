package Behavioral_chain;

 // Handler.java
public interface Handler {
    void setNext(Handler handler);
    void process(Request request);
}
