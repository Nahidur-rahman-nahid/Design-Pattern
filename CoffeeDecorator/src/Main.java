import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription());
        //added milk
        Coffee milkcoffee = new MilkDecorator(coffee);
        System.out.println(milkcoffee.getDescription());
        Coffee sugarCoffee = new SugarDecorator(milkcoffee);
        System.out.println(sugarCoffee.getDescription());
        Coffee whippedCreamCoffee = new WhippedCreamDecorator(sugarCoffee);
        System.out.println(whippedCreamCoffee.getDescription());

        System.out.println("different combination : ");
        Coffee coffee1 = new PlainCoffee();
        coffee1 = new SugarDecorator(coffee1);
        System.out.println( coffee1.getDescription());




    }
}