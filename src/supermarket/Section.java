package supermarket;

import java.util.ArrayList;

public class Section {
   private final String name;
   private final ArrayList<Product> products;

   public Section(String name) {
       this.name = name;
       this.products = new ArrayList<>();
   }

    public String getName() {
        return name;
    }

    public void createProduct(Product product) {
        this.products.add(product);
    }

    public void listProducts() {
       for (Product p : products){
           System.out.println(p);
       }
    }

    public void listProductsByType(ProductType type) {
        for (Product p : products){
            if(p.getType() == type){
                System.out.println(p);
            }
        }
    }

    public double listPercentageByType(ProductType type) {
       int amount = 0;
       double percentage;
        for (Product p : products){
            if(p.getType() == type){
                amount++;
            }
        }
        percentage = 100 * ((double) amount / products.size());

        return percentage;
    }

    public Product deleteProduct(String id){
       Product deletedProduct = null;
       int i = 0;
       while(i < products.size() && deletedProduct == null){
           if(products.get(i).getId().equals(id)){
               deletedProduct = products.remove(i);
           }
           i++;
       }

       return deletedProduct;

    }
}
