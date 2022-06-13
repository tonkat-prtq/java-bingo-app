package com.company;

import org.w3c.dom.ranges.RangeException;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class BingoNumber {
    private int number;
    boolean isHit = false;

    public int getNumber() {
        return this.number;
    }

    // 5*5のビンゴカードの場合の、数字範囲チェック
    public boolean isValid(int number) {
        return (1 <= number) && (number <= 75);
    }

    public BingoNumber (int number) {
        // コンストラクタ

        if (!isValid(number)) {
            throw new IllegalArgumentException("不正：範囲外");
        }

        this.number = number;

    }
}
