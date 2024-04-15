public class Infomation {
/**
 * 入力された名前、年齢、住所、電話番号をリスト化し、出力する
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * 1つ目のオブジェクト
		 */
		Person per1 = new Person();
		per1.setName("山田");
		per1.setAge("23");
		per1.setAddress("東京都大田区");
		per1.setTel("090‐0000-0000");

		/**
		 * 2つめのオブジェクト
		 */
		Person per2 = new Person();
		per2.setName("田中");
		per2.setAge(20);
		per2.setAddress("埼玉県上尾市");
		per2.setTel("070‐1111-2222");

		/**
		 * 3つめのオブジェクト
		 */
		Person per3 = new Person();
		per3.setName("国光");
		per3.setAge(29);
		per3.setAddress("山梨県笛吹市");
		per3.setTel("080‐4444-5555");
	}
}
