// 配列

class Lesson8 {
    public static void main(String[] args) {

        // 配列（宣言と代入を別）
        String[] array;
        array = new String[3];

        array[0] = "佐藤";
        array[1] = "鈴木";
        array[2] = "高橋";

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        // 配列の宣言と代入を同時に
        String[] array2 = {"伊藤", "田中", "山本"};
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        array2[1] = "中田";
        System.out.println(array2[1]);



        // 多次元配列
        // 配列（宣言と代入を別）
        String[][] array3;
        array3 = new String[2][2];

        array3[0][0] = "sato";
        array3[0][1] = "suzuki";
        array3[1][0] = "takahashi";
        array3[1][1] = "tanaka";

        System.out.println(array3[0][0]);
        System.out.println(array3[0][1]);
        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);


        // 多次元配列の宣言と代入を同時に
        String[][] array4 = {{"sato2", "suzuki2"},{"takahashi2", "tanaka2"}};
        System.out.println(array4[0][0]);
        System.out.println(array4[0][1]);
        System.out.println(array4[1][0]);
        System.out.println(array4[1][1]);
    }
}