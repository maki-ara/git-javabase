package curriculum_A;

public class Qes2_3_4 {
    public static void main(String[] args) {
        // バイト型
        byte byteVar = 10;

        // 短整数型
        short shortVar = 100;

        // 整数型
        int intVar = 1000;

        // 長整数型
        long longVar = 10000L;

        // 単精度浮動小数点数型
        float floatVar = 9.5f;

        // 倍精度浮動小数点数型
        double doubleVar = 10.5;

        // 文字型
        char charVar = 'a';

        // 文字列型 (JavaではStringクラスを使用)
        String stringVar = "ハロー";

        // ブーリアン型
        boolean booleanVar = true;

        // 11110を出力
        System.out.println(intVar + longVar + " " + (intVar + longVar));

        // 20を出力
        System.out.println(shortVar + " " + shortVar);

        // a ハロー true a ハロー trueを出力
        System.out.println(charVar + " " + stringVar + " " + booleanVar + " " + charVar + " " + stringVar + " " + booleanVar);

        // 11130と"数字を全て足す"を出力
        System.out.println(intVar + longVar + " " + (intVar + longVar) + " 数字を全て足す");

        // 10000000000と"小数点以外の数字を全てかける"を出力
        System.out.println(intVar * longVar + " " + (intVar * longVar) + " 小数点以外の数字を全てかける");

        // 0.105と"10.5割る100をする"を出力
        System.out.println(doubleVar / 100 + " " + (doubleVar / 100) + " 10.5割る100をする");

        // -90と"10引く100をする"を出力
        System.out.println(intVar - longVar + " " + (intVar - longVar) + " 10引く100をする");
    }
}