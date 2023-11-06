package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numStudents = scanner.nextInt();

        if (numStudents < 2) {
            System.out.println("生徒の人数は2以上で入力してください。");
            System.exit(0);
        }

        // 科目の数
        int numSubjects = 4; // 英語, 数学, 理科, 社会

        // 生徒ごとの成績と平均点を格納する配列
        double[][] grades = new double[numStudents][numSubjects];
        double[] studentAverages = new double[numStudents];

        // 各科目の合計点
        double[] subjectSums = new double[numSubjects];

        // 生徒の成績を入力
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "人目の成績を入力してください:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print((j == 0 ? "英語" : j == 1 ? "数学" : j == 2 ? "理科" : "社会") + "の点数を入力してください: ");
                grades[i][j] = scanner.nextDouble();
                subjectSums[j] += grades[i][j];
            }
            studentAverages[i] = calculateAverage(grades[i]);
        }
        // 各生徒の平均点を表示
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "人目の平均点は" + String.format("%.2f", studentAverages[i]) + "点です。");
        }

        // 各科目の平均点を表示
        String[] subjects = {"英語", "数学", "理科", "社会"};
        for (int j = 0; j < numSubjects; j++) {
            double subjectAverage = subjectSums[j] / numStudents;
            System.out.println(subjects[j] + "の平均点は" + String.format("%.2f", subjectAverage) + "点です.");
        }

        // 全体の平均点を表示
        double overallAverage = calculateOverallAverage(studentAverages);
        System.out.println("全体の平均点は" + String.format("%.2f", overallAverage) + "点です.");
        scanner.close();
        
    }

    // 平均点を計算するユーティリティメソッド
    private static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    private static double calculateOverallAverage(double[] studentAverages) {
        double sum = 0;
        for (double average : studentAverages) {
            sum += average;
        }
        return sum / studentAverages.length;
    }
}