package kadai_024;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {

    public String getMyChoice() {
        // オブジェクトを作成
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            String choice = scanner.next();

            if (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
                System.out.println("正しい手を入力してください");
                continue;
            } else {
                //scanner.close(); // ここでscannerを閉じると、他のメソッドで再利用ができないため、閉じないようにするか、メインメソッドで管理する
                return choice;
            }
        }
    }

    public String getRandom() {
        Random random = new Random();
        String[] hands = { "r", "s", "p" };
        int num = random.nextInt(3);
        return hands[num];
    }

    public void playGame() {
        HashMap<String, String> jankenMap = new HashMap<>();
        jankenMap.put("r", "グー");
        jankenMap.put("s", "チョキ");
        jankenMap.put("p", "パー");

        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        System.out.println("自分の手は" + jankenMap.get(myChoice) + ", 対戦相手の手は" + jankenMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}