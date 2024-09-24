package kadai_017;

public abstract class Kato_Chapter17 {
	
	//姓フィールド
	 public String familyName;
	
	//名フィールド
	 public String givenName;
	
	//住所フィールド
	 public String address;
	
	//共通の紹介を出力
	 public void commonIntroduce() {
		 familyName ="加藤";
		 address = "東京都中野区〇×";
		 	}
	
	 public abstract void eachIntroduce();
	 
	 public void execIntroduce() {
		 System.out.println("名前は" + familyName + givenName + "です");
	     System.out.println("住所は" + address + "です");
	  // 各クラスの個別の紹介を呼び出す
	     eachIntroduce(); 
		 
	 }
	 
	 
	}