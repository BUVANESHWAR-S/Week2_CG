public class pb_5 {
    public static void main(String[] args) {
        String s = "i love coding every day";
        String[] a = s.split(" ");
        String big = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > big.length()) {
                big = a[i];
            }
        }
        System.out.println(big);
    }
}