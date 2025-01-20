public class BaseDecorator implements Coffee{
    private Coffee decorator;
    public BaseDecorator(Coffee decorator){
        this.decorator = decorator;
    }
    public String getDescription() {
        return  decorator.getDescription();
    }
}
