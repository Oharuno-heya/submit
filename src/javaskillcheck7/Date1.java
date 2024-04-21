package javaskillcheck7;

/**
 * Java実力確認問題　7章　クラスの利用7‐1
 */
import java.time.LocalDate;

public class Date1 {
	/**
	 * 入力された日付と、1か月後の日付を出力。
	 */
	public static void main(String[] args){
		// 入力された日付を出力
		LocalDate date = LocalDate.of(2024, 05, 20);
		System.out.println(date);
		// 1か月後の日付を出力
		System.out.println("1か月後は" + date.plusMonths(1) + "です。");
	}
}
