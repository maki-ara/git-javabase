package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {
    	
    	// Qes1
    	
        // バイト型
        byte byteVar;

        // 短整数型
        short shortVar;

        // 整数型
        int intVar;

        // 長整数型
        long longVar;

        // 単精度浮動小数点数型
        float floatVar;

        // 倍精度浮動小数点数型
        double doubleVar;

        // 文字型
        char charVar;

        // 文字列型 (String)
        String stringVar;

        // ブーリアン型
        boolean booleanVar;
        
        
        
        // Qes2
        
       // バイト型
        byteVar = 0;

        // 短整数型
        shortVar = 0;

        // 整数型
        intVar = 0;

        // 長整数型
        longVar = 0L;

        // 単精度浮動小数点数型
        floatVar = 0.0f;

        // 倍精度浮動小数点数型
        doubleVar = 0.0d;

        // 文字型
        charVar = '\u0000';

        // 文字列型 (JavaではStringクラスを使用)
        stringVar = null;

        // ブーリアン型
        booleanVar = false;

        
        
        //Qes3
        
        // バイト型
        byteVar = 10;

        // 短整数型
        shortVar = 100;

        // 整数型
        intVar = 1000;

        // 長整数型
        longVar = 10000L;

        // 単精度浮動小数点数型
        floatVar = 9.5f;

        // 倍精度浮動小数点数型
        doubleVar = 10.5;

        // 文字型
        charVar = 'a';

        // 文字列型 (JavaではStringクラスを使用)
        stringVar = "ハロー";

        // ブーリアン型
        booleanVar = true;
        
        
        
        //Qes4

        // 11110を出力
        System.out.println(intVar + longVar + byteVar + shortVar +  " " + (intVar + longVar + byteVar + shortVar));

        // 20を出力
        System.out.println(floatVar + doubleVar + " " + (floatVar + doubleVar));

        // a ハロー true a ハロー trueを出力
        System.out.println(charVar + " " + stringVar + " " + booleanVar + " " + charVar + " " + stringVar + " " + booleanVar);

        // 11130と"数字を全て足す"を出力
        System.out.println(intVar + longVar + " " + (intVar + longVar) + " 数字を全て足す");

        // 10000000000と"小数点以外の数字を全てかける"を出力
        System.out.println(intVar * longVar + " " + (intVar * longVar) + " 小数点以外の数字を全てかける");

        // 0.105と"10.5割る100をする"を出力
        System.out.println(doubleVar / 100 + " " + (doubleVar / 100) + " 10.5割る100をする");

        // -90と"10引く100をする"を出力
        System.out.println(byteVar - shortVar + " " + (byteVar - shortVar) + " 10引く100をする");
        
        
        
        // Qes5
        
        String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
		
		
		
		//Qes6
		
		String info = "山田太郎 18歳 170.5cm 62.2kg 寿司";

        // 変数から情報を抽出
        String[] infoArray = info.split(" ");
        String name = infoArray[0];
        int age = Integer.parseInt(infoArray[1].replace("歳", ""));
        double height = Double.parseDouble(infoArray[2].replace("cm", ""));
        double weight = Double.parseDouble(infoArray[3].replace("kg", ""));
        String favoriteFood = infoArray[4];

        // フォーマットに従ってコンソールに出力
        System.out.println("「初めまして" + name + "です」");
        System.out.println("「年齢は" + age + "歳です」");
        System.out.println("「身長は" + height + "cmです」");
        System.out.println("「体重は" + weight + "kgです」");
        System.out.println("「好きな食べ物は" + favoriteFood + "です」");
        
        
        
        //Qes7
        
        // BMIを計算
        double heightInMeters = height / 100.0; // 身長をメートルに変換
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // フォーマットに従ってコンソールに出力
        System.out.println("BMIは" + Math.floor(bmi) + "です");
        
        
        
        // Qes8
        
        // 既存の情報を変数に代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        // BMIを再計算
        heightInMeters = height / 100.0; // 身長をメートルに変換
        bmi = weight / (heightInMeters * heightInMeters);

        // フォーマットに従ってコンソールに出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        
        
        
        // Qes9
        
        // 年齢、身長、体重を和算で自己代入
        age += age;
        height += height;
        weight += weight;

        // BMIを再計算
        heightInMeters = height / 100.0; // 身長をメートルに変換
        bmi = weight / (heightInMeters * heightInMeters);

        // フォーマットに従ってコンソールに出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        
        
        
        //Qes10
        
        // 年齢を再代入
        age = 24;
        
        // 年齢が25歳以上ならtrueが出力される
        boolean is25OrOlder = age >= 25;
        
        System.out.println(is25OrOlder);
        
        
        
        // Qes11
        
        // 身長と体重を再代入
        height = 168.5;
        weight = 64.2;
        
        // 年齢・身長・体重を文字列に型変換
        String ageStr = Integer.toString(age);
        String heightStr = Double.toString(height);
        String weightStr = Double.toString(weight);

        // 3つの情報を繋げてコンソールに出力
        String infoString = "年齢" + ageStr + "歳身長" + heightStr + "cm体重" + weightStr + "kg";
        
        System.out.println(infoString);
        
        
        
        //Qes12
        
        // 年齢・身長を文字列から整数に変換
        int convertedAge = Integer.parseInt(Integer.toString(age));
        int convertedHeight = (int) Double.parseDouble(Double.toString(height)); // 身長は整数に変換（小数点以下切り捨て）
        
        System.out.println("年齢" + convertedAge + "歳" + "身長" + convertedHeight + "cm");
        
        
        
        //Qes13
        
        // 年齢と身長の条件をチェック
        boolean is25OrAbove = age >= 25;
        boolean isHeightAbove160 = height >= 160.0;

        // 年齢が25以上または身長が160以上の場合にtrueを出力
        boolean result = is25OrAbove || isHeightAbove160;
        System.out.println(result);
    }
}
