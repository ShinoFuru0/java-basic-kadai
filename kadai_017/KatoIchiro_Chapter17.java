package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	@Override
	public void setGivenName() {
		givenName = "一郎"; // 固有の名前を設定
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
