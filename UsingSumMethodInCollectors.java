import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingSumMethodInCollectors {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);

        Double sumPrices = productList.stream()
                .collect(Collectors.summingDouble(p -> p.price));

        System.out.println("Total Price : " + sumPrices);

        Integer sumId = productList.stream()
                .collect(Collectors.summingInt(p -> p.id));

        System.out.println("Sum of ID : " + sumId);

    }
}
