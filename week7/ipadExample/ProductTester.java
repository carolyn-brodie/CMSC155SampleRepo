package week7.ipadExample;

public class ProductTester {
    public static void main(String[] args)  {
        Product bigPro = new Product("iPad Pro 12.9", 256);
        Product pro = new Product("iPad Pro 11", 64);
        Product iPad = new Product("iPad", 32);



        System.out.println(bigPro + "\n" + pro + "\n" +
                iPad + "\n" );

        Product2 bigPro2 = new Product2(new IPadPro129(256));
        System.out.println(bigPro2);
    }

}
