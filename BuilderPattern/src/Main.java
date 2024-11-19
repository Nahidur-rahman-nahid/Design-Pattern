import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Sandwich>  menu = new ArrayList<>();
        Director director = new Director();
        SandwichBuilder chickenSandwichbuilder = new ChickenSandwichBuilder();
        director.constructChickenSandwich(chickenSandwichbuilder);
        Sandwich chickenSandwich = chickenSandwichbuilder.getResult();
        menu.add(chickenSandwich);
        SandwichBuilder eggSandwichBuilder = new EggSandwichBuilder();
        director.constructEggSandwich(eggSandwichBuilder);
        Sandwich eggSandwich = eggSandwichBuilder.getResult();
        menu.add(eggSandwich);

        System.out.println("menu regular : ");
        System.out.println(menu);
        CustomSandwichBuilder customSandwichBuilder = new CustomSandwichBuilder();

        // set korchi according to customer will

        customSandwichBuilder.setBread("toastedBread");
        customSandwichBuilder.setAccompaniment("tangy Flavour sauce");
        customSandwichBuilder.setFilling("Beef");
        Sandwich customSandwich = customSandwichBuilder.getResult();
        menu.add(customSandwich);
        System.out.println("After adding custom sandwich : ");
        System.out.println(menu);






    }
}