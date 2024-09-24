package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		taro.setGivenName(); // 固有の名前を設定
		taro.execIntroduce(); // 紹介を行う

		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		ichiro.setGivenName(); // 固有の名前を設定
		ichiro.execIntroduce(); // 紹介を行う

		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		hanako.setGivenName(); // 固有の名前を設定
		hanako.execIntroduce(); // 紹介を行う
	}
}