public class Application {
    public static void main(String[] args) {
        LibraryProductFactory bookFactory = new BookFactory();
        LibraryProductFactory magazineFactory = new MagazineFactory();

        Book book =  (Book) bookFactory.createItem("1984",101,"george");
        Magazine magazine = (Magazine)magazineFactory.createItem("Tech Today",102,"nahid");
      //getting detail
       book.getDetails();
       magazine.getDetails();

        // Step 3: Proxy example
        User userWithAccess = new User("Alice", true);
        User userWithoutAccess = new User("Bob", false);

        LibraryAccess libraryAccess = new LibraryAccessProxy();
        libraryAccess.accessItem(101, userWithAccess);
        book.borrowItem();
        libraryAccess.accessItem(102, userWithoutAccess);


        LibraryConfigManager config = LibraryConfigManager.getInstance();
        System.out.println("Library hours: " + config.getOpeningHours());
        config.setOpeningHours("8 AM - 8 PM");
        System.out.println("Updated library hours: " + config.getOpeningHours());

    }
}