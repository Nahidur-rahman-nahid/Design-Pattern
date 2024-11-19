public class Main {
    public static void main(String[] args) {

            Image photo1 = new ProxyImage("photo1.jpg");
            Image photo2 = new ProxyImage("photo2.jpg");

            // without loading
            System.out.println("photo1 : " +  "photo1.jpg");

            // Load and display only when user selects
            photo1.display();
            photo2.display();


    }
}