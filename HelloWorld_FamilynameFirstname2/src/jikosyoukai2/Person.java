package jikosyoukai2;
//Person.java
class Person {
 public String name;
 public int age;
 public double height;
 public double weight;
 private static int count = 0; // クラスフィールド

 Person(String name, int age, double height, double weight) {
     this.name = name;
     this.age = age;
     this.height = height;
     this.weight = weight;
     count++; // クラスフィールド count に1を足す
 }

 double bmi() {
     return this.weight / (this.height * this.height);
 }

 void print() {
     System.out.println("名前は" + this.name + "です");
     System.out.println("年は" + this.age + "歳です");
 }

 // クラスメソッド
 static void printCount() {
     System.out.println("合計" + count + "人です");
 }
}
