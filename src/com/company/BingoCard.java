package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class BingoCard {
    BingoTrout[] allTrout = new BingoTrout[76];
    BingoTrout[][] troutPosition = new BingoTrout[5][5];

    // ビンゴのマスをrows * columns分作成する
    // この中からランダムでビンゴカードに格納するマスを取り出す

    // cardはビンゴのマスの数だけBingoTroutを持つ
    // BingoTrout[][] card = new BingoTrout[rows][columns];

    public BingoCard() {

        int counter = 0;

        for (int i = 0; i < 76; i++) {
            allTrout[i] = new BingoTrout();
            allTrout[i].number = i;
        }

//        BingoTrout[0][0] ~ [0][4]は、allTrout[1]~[15]の中からランダムで選ばれる。

        ArrayList<Integer> numList = new ArrayList<Integer>();

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
        troutPosition[2][2].isHit(troutPosition[2][2].number);
    }
}
