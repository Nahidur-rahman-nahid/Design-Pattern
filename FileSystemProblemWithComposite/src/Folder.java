import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private List<FileSystemComponent> components = new ArrayList<>();
    private String name;
    public Folder(String name){
        this.name = name;
    }
    public void add(FileSystemComponent component){
        components.add(component);
    }
    public void remove(FileSystemComponent component){
        components.remove(component);
    }


    public void search(String keyword){
        System.out.println("now searching in folder " + name );
        for(FileSystemComponent child : components){
             child.search(keyword);
        }
    }

    public void display(){
        for(FileSystemComponent child : components){
            System.out.println(child);
        }
    }




}
