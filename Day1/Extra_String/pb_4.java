public class pb_4 {
    public static void main(String[] args) {
        String s = "banana";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) == -1) {
                t += s.charAt(i);
            }
        }
        System.out.println(t);
    }
}