import java.util.Scanner;
class pallindrome{
    private String text, rev_word = "";
    String rev(String text){
        int len = text.length()-1;
        while(len >= 0){
            rev_word += text.charAt(len);
            len--;
        }
        return rev_word;
    }
    void prfm_pallin(String text){
        System.out.println(rev_word);
        if  (text.equals(rev_word)) {
            System.out.printf("%s is a pallindrome", text);
        }
        else{
            System.out.printf("%s is not a pallindrome", text);
        }
    }
}
public class pb8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("enter a text to chech whether it is a pallindrome or not: ");
        text = input.next();
        pallindrome txt = new pallindrome();
        txt.prfm_pallin(text);
    }
}

// In string "==" compares the reference of two objects not the actual content. so we have to use ".equals()"
