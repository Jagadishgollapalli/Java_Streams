package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ProductApp {
    public static void main(String[] args) {
        List<Products> products = Arrays.asList(
                new Products("Macbook", 2000.0, "Tablet"),
                new Products("Shoes", 50, "Fashion"),
                new Products("Headphones", 150, "Electronics"),
                new Products("Refrigerator", 800, "Appliances")
        );

        /*Predicate -- boolean result*/
        Predicate<Products> priceAbove100 = product -> product.getPrice() > 100;
        /*Function - Input and output*/
        Function<Products, String> productNameUpperCase = product -> product.getName().toUpperCase();
        /*Consumer --no result*/
        Consumer<Products> printProduct = product -> System.out.println(product);
        /*Supplier - no input only supply/output*/
        Supplier<Products> defaultProduct = () -> new Products("Default Product", 0, "None");

        /*print products above price 100*/
        products.stream().filter(priceAbove100).forEach(printProduct);

        /*convert the products to uppercase*/
        products.stream().map(productNameUpperCase).forEach(System.out::println);

        /*Print the products*/
        products.stream().forEach(printProduct);

        /*check for condition if product exist or return default product*/
        boolean exists = products.stream().anyMatch(product -> product.equals("Shoe"));
        if(exists){
            System.out.println("Shoes is found in the product list.");
        }else{
            Products defaultProd = defaultProduct.get();
            System.out.println("Shoes not found. Default Product: " + defaultProd);
        }
    }
}
