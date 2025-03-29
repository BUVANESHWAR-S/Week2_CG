public class pb_6 {
    public static void main(String[] args) {
        String s = "lololol";
        String sub = "lol";
        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        System.out.println("times: " + count);
    }
}