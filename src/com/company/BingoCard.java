package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class BingoCard {
    int rows = 5;
    int columns = 5;

    // BingoCardはビンゴのマスの数だけBingoTroutを持つ
    // bingoCard = new BingoTrout[5][5]
    BingoTrout bingoTrout;

    int[][] cardNumber = new int[rows][columns];
    ArrayList<Integer> numList = new ArrayList<>();

    public ArrayList<Integer> makeNumList(){
        for (int i = 1; i <= 15; i++) {
            numList.add(i);
        }
        // 1~15のArrayListはnumList[0]に、 16~30のArrayListはnumList[1]に……のように格納したい
        Collections.shuffle(numList);

        return numList;
    }

    public BingoCard() {
        // 1~15のリストを作成する
        makeNumList();
        // ビンゴカードの列・行の数でfor文を回し、カードに数字を格納する
        for (int i = 0; i < rows; i++) {
            int counter = 0;
            for (int numListIndex: numList) {
                for (int j = 0; j < columns; j++) {
                    // numListから取り出した数値に、i*15の数を足すことで、列ごとの数値の範囲を定めている
                    cardNumber[j][i] = numList.get(counter) + (i * 15);
                    // numListから番号を取り出すときに使っている変数を更新（ここ修正できそう）
                    counter++;
                }
                // numListの要素数=15に対し、cardNumberに入れたい数=25
                // そのままcounterを回しているとIndexOutOfBoundsExceptionが発生してしまう
                // counterの数字がnumListの要素数を超えないように、ここでリセット
                if (counter >= 15) {
                    counter = 0;
                    // counterのリセットのみだと、B列の数字に15*iを足した数がG列に、I列の数字に15*iを足した数がO列に格納されてしまう
                    // そのような規則性を排除するため、ここでもShuffleをかける
                    Collections.shuffle(numList);
                }
            }
        }

        cardNumber[(rows / 2)][(columns / 2)] = 0;
    }
}
