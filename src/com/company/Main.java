package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        //1~20の整数値を持つリストを用意
        for (int i = 0; i <= 30; i++) {
            numList.add(i);
        }

        //リストを表示（確認用）
        System.out.println("作成したリストはこちらです");
        System.out.println(numList);


        //shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(numList);

        int rows = 5;
        int columns = 5;
        int counter = 0;

        int[][] bingoCard = new int[rows][columns];
        //ランダムにした結果を表示
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                bingoCard [i][j] = numList.get(counter) + 1;
                counter++;
            }
        }

        for (int[] ints : bingoCard) {
            for (int anInt : ints) {
                System.out.print(String.format("%02d", anInt) + " ");
            }
            System.out.println();
        }

    }
}
