package com.company;

// 抽選対象の数字の範囲(5*5のビンゴなら75など）をインターフェイスとして持ち
// BingoCard、BingoTroutの両方で使えるようにしたい
public interface Number {
    int rangeDecider(int size);
}
