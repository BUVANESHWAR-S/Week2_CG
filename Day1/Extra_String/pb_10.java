public class pb_10 {
    public static void main(String[] args) {
        String s = "Hello World";
        char x = 'l';
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != x) {
                t += s.charAt(i);
            }
        }
        System.out.println(t);
    }
}