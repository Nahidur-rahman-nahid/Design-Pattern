import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
       private Map<String,Product> cache = new HashMap<>();

       public PrototypeRegistry(){
           ClothingProduct A = new ClothingProduct();
           A.name = "Denim";
           A.category = 'a';
           A.price = 200;
           A.size = 'L';
           A.color = "red";

           ElectronicProduct B = new ElectronicProduct();
           B.batteryLife = 5000;
           B.storage = 8;

           B.name = "Oppo";
           B.category = 'a';
           B.price = 20000;
           cache.put("Oppo mobile",B);
           cache.put("pant",A);



       }
       public Product put(String key,Product product){
           cache.put(key,product);
           return product;
       }
       public Product get(String key){
           return cache.get(key).clone();
       }


}
