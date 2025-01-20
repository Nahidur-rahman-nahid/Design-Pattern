public class MilkDecorator extends BaseDecorator{


    public MilkDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + " added milk ";
    }

}
