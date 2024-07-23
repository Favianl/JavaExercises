package supermarket;

public class Main {
    public static void main(String[] args) {
        //Create a supermarket
        //Create sections in the supermarket
        //Create products by type in the sections
        //List all products
        //Delete a product
        //List products by type
        //Show percentage of a product type in a section

        Supermarket sm = new Supermarket();
        Section s1 = new Section("Section A");
        Section s2 = new Section("Section B");
        Section s3 = new Section("Section C");

        s1.createProduct(new Product("zz1a2","beer",13.5,ProductType.DRINK));
        s1.createProduct(new Product("a822k8","soda",20,ProductType.DRINK));
        s1.createProduct(new Product("2b333k8","bread",35,ProductType.BAKERY));
        s1.createProduct(new Product("6c444k8","cake",89,ProductType.BAKERY));

        s2.createProduct(new Product("8k8mm33","banana",4,ProductType.FRUIT));
        s2.createProduct(new Product("8lbn833","apple",3,ProductType.FRUIT));
        s2.createProduct(new Product("ddd33","chicken",38,ProductType.MEAT));
        s2.createProduct(new Product("d0e9j3","fish",29,ProductType.MEAT));

        s3.createProduct(new Product("8k8s8s833","orange",4,ProductType.FRUIT));
        s3.createProduct(new Product("dhh7dd33","beef",58,ProductType.MEAT));
        s3.createProduct(new Product("6ccc66k8","cookie",9,ProductType.BAKERY));
        s3.createProduct(new Product("807665k8","water",2,ProductType.DRINK));

        sm.createSection(s1);
        sm.createSection(s2);
        sm.createSection(s3);

        System.out.println("----- List ---------");
        sm.listProducts();
        System.out.println("------- Delete a Product -------");
        System.out.println("Deleted -> " + sm.deleteProduct("8lbn833"));
        System.out.println("------ List by Type --------");
        sm.listProductsByType(ProductType.DRINK);
        System.out.println("-----Percentage by Type---------");
        sm.listPercentageByType(ProductType.BAKERY, "Section B");

    }
}