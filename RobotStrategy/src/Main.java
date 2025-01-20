public class Main {
    public static void main(String[] args) {
        // Create behaviors
        Behavior aggressive = new AggressiveBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();


        Robot robot1 = new Robot("Robot1", aggressive);
        Robot robot2 = new Robot("Robot2", defensive);
        Robot robot3 = new Robot("Robot3", normal);


        robot1.performAction();
        robot2.performAction();
        robot3.performAction();

        // Change behaviors dynamically
        System.out.println("\nChanging behaviors dynamically...");
        robot1.setBehavior(defensive);
        robot2.setBehavior(normal);
        robot3.setBehavior(aggressive);

        // Simulate actions after behavior change
        robot1.performAction();
        robot2.performAction();
        robot3.performAction();

    }
}