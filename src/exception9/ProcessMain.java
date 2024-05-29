package exception9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 実力確認問題9-1　例外処理　メインクラス
 */
public class ProcessMain {
	/**
	 *　メインメソッド
	 */
	public static void main(String[] args) throws IOException {
		try {
			// 入力
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));

			// モードを選択するための数値を入力
			System.out.println("処理を行うモードを選択してください。（１：Aモード、2；Bモード）");
			String mode = br.readLine();

			// 名前と年齢を入力
			System.out.println("名前と年齢をを入力して下さい。");
			String name = br.readLine();
			String str = br.readLine();
			int age = Integer.parseInt(str);

			// ProcessManagerクラスのコンストラクタを宣言
			ProcessManager manager = new ProcessManager();
			// ProcessManagerクラス　getProcessメソッドからの戻り値を受け取る
			ProcessInterface iprocess = manager.getProcess(mode);

		    // checkメソッドからの戻り値がtrueのとき、runメソッドを行う
			iprocess.check(name, age);
			if (iprocess.check(name, age)) {
				iprocess.run();
			}
		}
		catch (IOException e) {
			System.out.println("出力が正常に行われていません。");
		}
		catch (NumberFormatException e) {
			System.out.println("ageは数値ではありません。");
		}
		catch (IllegalArgumentException e) {
			System.out.println("引数が不正です。");
		}
		catch (CustomException e) {
			System.out.println(e + "が送出されました。");
		}
		catch (Exception e) {
			System.out.println(e + "が送出されました。");
		}
	}
}
