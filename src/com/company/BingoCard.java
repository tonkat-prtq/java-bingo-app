package com.company;

import java.util.*;

public class BingoCard {

    List<Set<BingoTrout>> list = new ArrayList<>();
    Set<BingoTrout> set = new HashSet<>();

    public void setHitCombination() {
        for(int i = 0; i < Numbers.BINGO_CARD_ROWS; i++) {
            for(int j = 0; j < Numbers.BINGO_CARD_COLUMNS; j++) {
                set.add(new BingoTrout(i, j));
            }
            list.add(set);
        }

        for (Set<BingoTrout> set : list) {
            System.out.println("スタート");
            for (BingoTrout num : set) {
                System.out.println(num.position_x + " ," + num.position_y);
            }
        }
    }

    // rangeDeciderを使って数字の範囲を決める
    // int numberRange = Numbers.rangeDecider(Numbers.BINGO_CARD_ROWS, Numbers.BINGO_CARD_COLUMNS);

    // BingoTrout[] allTrout = new BingoTrout[numberRange + 1];
    // BingoTrout[][] troutPosition = new BingoTrout[columns][rows];

    // ビンゴのマスをrows * columns分作成する
    // この中からランダムでビンゴカードに格納するマスを取り出す

    // cardはビンゴのマスの数だけBingoTroutを持つ
    // BingoTrout[][] card = new BingoTrout[rows][columns];

    public BingoCard() {
//        for (int i = 0; i < numberRange + 1; i++) {
//            allTrout[i] = new BingoTrout();
//            allTrout[i].changeNumber(i);
//        }
//        ArrayList<Integer> numList = new ArrayList<>();
//
//        for (int i = 1; i < 16; i++) {
//            numList.add(i);
//        }
//
//        // カードに入るマスを決定する
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(numList);
//            for (int j = 0; j < 5; j++) {
//                troutPosition[j][i] = allTrout[(i * 15) + numList.get(j)];
//            }
//        }
//        // ビンゴカードの真ん中に穴を空ける
//        troutPosition[2][2].hit(troutPosition[2][2].getNumber());
    }

}
