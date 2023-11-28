package jikosyoukai;
//Person.java
class Person {
 String name;
 int age;
 double height;
 double weight;

 private static int count = 0;

 Person(String name, int age, double height, double weight) {
     this.name = name;
     this.age = age;
     this.height = height;
     this.weight = weight;
     count++;
 }

 int calculateRoundedBMI() {
     // BMIを計算し、小数点以下を切り捨て
     return (int) Math.floor(weight / (height * height));
 }

 void print() {
     int roundedBMI = calculateRoundedBMI();
     System.out.println("名前は" + this.name + "です");
     System.out.println("年は" + this.age + "歳です");
     System.out.println("BMIは" + roundedBMI + ".0 です");  // 20.0のように表示
 }

 static int getCount() {
     return count;
 }
}
