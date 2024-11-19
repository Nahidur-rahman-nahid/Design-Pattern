public class Book implements LibraryItem{
    private String bookName;
    private int itemId;
    private String author;


    public Book(String bookName,int itemId,String author) {
        this.bookName = bookName;
        this.itemId = itemId;
        this.author = author;

    }



    @Override
    public void getDetails() {
        System.out.println(
                "BookName = " + bookName + " and itemID : " + itemId
                );

    }

    @Override
    public void borrowItem() {
        System.out.println(bookName + "  is borrowing");
    }
}
