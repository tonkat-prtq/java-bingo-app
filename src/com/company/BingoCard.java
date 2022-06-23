package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class BingoCard implements Number{
    int rows = 5;
    int columns = 5;

    // カードのマス目の数を決める
    int cardSize = rows * columns;

    // rangeDeciderを使って数字の範囲を決める
    int numberRange = rangeDecider(cardSize);

    BingoTrout[] allTrout = new BingoTrout[numberRange + 1];
    BingoTrout[][] troutPosition = new BingoTrout[columns][rows];

    // ビンゴのマスをrows * columns分作成する
    // この中からランダムでビンゴカードに格納するマスを取り出す

    // cardはビンゴのマスの数だけBingoTroutを持つ
    // BingoTrout[][] card = new BingoTrout[rows][columns];

    public BingoCard() {
        for (int i = 0; i < numberRange + 1; i++) {
            allTrout[i] = new BingoTrout();
            allTrout[i].number = i;
        }
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = 1; i < 16; i++) {
            numList.add(i);
        }

        // カードに入るマスを決定する
        for(int i = 0; i < 5; i++) {
            Collections.shuffle(numList);
            for(int j = 0; j < 5; j++) {
                troutPosition[j][i] = allTrout[(i * 15) + numList.get(j)];
            }
        }
        // ビンゴカードの真ん中に穴を空ける
        troutPosition[2][2].number = 0;
        troutPosition[2][2].hit(troutPosition[2][2].number);
    }

    // なんかやりたかったことと違う気がする……
    @Override
    public int rangeDecider(int size) {
        return size * 3;
    }
}
