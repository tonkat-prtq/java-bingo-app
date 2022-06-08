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

}
