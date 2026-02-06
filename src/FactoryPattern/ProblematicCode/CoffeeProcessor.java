package FactoryPattern.ProblematicCode;


public class CoffeeProcessor {

    public Coffee prepareCoffee(String whichCoffee) {
        Coffee coffee;
        if(whichCoffee.equals("Espresso")) {
            coffee = new Espresso();
        } else if(whichCoffee.equals("Latte")) {
            coffee = new Latte();
        } else {
            coffee = new Cappucino();
        }

        return coffee;
    }

}