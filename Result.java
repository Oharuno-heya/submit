package javaskillcheck5classbasic;

public class Result {
	/**
	 *　2つの整数ト1つの演算子を入力すると、計算結果が出力されるプログラム.
	 * @param pnum1,2 入力された整数を示す引数。
	 * @param pope 入力された演算子を示す引数。
	 * @return 入力された2つの整数を、入力された演算子で計算した結果を返す。
	 * @throws　入力された演算子が、「+」、「-」、「*」、「/」以外の場合、出力されない。
	 */
	public static void main(String[] args) {
		Calculation calc1;
		calc1 = new Calculation();
		System.out.println("1つ目の数値を入力してください。");
		calc1.number1(6);
		System.out.println("2つ目の数値を入力してください。");
		calc1.number2(3);
		System.out.println("演算子を入力してください。");
		calc1.operant("*");
		calc1.calc();
		calc1.show();
	}
}
