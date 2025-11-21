package Liskov_Substitution_Principle.BetterCode;
import Liskov_Substitution_Principle.ProblematicCode.CreditCard;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        cards.add(new VisaCard());
        cards.add(new MasterCard());

        intl(cards);
    }
    public static void intl(List<InternationalPaymentCompatibleCreditCard> cards){

        for(InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
