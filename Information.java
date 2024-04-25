package jaavaskillcheckclassfunction;

public class Infomation {
/**
* 入力された名前、年齢、住所、電話番号をリスト化し、出力する
*/
	public static void main(String[] args) {
		//　個人情報リストの配列を定義
		Person[] pers = new Person[3];
		 for (int i = 0; i < pers.length; i++) {
			 pers[i] = new Person();
		 }
		 
		 //	個人情報リスト配列に要素を入力
		pers[0].setList("山田","23","東京都大田区","090‐0000-0000");
		pers[1].setList("田中", 20, "埼玉県上尾市", "070‐1111-2222");
		pers[2].setList("国光", 29, "山梨県笛吹市", "080‐4444-5555");
		for (int i = 0; i < pers.length; i++) {
			pers[i].show();
		}
	}
}
