package exercise1.chain_Behavioral;

 // Handler.java
public interface Handler {
    void setNext(Handler handler);
    void process(Request request);
}
