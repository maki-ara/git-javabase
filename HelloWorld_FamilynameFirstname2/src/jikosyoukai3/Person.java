package jikosyoukai3;
//Person.java
class Person {
 public static int count = 0;
 public String firstName;
 public String lastName; // 追加されたインスタンスフィールド

 public int age;
 public double height, weight;

 // コンストラクタ1
 Person(String firstName, int age, double height, double weight) {
     this.firstName = firstName;
     this.age = age;
     this.height = height;
     this.weight = weight;
     Person.count++;
 }

 // コンストラクタ2（追加）
 Person(String firstName, String lastName, int age, double height, double weight) {
     this(firstName, age, height, weight); // コンストラクタ1を呼び出す
     this.lastName = lastName;
 }

 public String fullName() {
     return this.firstName + " " + this.lastName;
 }

 public void print() {
     System.out.println("名前は" + this.fullName() + "です");
     System.out.println("年は" + this.age + "です");
 }

 public double bmi() {
     return this.weight / this.height / this.height;
 }

 public static void printCount() {
     System.out.println("合計" + Person.count + "人です");
 }
}