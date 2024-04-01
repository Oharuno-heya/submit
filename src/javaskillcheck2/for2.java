package javaskillcheck2;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * 実力確認問題　4章For文と配列
 */
public class for2 {
	/**
	 * 商品名、商品価格、支払金額を入力し、お会計の過不足の有無を調べる。、
	 * @param args　　配列、for文を使い、各商品の支払金額の過不足を調べる。
	 * @throws IOException　入力された商品名、商品単価を出力する。
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String[] goodsList = new String[3];
		int[] prices = new int[3];
		int[] pays = new int[3];
		int sum = 0;

		for (int i =0; i <3; i++) {
			System.out.println("商品を入力してください。");
			String goods = br.readLine();
			System.out.println("単価を入力してください。");
			String str1 = br.readLine();
			int price = Integer.parseInt(str1);
			System.out.println("支払金額を入力して下さい。");
			String str2 = br.readLine();
			int pay = Integer.parseInt(str2);
		}

		for (int i = 0; i < 3; i++) {
			if (prices[i] <= pays[i]) {
				System.out.println(goodsList[i] + "、" + prices[i] + "円、" + "支払金額過不足無し");
			} else if (prices[i] > pays[i]) {
				System.out.println(goodsList[i] + "、" + prices[i] + "円、" + "支払金額不足");
				sum += prices[i] - pays[i];
			}
		}
		System.out.println("全体の不足金は、" + sum + "円です。");
	}
}
