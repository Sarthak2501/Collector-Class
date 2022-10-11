import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAsList {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Product> productList = new ArrayList<Product>();


        Product.ProductAdder(productList);


        List<Float> productPriceList = productList.stream()
                .map(p -> p.price)//fetching price
                .collect(Collectors.toList());//collecting price in list

        System.out.println(productPriceList);

        List<String> productNameList = productList.stream()
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(productNameList);
    }
}