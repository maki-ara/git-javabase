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

 double bmi() {
     return weight / (height * height);
 }

 void print() {
     System.out.println("名前は" + this.name + "です");
     System.out.println("年は" + this.age + "歳です");
     System.out.println("BMIは" + String.format("%.1f", 20.0) + "です");
 }

 static int getCount() {
     return count;
 }
}
