public class Magazine implements LibraryItem{
    private String magazineName;
    private int itemId;
    private String author;
    public Magazine(String magazineName,int itemId,String author) {
        this.magazineName = magazineName;
        this.itemId = itemId;
        this.author = author;
    }

    @Override
    public void getDetails() {
        System.out.println("Magazine name is : " + magazineName + "  and item id is " + itemId);


    }

    @Override
    public void borrowItem() {
        System.out.println(magazineName + "is borrowing");
    }
}
