import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountingElements {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product.ProductAdder(productList);

        Long noOfElement = productList.stream()
                .collect(Collectors.counting());

        System.out.println("Total Number of Products : " + noOfElement);


    }


}
