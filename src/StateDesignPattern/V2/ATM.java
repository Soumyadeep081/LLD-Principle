package StateDesignPattern.V2;


public class ATM {
    private final String deviceId;
    private ATMState state;


    public ATM(String deviceId) {
        this.deviceId = deviceId;
        this.state = new ReadyState(this);
    }

    public String init() {
        return this.state.init();
    }

    public void changeState(ATMState state) {
        this.state = state;
    }

    public boolean cancel(String txnId) {
        return this.state.cancelTxn(txnId);
    }
}