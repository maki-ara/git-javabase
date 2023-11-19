package Animal_A;
import java.util.Scanner;

class Animala {
    private String name;
    private double length;
    private int speed;
    private String scientificName;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine();

        String[] animalsData = input.split(",");

        for (String animalData : animalsData) {
            String[] animalInfo = animalData.split(":");
            
            // animalInfo の長さが 4 でない場合は処理をスキップ
            if (animalInfo.length != 4) {
                System.out.println("無効なデータ形式です: " + animalData);
                continue;
            }

            String name = animalInfo[0];
            double length = Double.parseDouble(animalInfo[1]);
            int speed = Integer.parseInt(animalInfo[2]);
            String scientificName = animalInfo[3];

            Animala animal = new Animala(name, length, speed, scientificName);
            animal.displayInfo();
        }
     // Scanner を閉じる
        scanner.close();
    }
}