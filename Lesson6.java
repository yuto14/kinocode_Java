// 変数

class Lesson6 {
    public static void main(String[] args) {
        int var = 1;
        int var01 = 2;
        int var_01 = 3;
        int var$01 = 4;
        int VAR = 5;
        int Var = 6;
        // 変数にできない文字が含まれるためエラーになる
        // int var-01 = 5;
        // int 01var = 6;

        // 予約語（既に役割が決まっている単語）のためエラー
        // int return = 7;
        // int class = 8;

        System.out.println(var);
        System.out.println(var01);
        System.out.println(var_01);
        System.out.println(var$01);
        // エラーになる
        // System.out.println(var-01);
        // System.out.println(01var);
        System.out.println(VAR);
        System.out.println(Var);
        // エラーになる
        // System.out.println(return);
        // System.out.println(class);
    }
}