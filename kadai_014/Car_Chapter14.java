package kadai_014;

public class Car_Chapter14 {

	//車クラスを作成
	private int gear = 1; //1速から5速のギアを表す
	private int speed =10; //ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter14() {
		
	}
	
	//メソッド
	public void gearChange( int afterGear ) {
		this.gear = afterGear;
		//ギアの値に応じて速度を設定
		switch(this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
	//gera:ギアチェンジ後の速度
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
