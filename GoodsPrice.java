package javaskillcheck5classbasic;

public class GoodsPrice {
	/**
	 * 商品名と価格が入力されると、商品名と10%の税込み価格を出力する。
	 * @param pname1,2 入力された商品名を示す引数。
	 * @param pprice 入力された商品価格を示す引数。
	 * @throws 商品価格は正の整数のみである。
	 */
	public static void main(String[] args) {
		System.out.println("商品名を入力してください");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str2);
		Goods goods1 = new Goods();
		goods1.setGoods(str1);
		goods1.showName();
		System.out.println("金額を入力してください");
		goods1.setPrice(num1);
		goods1.showPrice();
	}
}
