package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BingoCard {
    int rows = 5;
    int columns = 5;
    int counter = 0;
    int[][] cardNumber = new int[rows][columns];
    ArrayList<Integer> numList = new ArrayList<>();

    // WIP:列ごとに決まった範囲の数値のリストを作成したい（うまくいっていない）
    public ArrayList<Integer> makeNumList(int rowNumber){
        for (int i = 1; i <= 15 * (rowNumber + 1); i++) {
            numList.add(i);
        }

        return numList;
    }

    // 5 * 5の列のとき、第1列(cardNumber[0~4][0])には1~15の数字が入る。
    // cardNumber[rows][columns]とした時、15 * (rows + 1)とすれば
    // その列に入る数字の上限が分かる。

    public BingoCard() {
        for (int i = 0; i < rows; i++) {
            makeNumList(i);
            for (int j = 0; j < columns; j++) {
                cardNumber[i][j] = numList.get(counter);
                counter++;
            }
        }
    }

}
