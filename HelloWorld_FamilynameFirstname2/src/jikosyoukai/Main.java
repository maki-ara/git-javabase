package jikosyoukai;
//Main.java
class Main {
 public static void main(String[] args) {
     Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

     System.out.println(person1.name);
     System.out.println(person1.age);
     System.out.println(person1.height);
     System.out.println();

     person1.print();

     System.out.println("\n合計" + Person.getCount() + "人です");
 }
}