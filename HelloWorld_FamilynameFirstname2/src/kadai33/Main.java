package kadai33;
//Main.java
public class Main {
 public static void main(String[] args) {
     // Personオブジェクトの作成と情報の表示
     Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
     person1.print();

     // 別のPersonオブジェクトの作成と情報の表示
     Person person2 = new Person("山田", "花子", 22, 1.5, 40);
     person2.print();
  
     // Personのインスタンス数の表示
     Person.printCount();

     // CarとBicycleオブジェクトの作成
     Car car = new Car("", "Sedan");
     Bicycle bicycle = new Bicycle("", 5);

     // Person1がCarを購入し、Person2がBicycleを購入
     person1.buy(car);
     person2.buy(bicycle);

     // 購入後の所有者を確認
     System.out.println(car.getOwner());
     System.out.println(bicycle.getOwner());
 }
}