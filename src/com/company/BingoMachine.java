package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BingoMachine {
    // 当たり数字
    int lotteryNumber;

    // 最大抽選対象数字
    // NumberのrangeDeciderを使うような形にしたい
    int maxLotteryNumber = 75;

    // maxLotteryNumberを最大値とした1から最大値までの
    // ArrayListを作り、shuffleしてそこから1つ取り出す
    ArrayList<Integer> numList = new ArrayList<>();

    public void setNumList() {
        for (int i = 1; i < lotteryNumber + 1; i++) {
            numList.add(i);
        }
    }

//    Collections.shuffle(numList);

    // ビンゴマシーンを回して、当たり数字を取り出す
    public void garaPon() {
        // シャッフルしたあとなので先頭から取り出していくだけでいいはず
        // だけど先頭を取り出す、というのをもっとスマートにできないか
        // (Rubyの.firstみたいに）
        this.lotteryNumber = numList.get(0);
        System.out.println(this.lotteryNumber + "が当たり数字です！");
    }

    public BingoMachine() {
        setNumList();
        Collections.shuffle(numList);
    }
}
