public class Director {
    public void constructChickenSandwich(SandwichBuilder builder) {
        builder.setBread("Regular Bread");
        builder.setFilling("Grilled Chicken");
        builder.setAccompaniment("Cheese");
    }

    public void constructEggSandwich(SandwichBuilder builder) {
        builder.setBread("Toasted Bread");
        builder.setFilling("Fried Egg");
        builder.setAccompaniment("Sauce");
    }
}
