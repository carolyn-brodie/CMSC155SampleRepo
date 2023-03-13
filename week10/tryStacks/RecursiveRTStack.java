package week10.tryStacks;

public class RecursiveRTStack {
    public static int mystery(double x)
    {
        if (x<2) return 0;
        else return 1+mystery(x/2);
    }

    public static void main(String[] args) {
        mystery(10.2);
    }

}
