package curriculum_A;

public class Qes6 {
    public static void main(String[] args) {
        // 『』で囲われた情報を変数に代入
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
    }
}
