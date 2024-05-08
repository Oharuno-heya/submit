package jaavaskillcheckclassfunction;

public class Infomation {
/**
* 入力された名前、年齢、住所、電話番号をリスト化し、出力する
*/
	public static void main(String[] args) {
	        // Personインスタンスをリストに追加
	        List<Person> persons = new ArrayList<>();
	        persons.add(new Person("山田", "30", "東京大田区大森", "090-0000-0000"));
	        persons.add(new Person("鈴木", 33, "和歌山県和歌山市", "090-1111-2222"));
	        persons.add(new Person("田中", 41, "宮城県仙台市", "090-3333-4444"));
	
	        // リストをループしてインスタンスの情報を出力
	        for (Person person : persons) {
			person.show();
		}
	}
}
