package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BingoCard card = new BingoCard();

        System.out.println(card.numList);

//        変数bingoCardに作成したビンゴカードを格納
//        int[][] bingoCard = makeBingoCard();

        // bingoCardの表示
        for (int[] ints : card.cardNumber) {
            for (int anInt : ints) {
                System.out.print(String.format("%02d", anInt) + " ");
            }
            System.out.println();
        }

    }

//    public static int[][] makeBingoCard() {
//        ArrayList<Integer> numList = new ArrayList<>();
//
//        // bingoCardのサイズを設定する
//        int rows = 5;
//        int columns = 5;
//        int counter = 0;
//
//        //任意の整数値を持つリストを用意
//        for (int i = 0; i <= 30; i++) {
//            numList.add(i);
//        }
//
//        //リストを表示（確認用）
//        System.out.println(numList);
//
//        //shuffleメソッドで上で作ったリストをシャッフル
//        Collections.shuffle(numList);
//
//        int[][] bingoCard = new int[rows][columns];
//        //ランダムにした結果を表示
//        for (int i = 0; i < rows; i++) {
//
//            for (int j = 0; j < columns; j++) {
//                bingoCard[i][j] = numList.get(counter) + 1;
//                counter++;
//            }
//        }
//        return bingoCard;
//    }

}
