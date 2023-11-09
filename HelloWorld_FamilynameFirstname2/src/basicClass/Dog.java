package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義してください。
    private String animalName;

    // Q2：フィールドに動物の数の変数を定義してください。
    private int animalCount;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        animalName = "犬";
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(int count) {
        animalCount = count;
    }

    // ゲッターとセッター
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String name) {
        animalName = name;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int count) {
        animalCount = count;
    }
}
