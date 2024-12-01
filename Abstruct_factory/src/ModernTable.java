public class ModernTable implements Table{

    private int id;
    public ModernTable() {
        this.id = UniqueIDGenerator.getInstance().getNextID();
    }

    public void identity(){
        System.out.println("it's from Modern Family");
    };
}
