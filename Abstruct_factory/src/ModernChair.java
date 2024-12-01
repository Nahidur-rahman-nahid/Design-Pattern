public final class  ModernChair  implements Chair{
    private int id;
    public ModernChair(){

        this.id = UniqueIDGenerator.getInstance().getNextID();
    }
    public void identity(){
        System.out.println("it's from Modern Family");
    };
}
