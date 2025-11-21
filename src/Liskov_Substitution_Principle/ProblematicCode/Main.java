package Liskov_Substitution_Principle.ProblematicCode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards=new ArrayList<>();
        cards.add(new VisaCard());
        cards.add(new MasterCard());
        cards.add(new RuPayCard());

        upi(cards);
    }
    public static void upi(List<CreditCard> cards){

        for(CreditCard card : cards) {
            if(card instanceof RuPayCard) {
                card.upiPayment();
            }
        }
    }
}