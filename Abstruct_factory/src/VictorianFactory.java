public class VictorianFactory implements FurnitureFactory{

    public Chair createChair(){
        return new VictorianChair();
    };
    public Table createTable(){
        return new VictorianTable();
    };
    public Sofa createSofa(){
        return new VictorianSofa();
    };
}
