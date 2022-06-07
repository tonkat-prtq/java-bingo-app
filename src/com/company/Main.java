package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static int[][] makeBingoCard() {
        ArrayList<Integer> numList = new ArrayList<>();

        // bingoCardのサイズを設定する
        int rows = 5;
        int columns = 5;
        int counter = 0;

        //任意の整数値を持つリストを用意
        for (int i = 0; i <= 30; i++) {
            numList.add(i);
        }

        //リストを表示（確認用）
        System.out.println(numList);

        //shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(numList);

        int[][] bingoCard = new int[rows][columns];
        //ランダムにした結果を表示
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                bingoCard[i][j] = numList.get(counter) + 1;
                counter++;
            }
        }
        return bingoCard;
    }

    // ビンゴカードの真ん中に穴を開ける
        // rows, columnsよりそれぞれ1引いて
        // bingoCard[rows][columns]の位置が真ん中となる
        // 真ん中には特定の数字か記号を入れる

    // 当たり数字を生成する

    // カードに当たり数字があれば、状態を変える（数字を※マークに置き換えるなど）

    // ビンゴの判定をする
        // すべての状態が当たりなら（*なら）BINGO
        // （優先度低）5＊5のカードの場合、ビンゴ発生は最短で4回の当たり数字生成後というのを考慮
        // （優先度低）一度ビンゴ判定した列は、判定をスキップする

    public static void main(String[] args) {

        // 変数bingoCardに作成したビンゴカードを格納
        int[][] bingoCard = makeBingoCard();

        // bingoCardの表示
        for (int[] ints : bingoCard) {
            for (int anInt : ints) {
                System.out.print(String.format("%02d", anInt) + " ");
            }
            System.out.println();
        }

    }
}
