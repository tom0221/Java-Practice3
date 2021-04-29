package jp.co.fl.superintro.ch05;

public class DecrementOperator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//デクリメント用の値を管理する変数を初期化
		int num = 9;

		System.out.println("---前置デクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(--num); //引かれた後に表示する
		System.out.println(num); //前置デクリメント後の値を表示

		//デクリメント用の値を管理する変数を再初期化
		num = 9;

		System.out.println("---後置デクリメント---");
		System.out.println(num); //初期値の表示
		System.out.println(num--); //表示され後に引かれる
		System.out.println(num); //後置デクリメントの値を表示
	}

}
