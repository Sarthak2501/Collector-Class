import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    static void ProductAdder(List<Product> productList) {
        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenovo Laptop",28000f));
        productList.add(new Product(4, "Sony Laptop" , 28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));
    }

}
