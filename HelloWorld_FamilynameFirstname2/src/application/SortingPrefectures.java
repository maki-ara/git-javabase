// application パッケージの SortingPrefectures クラス
package application;

import java.util.Arrays;
import java.util.Scanner;

import model.Prefecture;

public class SortingPrefectures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 都道府県の配列
        Prefecture[] prefectures = {
                new Prefecture("北海道", "札幌市", 83424),
                new Prefecture("青森県", "青森市", 9646),
                new Prefecture("岩手県", "盛岡市", 15275),
                new Prefecture("宮城県", "仙台市", 7282),
                new Prefecture("秋田県", "秋田市", 11638),
                new Prefecture("山形県", "山形市", 9323),
                new Prefecture("福島県", "福島市", 13784),
                new Prefecture("茨城県", "水戸市", 6097),
                new Prefecture("栃木県", "宇都宮市", 6408),
                new Prefecture("群馬県", "前橋市", 6362),
                new Prefecture("埼玉県", "さいたま市", 3798)
        };

        System.out.println("コンソールに数字を入力してください（複数選択可能、例: 8,5,9）");
        String input = scanner.nextLine();

        String[] selectedIndices = input.split(",");
        int[] indices = Arrays.stream(selectedIndices)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(indices);

        System.out.println("昇順または降順を選択してください（昇順: 1, 降順: 2）");
        int sortOrder = scanner.nextInt();

        for (int index : indices) {
            Prefecture prefecture = prefectures[index];
            if (sortOrder == 2) {
                // 降順の場合は逆順に表示
                index = indices.length - 1 - index;
                prefecture = prefectures[index];
            }
            prefecture.displayInfo();
        }
    }
}
