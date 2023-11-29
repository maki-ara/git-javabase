package kadai33;
//Bicycle.java
public class Bicycle extends Vehicle {
 private int gear;

 // Bicycleクラスのコンストラクタ
 public Bicycle(String owner, int gear) {
     super(owner);
     this.gear = gear;
 }

 public int getGear() {
     return gear;
 }
}
