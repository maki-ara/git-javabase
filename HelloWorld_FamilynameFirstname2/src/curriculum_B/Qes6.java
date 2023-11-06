package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        String productNames = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ";
        String[] products = productNames.split("、"); // 商品名を配列に分割
        int maxCount = 11; // 最大台数

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String input = scanner.nextLine();
        String[] inputProducts = input.split("、");

        for (String product : inputProducts) {
            int remainingCount = 0;

            // 入力された商品名が products 配列に含まれているかを確認
            if (containsProduct(products, product)) {
                remainingCount = random.nextInt(maxCount + 1);
                System.out.println(product + "の残り台数は" + remainingCount + "台です");
            } else {
                System.out.println("『" + product + "』は指定の商品ではありません");
            }
        }

        scanner.close(); // Scannerを閉じる
    }

    // 商品名が指定の商品リストに含まれているかを確認するメソッド
    private static boolean containsProduct(String[] products, String product) {
        for (String p : products) {
            if (p.equals(product)) {
                return true;
            }
        }
        return false;
    }
}