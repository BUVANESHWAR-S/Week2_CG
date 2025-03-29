package Level1;
import java.time.LocalDate;

public class pb2 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2023, 4, 14);
        LocalDate x
                = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("old: " + d);
        System.out.println("new: " + x);
    }
}