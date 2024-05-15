package javaskillcheck8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessA,ProcessBを持つインターフェイス
 */
interface Process {
	boolean check();
	void run();
}
/**
 * ProcessAクラス
 */
class ProcessA implements Process{
	/** 入力され名前を表すた文字列 */
	private String name;
	/** 入力された年齢を表す数値 */
	private int age;
	/**
	 * 入力された名前と年齢を変数に代入するインスタンス
	 * @param n　名前を示す文字列
	 * @param a　年齢を示す数値
	 */
	public ProcessA(String n, int a) {
		name = n;
		age = a;
	}
	/**
	 * 名前がが10文字未満かつ年齢が140歳以下かを確認する条件式
	 */
	 public boolean check() {
		 return (name.length() < 10 && age >= 0 && age <= 140);
	 }
	/**
	 * 指定された文字列を出力する
	 */
	public void run() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}

/**
 * ProcessBのクラス
 */
class ProcessB implements Process{
	/** 入力され名前を表すた文字列 */
	private String name;
	/** 入力された年齢を表す数値 */
	private int age;
	/**
	 * 入力された名前と年齢を変数に代入するインスタンス
	 * @param n　名前を示す文字列
	 * @param a　年齢を示す数値
	 */
	public ProcessB (String n, int a) {
		name = n;
		age = a;
	}
	/**
	 * 名前がが5～20文字かつ年齢が30~60歳かを確認する条件式
	 */
	public boolean check() {
		return (name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60);
	}
	/**
	 * 指定された文字列を出力する
	 */
	public void run() {
		System.out.println("名前：" +name);
		System.out.println("年齢：" + age);
	}
}

/**
 * 8章実力確認問題8－２　メインクラス
 */
public class Name {
	/**
	 *　入力された名前と年齢を整理して出力する
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		System.out.println("名前と年齢をを入力して下さい。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		List<String> n = new ArrayList<>();
        List<String> ages = new ArrayList<>();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            n.add(br.readLine());
            ages.add(br.readLine());
            a.add(Integer.parseInt(ages.get(i)));
        }
        /** ProcessAとProcessBクラスのオブジェクトを作成。checkメソッドからBoolean型の戻り値を受け取り、引数に応じてrun()メソッドを呼び出す。*/
        Process[] pro = new Process[2];
        for (int i = 0; i < 2; i++) {
        	pro[0] = new ProcessA(n.get(i), a.get(i));
            boolean pa = pro[0].check();
            pro[1] = new ProcessB(n.get(i), a.get(i));
            boolean pb = pro[1].check();
            if (pa) {
            	System.out.println(i+1);
                pro[0].run();
            }
            if (pb) {
            	System.out.println(i+1);
                pro[1].run();
            }
        }
    }
}