package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
        int n = 9; // 九九の表のサイズ

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                System.out.print(String.format("%02d * %02d = %02d", i, j, result));

                if (j < n) {
                    System.out.print(" || ");
                }
            }
            System.out.println(); // 改行
        }
    }
}
