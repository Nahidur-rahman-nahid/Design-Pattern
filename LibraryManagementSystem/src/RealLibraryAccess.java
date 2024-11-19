public class RealLibraryAccess implements LibraryAccess{
    @Override
    public boolean accessItem(int itemId, User user) {
        System.out.println("accessing item :" + itemId);
        return true;
    }
}
