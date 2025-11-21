package Liskov_Substitution_Principle.BetterCode;

public class VisaCard extends CreditCard implements InternationalPaymentCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of VisaCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of VisaCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of VisaCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of VisaCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("Intl payment impl of VisaCard");
    }

}
