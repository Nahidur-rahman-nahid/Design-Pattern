import java.util.Collection;
import java.util.Collections;

public class ClothingProduct extends Product{
    public String color;
    public char size;
    public ClothingProduct(){

    }
    public ClothingProduct(ClothingProduct target) {
        super(target);
        if (target != null) {
            this.color = target.color;
            this.size= target.size;
        }
    }

    @Override
    public Product clone() {
        return new ClothingProduct(this);
    }
    public boolean equals(Object object2) {
        if (!(object2 instanceof ClothingProduct) || !super.equals(object2)) return false;
        ClothingProduct A = (ClothingProduct) object2;
        return A.size == size ;
    }
}
