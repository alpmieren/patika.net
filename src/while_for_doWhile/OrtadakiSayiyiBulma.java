package while_for_doWhile;

public class OrtadakiSayiyiBulma {
    public static void main(String[] args) {
        int left=100, right=200;

        while (++left < --right);
        System.out.println("100 ile 200'ün ortasındaki değer = "+ left);
    }
}
