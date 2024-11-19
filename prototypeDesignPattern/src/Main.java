import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         PrototypeRegistry cache = new PrototypeRegistry();
         ElectronicProduct electronic1 = (ElectronicProduct) cache.get("Oppo mobile");
         ElectronicProduct el2 =  (ElectronicProduct) cache.get("Oppo mobile");

         Product cloth = cache.get("pant");
         Product electronic2 = cache.get("Oppo mobile");
         if(electronic2 != cloth && !electronic2.equals(cloth)){
             System.out.println("both product are different");
         }
         if(electronic2 != electronic1 && electronic2.equals(electronic1)){
             System.out.println("both electronic product are different");
         }
         if(electronic1.equals(electronic2)){
             System.out.println("identical");
         }
         ClothingProduct cl1 = (ClothingProduct)cache.get("pant") ;
         ClothingProduct cl2 = (ClothingProduct)cache.get("pant");
         cl1.size = 'M';
          electronic1.batteryLife = 4000;
        System.out.println("battery life:" + electronic1.batteryLife + "  clone : " +  el2.batteryLife);


    }
}