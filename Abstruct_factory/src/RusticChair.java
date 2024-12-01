import com.sun.security.auth.UnixNumericUserPrincipal;

public class RusticChair implements Chair {
    private final int id;
    public RusticChair(){
        this.id = UniqueIDGenerator.getInstance().getNextID();
    }
    public void identity(){
        System.out.println("it's from Rustic Family");
    };
}
