package jp.co.fl.superintro.ch05;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インクリメント用の値を管理する変数の初期化
		int num = 9;

		System.out.println("---前置インクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(++num); //足された後に表示する
		System.out.println(num); //前置インクリメントの値を表示

		//インクリメント用の値を管理する変数を再初期化
		num = 9;

		System.out.println("---後置インクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(num++); //表示した後に足し込まれる
		System.out.println(num); //後置インクリメントの値を表示
	}

}
