public class LibraryAccessProxy implements LibraryAccess {

    private RealLibraryAccess realLibraryAccess = new RealLibraryAccess();
    public boolean accessItem(int itemId,User user){
        if(user.hasPermission()){
            return realLibraryAccess.accessItem(itemId,user);

        }else {
            System.out.println("Access denied for " + user.getName());
            return false;
        }
    }

}
