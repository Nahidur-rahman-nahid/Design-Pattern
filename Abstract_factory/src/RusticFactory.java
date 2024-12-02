public class RusticFactory implements FurnitureFactory{
    public Chair createChair(){
        return new RusticChair();
    }
    public Table createTable(){
      return new RusticTable()  ;
    }

    public Sofa createSofa(){
        return new RusticSofa();
    }
}
