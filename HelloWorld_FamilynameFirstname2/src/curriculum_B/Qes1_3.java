package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

    public static void main(String[] args) {
        // ユーザー名を入力
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        if (userName == null || userName.isEmpty()) { // ユーザー名の文字数が0文字以下もしくはnullの場合
            System.out.println("名前を入力してください");
            scanner.close();
            return; // エラーが発生した場合はプログラムを終了
        } else if (userName.length() > 10) { // ユーザー名の文字数が10文字より大きい場合
            System.out.println("名前を10文字以内にしてください");
            scanner.close();
            return; // エラーが発生した場合はプログラムを終了
        } else if (!userName.matches("^[a-zA-Z0-9]+$")) { // ユーザー名が半角英数字以外の場合
            System.out.println("半角英数字のみで名前を入力してください");
            scanner.close();
            return; // エラーが発生した場合はプログラムを終了
        } else {
            System.out.println("ユーザー名「" + userName + "」を登録しました");
        }

        String[] choices = { "グー", "チョキ", "パー" };
        int userWins = 0;
        int totalGames = 0;

        Random random = new Random();

        while (userWins < 1) { // ユーザーが1回だけ勝つまでループ
            int userChoice, opponentChoice;

            userChoice = random.nextInt(3); // 0から2の範囲でランダムにユーザーの選択を生成
            opponentChoice = random.nextInt(3); // 0から2の範囲でランダムに相手の選択を生成

            System.out.println(userName + "の手は「" + choices[userChoice] + "」");
            System.out.println("相手の手は「" + choices[opponentChoice] + "」");

            int result = (userChoice - opponentChoice + 3) % 3;

            if (result == 0) { // あいこの場合
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if (result == 2) {
                System.out.println("やるやん。次は俺にリベンジさせて");
            } else {
                System.out.println("俺の勝ち！");
                if (opponentChoice == 0) { // 自分がじゃんけんでグーに負けた場合
                    System.out.println("負けは次につながるチャンスです！");
                    System.out.println("ネバーギブアップ！");
                } else if (opponentChoice == 1) { // 自分がじゃんけんでチョキに負けた場合
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                } else { // 自分がじゃんけんでパーに負けた場合
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                }
            }

            totalGames++; // じゃんけんを行った回数

            if (result == 2) {
                userWins++; // ユーザーが勝ったらループを終了
            }
        }

        System.out.println("勝つまでにかかった合計回数は" + totalGames + "回です");
        scanner.close();
    }
}