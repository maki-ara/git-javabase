package basicClass_A;

public class Animal_A {
    // 動物名
    private String name;

    // 体長
    private double length;

    // 速度
    private double speed;

    // コンストラクタ
    public Animal_A(String name, double length, double speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    // 動物名のゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 体長のゲッターとセッター
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 速度のゲッターとセッター
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        // Animalクラスを使ってインスタンスを作成し、値を設定
        Animal_A lion = new Animal_A("ライオン", 2.1, 80);

        // コンソールに出力
        System.out.println("動物名: " + lion.getName());
        System.out.println("体長: " + lion.getLength() + "m");
        System.out.println("速度: " + lion.getSpeed() + "km/h");
    }
}
