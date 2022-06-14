package com.company;

import org.w3c.dom.ranges.RangeException;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class BingoTrout {
    private int number;
    private boolean hitStatus = false;

    public int getNumber() {
        return this.number;
    }

    // 5*5のビンゴカードの場合の、数字範囲チェック
    public boolean isValid(int number) {
        return (1 <= number) && (number <= 75);
    }

    // 抽選された数字を引数に渡して、マスに入っている数字を比較
    public boolean isHit(int lotteryNumber) {
        if (lotteryNumber == this.number) {
            return true;
        } else
            return false;

    }


    public BingoTrout (int number) {
        // コンストラクタ

        if (!isValid(number)) {
            throw new IllegalArgumentException("不正：範囲外");
        }

        this.number = number;

    }
}
