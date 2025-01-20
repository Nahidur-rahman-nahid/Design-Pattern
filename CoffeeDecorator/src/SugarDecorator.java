public class SugarDecorator extends BaseDecorator{

    public SugarDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return super.getDescription() + ",sugar";
    }
}
