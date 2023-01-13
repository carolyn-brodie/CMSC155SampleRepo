package week3;

public class NoConstructor {

    private int x = 0;
    public String toString() {
        return x + "";   // Why is + "" used here?
    }


    public static void main(String[] args) {

        NoConstructor var1 = new NoConstructor();
        System.out.println(var1);

    }
}
