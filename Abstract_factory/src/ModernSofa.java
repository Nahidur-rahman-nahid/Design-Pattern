public class ModernSofa implements Sofa{
    private int id;
    public ModernSofa() {
        this.id = UniqueIDGenerator.getInstance().getNextID();
    }
    public void identity(){
        System.out.println("it's from Modern Family");
    };
}
