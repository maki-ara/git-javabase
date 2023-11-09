package basicClass;

public class Animal {
    public static void main(String[] args) {
        // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog1 = new Dog();
        System.out.println("動物の名前: " + dog1.getAnimalName());

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dog2 = new Dog(5); // 例として5匹の犬を設定
        System.out.println("動物の数: " + dog2.getAnimalCount());

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd H:m:s");
        java.util.Date date = new java.util.Date();
        String formattedDate = dateFormat.format(date);
        System.out.println("現在の日時: " + formattedDate);
    }
}
