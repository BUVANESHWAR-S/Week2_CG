public class pb_8 {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        int min = Math.min(a.length(), b.length());
        boolean same = true;
        for (int i = 0; i < min; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println(a + " before " + b);
                same = false;
                break;
            } else if (a.charAt(i) > b.charAt(i)) {
                System.out.println(b + " before " + a);
                same = false;
                break;
            }
        }
        if (same) {
            if (a.length() < b.length()) {
                System.out.println(a + " before " + b);
            } else if (a.length() > b.length()) {
                System.out.println(b + " before " + a);
            } else {
                System.out.println("both same");
            }
        }
    }
}