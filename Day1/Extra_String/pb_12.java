public class pb_12 {

    public static void main(String[] args) {
        String s = "i love java java is fun";
        String old = "java";
        String ne = "python";
        String[] a = s.split(" ");
        String r = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(old)) {
                r += ne + " ";
            } else {
                r += a[i] + " ";
            }
        }
        System.out.println(r);
    }
}