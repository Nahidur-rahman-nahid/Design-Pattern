public class BookFactory implements LibraryProductFactory{
    @Override
    public LibraryItem createItem(String itemName, int itemId, String author){
        return new Book(itemName,itemId,author);
    }
}
