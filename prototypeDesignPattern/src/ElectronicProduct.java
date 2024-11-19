public class ElectronicProduct extends Product{

    public int storage;
    public int batteryLife;
    public ElectronicProduct(){

    }

    public ElectronicProduct(ElectronicProduct target) {
        super(target);
        if (target != null) {
            this.storage = target.storage;
            this.batteryLife = target.batteryLife;
        }
    }

    @Override
    public Product clone() {
        return new ElectronicProduct(this);
    }
    public boolean equals(Object object2) {
        if (!(object2 instanceof ElectronicProduct) || !super.equals(object2)) return false;
        ElectronicProduct shape2 = (ElectronicProduct)object2;
        return shape2.storage == storage&& shape2.batteryLife == batteryLife;
    }

}
