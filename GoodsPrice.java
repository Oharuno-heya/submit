package javaskillcheck5classbasic;

/**
 * Javaプログラム　5章　実力確認問題5‐1　
 */
class Goods {
/**
 * name:商品名の文字列を代入する変数。
 */
	String name;
/**	
 * price:商品価格の数値を代入する変数。
 */
	int price;
/**	
 * tax:消費税率を示す変数。
 */
	int tax = 10;
/**
 * calc:税込み価格を計算し代入する変数。
 */
	int calc;
/**
 * setGoodsメソッド：入力された商品名を変数nameに代入する。
 */
	void setGoods(String pname) {
		name = pname;
	}
/**
 * setPriceメソッド:入力された商品価格をpriceに代入し、変数calcで税込み価格を計算する。
 */
	void setPrice(int pprice) {
		price = pprice;
		calc = price + (price * tax / 100);
	}
}

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
