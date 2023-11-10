public class ShoppingCart {
    Set<String> userCart = new HashSet<>(Arrays.asList("Laptop", "Phone", "Tablet", "Headphones"));
    Set<String> productsOnSale = new HashSet<>(Arrays.asList("Phone", "Headphones", "Speaker", "Mouse"));

    //Union Operation
    Set<String> combinedProducts = new HashSet<>(userCart);
combinedProducts.addAll(productsOnSale);
System.out.println("Combined products in the cart and on sale: " + combinedProducts);
//Intersection Operation

    Set<String> commonProducts = new HashSet<>(userCart);
commonProducts.retainAll(productsOnSale);
System.out.println("Common products in the cart and on sale: " + commonProducts);

//Difference operations
    Set<String> productsNotOnSale = new HashSet<>(userCart);
productsNotOnSale.removeAll(productsOnSale);
System.out.println("Products in the cart but not on sale: " + productsNotOnSale);
}
