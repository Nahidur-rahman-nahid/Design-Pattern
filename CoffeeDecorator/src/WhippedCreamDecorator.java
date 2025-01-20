import java.nio.file.attribute.BasicFileAttributeView;

public class WhippedCreamDecorator extends BaseDecorator {
    public WhippedCreamDecorator(Coffee decorator) {
        super(decorator);
    }
    public String getDescription() {
        return super.getDescription() + ",WhippedCreamDecorator";
    }

}
