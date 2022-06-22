package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class BingoTroutTest {

    @Test
    void getNumber() {
        BingoTrout b1 = new BingoTrout();
        b1.number = 1;
        assertEquals(b1.number, b1.getNumber());
    }

    @Test
    void isValid() {
        BingoTrout b2 = new BingoTrout();
        b2.number = 10;
        assertTrue(b2.isValid(b2.number));
    }

    @Test
    void hit() {
        BingoTrout b3 = new BingoTrout();
        BingoTrout b4 = new BingoTrout();

        b3.number = 0;
        b4.number = 15;

        b3.hit(15);
        b4.hit(15);

        assertEquals(b3.getHitStatus(), b4.getHitStatus());

        // isHitメソッドが呼び出されて、返すhitStatusが期待するもの（この場合はtrue）ならば
        // テスト成功としたいが、assertEqualsの第一引数の書き方が分からず。
        // assertEquals(b3.hitStatus, b4.isHit(15));
    }
}