public class MagazineFactory implements LibraryProductFactory{
    @Override
    public LibraryItem createItem(String itemName,int itemId, String author) {
             return new Magazine(itemName,itemId,author);
    }
}
