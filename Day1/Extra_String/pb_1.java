public class pb_1 {
    public static void main(String[] args) {
        String s = "hello java";
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch
                        == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("vowels: " + v);
        System.out.println("cons: " + c);
    }
}