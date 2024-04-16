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
		System.out.println("1つ目の数値を入力してください。");
		BufferedReader br =
			new BufferedReader(new InputStremReader(System.in));
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		System.out.println("2つ目の数値を入力してください。");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		
		System.out.println("演算子を入力してください。");
		String str3 =br.readLine();
		
		Calculation calc1;
		calc1 = new Calculation();
		calc1.number1(num1);
		calc1.number2(num2);
		
		calc1.operant(str3);
		calc1.calc();
		calc1.show()
	}
}
