package javaskillcheck2;
/**
 * 実力確認問題　4章繰り返し、配列　4‐1
 */
public class for1 {
	/**
	 * 契約者名、保険料、遅延利息金を表から出力する。遅延利息金は人数を出力。
	 * @param args 配列とFor文を使って要素を出力。
	 */
	public static void main(String[] args) {
//		for4-1
		String[] contractor = {"中村", "田島", "小澤", "大西"};
		int[] fee = {5000, 3000, 4500, 6000};
		int[] deray = {2000,3500};

		for (int i=0; i<4; i++) {
			System.out.println("契約者名：" + contractor[i] + "、　保険料：" + fee[i] + "円です。");
		}
		System.out.println("延滞利息金が発生している人数は、" + deray.length + "人です。");
	}
}