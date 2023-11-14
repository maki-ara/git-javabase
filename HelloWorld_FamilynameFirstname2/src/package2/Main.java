// Main.java (package2に保存)
package package2;
import package1.Player;

public class Main {
    public static void main(String[] args) {
        // プレイヤーオブジェクトの作成と初期化
        Player player = new Player("「名前」", 849, 862, 375, 937, 24);

        // プレイヤーのステータス表示
        System.out.println("こんにちは" + player.getName() + "さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getAgility());
        System.out.println("防御力：" + player.getDefense());

        // さあ冒険に出かけよう！
        System.out.println("さあ冒険に出かけよう！");
    }
}