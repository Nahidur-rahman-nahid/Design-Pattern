public class ModernFactory implements FurnitureFactory{

    public Chair createChair(){
        return new ModernChair();
    }
    public Table createTable(){
        return new ModernTable();
    }
    public Sofa createSofa(){
        return new ModernSofa();
    }
}
