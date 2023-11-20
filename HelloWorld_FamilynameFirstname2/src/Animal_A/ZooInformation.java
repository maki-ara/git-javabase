package Animal_A;
import java.util.Scanner;

class Animala {
    private String name;
    private double length;
    private int speed;
    private String scientificName;

    // 学名が入力されない場合のコンストラクタ
    public Animala(String name, double length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = "不明";
    }

    // 学名が入力される場合のコンストラクタ
    public Animala(String name, double length, int speed, String scientificName) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    public void displayInfo() {
        System.out.println("\n動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
    }
}

public class ZooInformation {
    public static void main(String[] args) {
        // 学名を設定
        String[] scientificNames = {
            "パンテラ レオ",
            "ロキソドンタ・サイクロティス",
            "アイルロポダ・メラノレウカ",
            "パン・トゥログロディテス",
            "チャップマンシマウマ",
            "不明"  // 学名が不明の場合
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine();

        String[] animalsData = input.split(",");

        // 入力されたデータと学名を対応させる
        for (int i = 0; i < animalsData.length; i++) {
            String[] animalInfo = animalsData[i].split(":");
            
            // animalInfo の長さが 3 以上 4 以下でない場合は処理をスキップ
            if (animalInfo.length < 3 || animalInfo.length > 4) {
                System.out.println("無効なデータ形式です: " + animalsData[i]);
                continue;
            }

            String name = animalInfo[0];
            double length = Double.parseDouble(animalInfo[1]);
            int speed = Integer.parseInt(animalInfo[2]);

            // 学名を取得
            String scientificName = (i < scientificNames.length) ? scientificNames[i] : "不明";

            Animala animal = new Animala(name, length, speed, scientificName);
            animal.displayInfo();
        }

        // Scanner を閉じる
        scanner.close();
    }
}