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
		Goods goods1;
		goods1 = new Goods();
		goods1.setGoods("プロテイン");
		System.out.println("金額を入力してください");
		goods1.setPrice(8500);
		System.out.println("購入額：" + goods1.calc);
	}
}

