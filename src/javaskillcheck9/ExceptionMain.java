package javaskillcheck9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 実力確認問題9-1　例外処理　メインクラス
 */
public class ExceptionMain {
	/**
	 *　メインメソッド
	 */
	public static void main(String[] args) throws IOException {
		// 入力
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		try {
			// モードを選択するための数値を入力
			System.out.println("処理を行うモードを選択してください。（１：Aモード、2；Bモード）");
			String mode = br.readLine();

			// 名前と年齢を入力
			System.out.println("名前と年齢をを入力して下さい。");
			String name = br.readLine();
			String str = br.readLine();
			int age = Integer.parseInt(str);

			// ProcessManagerクラスのコンストラクタを宣言
			ExceptionManager emanager = new ExceptionManager();
			// ProcessManagerクラス　getExceptionメソッドからの戻り値を受け取る
			ExceptionInterface iexception = emanager.getException(mode);

		    // checkメソッドからの戻り値がtrueのとき、runメソッドを行う
			if (iexception.check(name, age)) {
				iexception.run();
			}
		}
		catch(CustomException e) {
			System.out.println(e + "が送出されました。");
		}
		catch(Exception e) {
			System.out.println(e + "が送出されました。");
		}
	}
}
