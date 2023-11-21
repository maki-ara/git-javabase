//model パッケージの Prefecture クラス
package model;

public class Prefecture {
 private String name;
 private String capital;
 private double area;

 public Prefecture(String name, String capital, double area) {
     this.name = name;
     this.capital = capital;
     this.area = area;
 }

 public String getName() {
     return name;
 }

 public String getCapital() {
     return capital;
 }

 public double getArea() {
     return area;
 }

 public void displayInfo() {
     System.out.println("\n都道府県名：" + name);
     System.out.println("県庁所在地：" + capital);
     System.out.println("面積：" + area + "km2");
 }
}