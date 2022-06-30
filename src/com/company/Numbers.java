package com.company;

public class Numbers {
    // 定数クラスとして使いたいので、コンストラクタをprivateにする
    private Numbers(){}

    // 列に入るビンゴの数の範囲
    public static final int RANGE_OF_COLUMN_BINGO_NUMBER = 15;

    // 列・行の数（ここに実装すべきかは要検討）
    public static final int BINGO_CARD_ROWS = 5;
    public static final int BINGO_CARD_COLUMNS = 5;

    public static int rangeDecider(int rows, int columns) {
        return rows * columns * 3;
    }
}
