# ビンゴゲーム作成

## 要件

### 必須機能

- 5*5マスのビンゴカードを作成する
  - 真ん中は最初から空いている
  - 左からB列, I列, N列, G列, O列とする
    - 各列にはそれぞれ左から1-15, 16-30, 31-45, 46-60, 61-75からランダムな数字が入る
- ビンゴマシーンが当たりの数字をランダムに選ぶ
- マシンが選んだ当たりの数字がビンゴカードに入っていたら、その数字部分を空ける（状態を当たり状態に変える）
- ビンゴの判定をする
  - 状態を変えたカードの数字の縦、横、斜めの数字の状態を確認する
    - 縦、横、斜めの数字を見て、そのラインの数字がすべて空いているか（当たり状態か）を見る
      - 当たり状態ならBINGOとする
      - ハズレ状態ならビンゴマシーンを再度動かす

### 追加機能

- ビンゴカードのマスの数を変更できるようにする
- 複数人で参加できるようにする（ユーザーの作成）
  - 誰が何等なのか分かるようにする
- ビンゴの数字の幅を変更できるようにする


## 必要そうなクラス

- ビンゴカード
  - 属性
    - 行
    - 列
    - カードの数字
  - 操作
    - マシーンの当たり数字を見る
    - 穴が開く（当たり状態になる）

- ビンゴマシーン
  - 属性
    - 抽選対象の数字
  - 操作
    - 当たり数字を選ぶ

### 追加機能で必要そうなクラス

- ユーザー
  - 属性
    - ビンゴカード
    - 順位
  - 操作
    - (カードの穴を開ける)

- 神様
  - 属性
  - 操作
    - ビンゴカードを配る
    
### その他メモ

- ビンゴカードの真ん中に穴を開ける
  - rows, columnsよりそれぞれ1引いて、bingoCard[rows][columns]の位置が真ん中となる
  - 真ん中には特定の数字か記号を入れる
- 当たり数字を生成する
  - カードに当たり数字があれば、状態を変える（数字を※マークに置き換えるなど）
- ビンゴの判定をする
  - 優先度低）5＊5のカードの場合、ビンゴ発生は最短で4回の当たり数字生成後というのを考慮
  - 優先度低）一度ビンゴ判定した列・行は、判定をスキップする

#### ビンゴカードの数字生成（数字が重複してうまくいかなかったパターン）

```java:BingoCard
    public BingoCard() {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                Random rand = new Random();
                cardNumber[i][j] = (rand.nextInt(15) + 1) + 15 * j;
            }
        }
    }
```
