package supermarket;

import java.util.ArrayList;

public class Supermarket {

    private final ArrayList<Section> sections;

    public Supermarket() {
        this.sections = new ArrayList<>();
    }

    public void createSection(Section section) {
        this.sections.add(section);
    }

    public void listProducts() {
       for (Section s : sections){
           System.out.println(s.getName());
           s.listProducts();
       }
    }

    public void listProductsByType(ProductType type) {
        for (Section s : sections){
              System.out.println(s.getName() + " - " + type);
              s.listProductsByType(type);
        }
    }

    public Product deleteProduct(String id){
        Product deletedProduct = null;
        int i = 0;
        while(i < sections.size() && deletedProduct == null){
            deletedProduct = sections.get(i).deleteProduct(id);
            i++;
        }
       return deletedProduct;
    }

    public void listPercentageByType(ProductType type, String sectionName) {
        int i = 0;
        while(i < sections.size()){
            if (sections.get(i).getName().equals(sectionName)){
                System.out.println(sections.get(i).getName() + " - " + type);
                System.out.println(sections.get(i).listPercentageByType(type) + "%");
            }
            i++;
        }
    }

}
