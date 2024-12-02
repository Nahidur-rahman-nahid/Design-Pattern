
public class Application {

    private Chair chair;
    private Sofa sofa;
    private Table table;
    public Application(FurnitureFactory factory){




        chair = factory.createChair();
        table = factory.createTable();
        sofa = factory.createSofa();




    }
    public Chair getChair() {
        return chair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Table getTable() {
        return table;
    }

    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFactory();
        Application app = new Application(factory);
        FurnitureFactory factory2= new RusticFactory();
        Application app2 = new Application(factory2);
        Chair chair = app2.getChair();
        //Rustic Family
        chair.identity();

        Table MTable = app.getTable();
        MTable.identity();

    }
}