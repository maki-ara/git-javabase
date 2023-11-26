package jikosyoukai;
//Person.java
class Person {
 // インスタンスフィールドを定義
 String name;
 int age;
 double height; // メートル単位で身長を保持
 double weight;
 private static int count = 0; // 合計人数を管理する静的変数

 // コンストラクタを定義しインスタンスフィールドに値をセット
 Person(String name, int age, double height) {
     this.name = name;
     this.age = age;
     this.height = height;
     this.weight = 20.0 * height * height; // BMIが20.0になるようにweightを計算
     count++; // インスタンスが生成されるたびに合計人数を増やす
 }

 // インスタンスメソッド：BMIを計算する
 double bmi() {
     // BMIの計算式：BMI = 体重(kg) / (身長(m) * 身長(m))
     return weight / (height * height);
 }

 // インスタンスメソッド：情報を表示する
 void print() {
     System.out.println("名前は" + this.name + "です");
     System.out.println("年は" + this.age + "歳です");
     System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です"); // 小数点以下1桁まで表示
 }

 // 静的メソッド：合計人数を取得する
 static int getCount() {
     return count;
 }
}