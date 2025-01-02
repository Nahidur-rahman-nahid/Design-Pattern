public class File implements FileSystemComponent{
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void search(String keyword){
        if(content.contains(keyword)){
            System.out.println("The given keyword : " + keyword + " is found in " + name);
        }
    }
    public void display(){
        System.out.println("  The file name is " + name + " and the content it is carrying : " + content);
    }

}
