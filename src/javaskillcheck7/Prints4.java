package javaskillcheck7;

import java.util.Scanner;

/**
 * Javaプログラム　実力確認問題　7章　クラスの利用　7‐4
 */
public class Prints4 {
	/**
	 * 入力されたカンマ区切りの文字列を1つずつ出力する。
	 */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("果物のリストをカンマ区切りで入力してください。");
        String input = scanner.nextLine();

        String[] items = input.split(",");
        System.out.println("くだものを表示します。");

        for (String item : items) {
            System.out.println(item);
        }
        scanner.close();
    }
}
