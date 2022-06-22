package com.company;

import java.util.ArrayList;

public class BingoTrout {
    int number;
    private boolean hitStatus = false;
    private ArrayList<Integer> numList = new ArrayList<>();

    public int getNumber() {
        return this.number;
    }
    public boolean getHitStatus() { return this.hitStatus; }

    // 5*5のビンゴカードの場合の、数字範囲チェック
    public boolean isValid(int number) {
        return (0 <= number) && (number <= 75);
    }

    // 抽選された数字を引数に渡して、マスに入っている数字を比較
    public void hit(int lotteryNumber) {
        if (lotteryNumber == this.number || this.number == 0) {
            this.hitStatus = true;
        }
    }

}
