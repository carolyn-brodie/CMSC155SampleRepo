package week7.ipadExample;

public class ProductTester {
    public static void main(String[] args)  {
        Product bigPro = new Product("iPad Pro 12.9", 256, "cellular" );
        Product pro = new Product("iPad Pro 11", 64, "not cellular");
        Product iPad = new Product("iPad", 32, "cellular");



        System.out.println(bigPro + "\n" + pro + "\n" +
                iPad + "\n" );


    }

}
