package curriculum_New_question;
import java.util.ArrayList;
import java.util.Random;

public class Curriculum_New_1_18 {
    // Q1：文字列型と整数型の引数を受け取り、コンソールに「Hello JavaSE 11」と出力するメソッド
    public static void printHello(String str, int number) {
        System.out.println("Hello " + str + " " + number);
    }

    // Q2：整数型の引数を受け取り、引数同士を乗算してコンソールに出力するメソッド
    public static void multiplyNumbers(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("乗算結果: " + result);
    }

    // Q3：整数の配列を受け取り、配列の要素を順番にコンソールに出力するメソッド
    public static void printIntArray(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Q4：小数2つの引数を受け取り、引数同士を和算してコンソールに出力するメソッド（Q2をオーバーロード）
    public static void addNumbers(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("和算結果: " + result);
    }

    // Q5：整数を引数として受け取り、指定回数分ランダムな数字を格納して出力し、リストとして返すメソッド
    public static ArrayList<Integer> generateRandomNumbers(int count) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100) + 1;
            if (randomNumber != 0) {
                numberList.add(randomNumber);
                System.out.println("生成したランダムな数字: " + randomNumber);
            }
        }
        
        return numberList;
    }

    // Q6：整数リストを受け取り、その要素の平均値をコンソールに出力するメソッド
    public static void printAverage(ArrayList<Integer> numberList) {
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        
        double average = (double) sum / numberList.size();
        System.out.println("平均値: " + average);
    }

    // Q7：整数リストを受け取り、値が50以上ならtrue、それ以外はfalseを返し、コンソールに出力するメソッド
    public static boolean checkIfAbove50(ArrayList<Integer> numberList) {
        for (int num : numberList) {
            if (num >= 50) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        // Q1：Hello JavaSE 11を出力
        printHello("JavaSE", 11);
        
        // Q2：整数の乗算結果を出力
        multiplyNumbers(5, 8);

        // Q3：整数の配列を作成し、要素を出力
        int[] intArray = {1, 2, 3, 4, 5};
        printIntArray(intArray);
        
        // Q4：小数の和算結果を出力
        addNumbers(3.5, 2.1);
        
        // Q5：ランダムな整数を生成し出力し、リストを受け取る
        ArrayList<Integer> randomNumbers = generateRandomNumbers(5);
        
        // Q6：平均値を出力
        printAverage(randomNumbers);
        
        // Q7：50以上かどうかを出力
        checkIfAbove50(randomNumbers);
    }
}
