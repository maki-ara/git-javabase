package kadai33;
//Main.java
public class Main {
 public static void main(String[] args) {
     Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
     person1.print();

     Person person2 = new Person("山田", "花子", 22, 1.5, 40);
     person2.print();
     
     Person.printCount();

     Car car = new Car("", "Sedan");
     Bicycle bicycle = new Bicycle("", 5);

     // Carの所有者をperson1に設定
     car.setOwner(person1.fullName());

     // Bicycleの所有者をperson2に設定
     bicycle.setOwner(person2.fullName());

     // 購入処理を実行
     person1.buy(car);
     person2.buy(bicycle);

     // 購入後の所有者を確認
     System.out.println(car.getOwner());
     System.out.println(bicycle.getOwner());

 }
}