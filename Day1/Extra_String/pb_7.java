public class pb_7 {
    public static void main(String[] args) {
        String s = "HeLLo";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                t += (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                t += (char)(ch + 32);
            } else {
                t += ch;
            }
        }
        System.out.println(t);
    }
}