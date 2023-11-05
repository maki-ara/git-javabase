package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6{
    public static void main(String[] args) {
        String productNames = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ";
        String[] products = productNames.split("、");
        int maxCount = 11; // 最大台数

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        String input = scanner.nextLine();
        String[] inputProducts = input.split("、");

        for (String product : inputProducts) {
            int remainingCount = 0;

            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    remainingCount = random.nextInt(maxCount + 1);
                    System.out.println(product + "の残り台数は" + remainingCount + "台です");
                    break;
                case "テレビ":
                case "ディスプレイ":
                    int displayRemainingCount = random.nextInt(maxCount + 1);
                    System.out.println(product + "の残り台数は" + displayRemainingCount + "台です");
                    break;
                default:
                    System.out.println("『" + product + "』は指定の商品ではありません");
                    break;
            }
        }
    }
}