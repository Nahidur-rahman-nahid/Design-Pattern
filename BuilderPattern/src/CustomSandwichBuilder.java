public class CustomSandwichBuilder implements SandwichBuilder{
    private Sandwich sandwich = new Sandwich();


    public void setBread(String bread) {
        sandwich.setBread(bread);

    }

    public void setFilling(String filling) {
        sandwich.setFilling(filling);

    }

    public void setAccompaniment(String accompaniment) {
        sandwich.setAccompaniment(accompaniment);

    }

    public Sandwich getResult() { return sandwich; }

}
