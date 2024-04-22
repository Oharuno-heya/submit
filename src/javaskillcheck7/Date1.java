package javaskillcheck7;
import java.time.LocalDate;

/**
 * Java実力確認問題　7章　クラスの利用7‐1
 */
public class Date1 {
    /**
     * 入力された日付と、1か月後の日付を出力。
     */
    public static void main(String[] args){
        //    入力された日付を出力
        LocalDate date = LocalDate.of(2024, 05, 20);
        System.out.println(date);

        //    1か月後の日付を出力
        LocalDate date2 = date.plusMonths(1);
        int month = date2.getMonthValue();
        System.out.println(date.getYear() + "/" + month + "/" + date.getDayOfMonth());
    }
}
