package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge = 30;
		switch (userAge) {
		case 10 -> System.out.println("10代の料金は");
		case 20 -> System.out.println("20代の料金は");
		case 30 -> System.out.println("30代の料金は");
		case 40 -> System.out.println("40代の料金は");
		case 50 -> System.out.println("50代の料金は");
		case 60 -> System.out.println("60代の料金は");
		case 70 -> System.out.println("70代の料金は");
		case 80 -> System.out.println("80代の料金は");
		default -> System.out.println("上記以外の年代は");
		};
		
		int serviceCost = 3000; //料金
		switch(serviceCost) {
		case 1000 -> System.out.println("1000円");
		case 2000 -> System.out.println("2000円");
		case 3000 -> System.out.println("3000円");
		case 4000 -> System.out.println("4000円");
		case 5000 -> System.out.println("5000円");
		default -> System.out.println("500円");
		};
		
		};
	}
