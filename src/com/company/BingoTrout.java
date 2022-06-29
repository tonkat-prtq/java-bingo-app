package com.company;
import java.util.*;

public class BingoTrout {
    private int position_x;
    private int position_y;
    private int number;

    public int getPosition_x() { return this.position_x; }
    public int getPosition_y() { return this.position_y; }
    public int getNumber() { return this.number; }

    ArrayList<Integer> numList = new ArrayList<>();

    public void ShowBingoTroutInformation(int position_x, int position_y, int number) {
        System.out.println(position_x + ", " + position_y + "の数字は" + number + "です");
    }

    public BingoTrout(int position_x, int position_y) {
        this.position_x = position_x;
        this.position_y = position_y;


        // numListの中身が空のとき、中に1~15の数字を格納する
        if ((numList == null || numList.size() == 0)) {
            for (int i = 1; i < Numbers.RANGE_OF_COLUMN_BINGO_NUMBER + 1; i++) {
                numList.add(i);
            }
        }

        // numListをシャッフル
        Collections.shuffle(numList);

        // マスに数字を格納する
        this.number = numList.get(0) + Numbers.RANGE_OF_COLUMN_BINGO_NUMBER * this.position_x;

    }
//    private boolean hitStatus = false;
//    private ArrayList<Integer> numList = new ArrayList<>();

//    public int getNumber() {
//        return this.number;
//    }
//    public boolean getHitStatus() { return this.hitStatus; }

//    public void changeNumber(int num) {
//        this.number = num;
//    }

//     5*5のビンゴカードの場合の、数字範囲チェック
//    public boolean isValid(int number) {
//        return (0 <= number) && (number <= 75);
//    }

//     抽選された数字を引数に渡して、マスに入っている数字を比較
//    public void hit(int lotteryNumber) {
//        if (lotteryNumber == this.number || this.number == 0) {
//            this.hitStatus = true;
//        }
//    }

}
