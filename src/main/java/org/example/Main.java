package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<String> randomStrings = Arrays.asList(
        "Bnc", "J26N", "Hhgv", "dg4", "Yva", "BxW", "I2l3L", "L0mZa", "OWOX", "4yRp", "zez",
        "10tr", "e6gYn", "x0RH", "sulUo", "QI85", "UdHX", "fYlGd", "J0xAE", "i7KM6", "Q22",
        "8jPq", "慧介01", "しゅ0ん9と", "ジュノaンbc", "Maz", "HSg", "MqFK", "JDgf", "LmE");

    // 数字だけ抽出
    System.out.println("【数字だけを抽出】");
    System.out.println(randomStrings.stream()
        .map(s -> s.replaceAll("[a-zA-Z\\p{IsHiragana}\\p{IsKatakana}\\p{IsHan}]", ""))
        .filter(s -> !s.isEmpty())
        .collect(Collectors.joining(","))
    );

    // 文字だけ抽出
    System.out.println("【文字だけを抽出】");
    System.out.println(randomStrings.stream()
        .map(s -> s.replaceAll("[0-9]", ""))
        .filter(s -> !s.isEmpty())
        .collect(Collectors.joining(","))
    );

    // 文字だけ抜き出す時に英数字の大文字だけ抜き出し。
    System.out.println("【大文字だけを抽出】");
    System.out.println(randomStrings.stream()
        .map(s -> s.replaceAll("[^A-Z]", ""))
        .filter(s -> !s.isEmpty())
        .collect(Collectors.joining(","))
    );
    // 注意事項は繋がっている文字や数字は連続した文字列として

    // 漢字やひらがな、カタカナなどの日本語にマッチする文字列を抜き出し
    System.out.println("【日本語のみ抽出】");

    System.out.println(randomStrings.stream()
        .map(s -> s.replaceAll("[^\\p{IsHiragana}\\p{IsKatakana}\\p{IsHan}+]", ""))
        .filter(s -> !s.isEmpty())
        .collect(Collectors.joining(","))
    );

    // 英数字以外の文字列を抜き出す

  }
}
