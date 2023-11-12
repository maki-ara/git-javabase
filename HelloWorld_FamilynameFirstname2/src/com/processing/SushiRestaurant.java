// SushiRestaurant.java
package com.processing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SushiRestaurant {
    private String greeting = "こんにちは！ここは日本です！";
    private String sushiTaste = "この寿司はうまい";
    private String sushiType = "寿司は和食です";
    private String formattedDateTime;

    public SushiRestaurant() {
        this.formattedDateTime = getCurrentDateTime();
    }

    private String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }

    public void displayMessages() {
        if (formattedDateTime != null) {
            System.out.println(greeting);
            System.out.println(sushiTaste);
            System.out.println(sushiType);
            System.out.println("今の現在日時は" + formattedDateTime + "です");
        } else {
            System.out.println("日時の取得に失敗しました。");
        }
    }
}
