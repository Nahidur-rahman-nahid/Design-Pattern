abstract class Product {
    public String name;
    public char category;
    public int price;
    public Product(){}

    public Product(Product target){
         if(target != null){
             this.name = target.name;
             this.category = target.category;
             this.price = target.price;
         }
    }
    public  abstract Product clone();
    public boolean equals(Object object2) {
        if (!(object2 instanceof Product)) return false;
        Product shape2 = (Product) object2;
        return shape2.name == name && shape2.category == category ;
    }


}
