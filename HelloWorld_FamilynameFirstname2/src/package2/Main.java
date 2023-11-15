// Main.java (package2に保存)
package package2;
import java.util.Scanner;

import package1.Adventurer;

public class Main {
    public static void main(String[] args) {
        // try-with-resources文を使ってScannerを宣言
        try (Scanner scanner = new Scanner(System.in)) {
            // ユーザーに名前を入力させる
            System.out.print("名前を入力してください: ");
            String playerName = scanner.nextLine();

            // 冒険者オブジェクトの作成と初期化
            Adventurer adventurer = new Adventurer(playerName);

            // 冒険者のステータス表示
            System.out.println("こんにちは、" + adventurer.getName() + "さん");
            System.out.println("ステータス");
            System.out.println("HP：" + adventurer.getHp());
            System.out.println("MP：" + adventurer.getMp());
            System.out.println("攻撃力：" + adventurer.getAttack());
            System.out.println("素早さ：" + adventurer.getAgility());
            System.out.println("防御力：" + adventurer.getDefense());

            // さあ冒険に出かけよう！
            System.out.println("さあ冒険に出かけよう！");
        }
    }
}