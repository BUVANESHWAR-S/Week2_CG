public class pb_3 {
    public static void main(String[] args) {
        String s = "madam";
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t += s.charAt(i);
        }
        if (s.equals(t)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}