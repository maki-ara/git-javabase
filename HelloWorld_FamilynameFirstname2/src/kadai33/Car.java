package kadai33;
//Car.java
public class Car extends Vehicle {
 private String model;

 // Carクラスのコンストラクタ
 public Car(String owner, String model) {
     super(owner);
     this.model = model;
 }

 public String getModel() {
     return model;
 }
}