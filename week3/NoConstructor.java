package week3;

public class NoConstructor {

    private int x = 0;

    public void update_X(int new_value) {
        x = new_value;
    }

    public String toString() {

        return x + "";   // Why is + "" used here?
    }


    public static void main(String[] args) {

        NoConstructor var1 = new NoConstructor();
        var1.update_X(5);
        System.out.println(var1);

    }
}
