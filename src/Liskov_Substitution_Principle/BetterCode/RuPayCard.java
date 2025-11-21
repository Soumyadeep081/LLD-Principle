package Liskov_Substitution_Principle.BetterCode;

public class RuPayCard extends CreditCard implements UpiCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RuPayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RuPayCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of RuPayCard");
    }

    @Override
   public void upiPayment(){
        System.out.println("UPI payment impl of RuPay");
    }
}
