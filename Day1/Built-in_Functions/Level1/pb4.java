package Level1;
import java.time.LocalDate;

public class pb4 {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2024, 5, 10);
        LocalDate b = LocalDate.of(2025, 5, 10);
        if (a.isBefore(b)) {
            System.out.println("a is before b");
        } else if (a.isAfter(b)) {
            System.out.println("a is after b");
        } else {
            System.out.println("both same");
        }
    }
}