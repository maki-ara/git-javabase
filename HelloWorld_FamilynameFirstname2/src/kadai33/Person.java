package kadai33;
//Person.java
class Person {
 public static int count = 0;
 public String firstName;
 public String lastName;
 public int age;
 public double height, weight;

 public Person(String firstName, int age, double height, double weight) {
     this.firstName = firstName;
     this.age = age;
     this.height = height;
     this.weight = weight;
     Person.count++;
 }

 public Person(String firstName, String lastName, int age, double height, double weight) {
     this(firstName, age, height, weight);
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

 public void buy(Car car) {
     // Carオブジェクトの所有者を設定
     car.setOwner(this.fullName());

     // 購入者と購入した車の情報を表示
     System.out.println(this.fullName() + "が購入しました");
 }

 public void buy(Bicycle bicycle) {
     // Bicycleオブジェクトの所有者を設定
     bicycle.setOwner(this.fullName());

     // 購入者と購入した自転車の情報を表示
     System.out.println(this.fullName() + "が購入しました");
 }
}