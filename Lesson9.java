// 演算子

class Lesson9 {
    public static void main(String[] args) {

        // 算術演算子
        int x = 10;
        int y = 2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);


        // 関係演算子
        int x2 = 10;
        int y2 = 2;
        int z2 = 10;

        System.out.println(x2 >= y2);
        System.out.println(x2 <= y2);
        System.out.println(x2 == z2);
        System.out.println(x2 != z2);


        // 論理演算子(複数の条件を判断させる演算子)
        int x3 = 10;
        int y3 = 2;

        System.out.println(x3 >= 5 && y3 <= 10);
        System.out.println(y3 >= 5 && x3 <= 10);
        System.out.println(x3 == 2 || y3 == 2);
        System.out.println(x3 == 1 || y3 == 1);

        // 代入演算子 ＝
        // 複合代入演算子（足算、引算等と組み合わせて行う演算子）
        int x4 = 8;
        int y4 = 12;
        int z4 = 20;

        System.out.println(x4 += 10);
        System.out.println(y4 += z4);

        //インクリメント、デクリメント
        int x5 = 8;
        int y5 = 8;

        x5++;
        y5--;
        
        System.out.println(x5);
        System.out.println(y5);
    }
}