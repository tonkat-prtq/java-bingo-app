package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class BingoCard {
    BingoTrout[] allTrout = new BingoTrout[75];

    // ビンゴのマスをrows * columns分作成する
    // この中からランダムでビンゴカードに格納するマスを取り出す

    // cardはビンゴのマスの数だけBingoTroutを持つ
    // BingoTrout[][] card = new BingoTrout[rows][columns];

    public BingoCard() {

        for (int i = 0; i <= 74; i++) {
            allTrout[i].number = i + 1;
        }
    }
}
