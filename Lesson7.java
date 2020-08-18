// データ型

class Lesson7 {
    public static void main(String[] args) {

        // 数字のデータ型 
        // byte -100~100
        byte var1 = 1;
        // short -3万〜3万
        short var2 = 12345;
        // int -20億〜20億
        int var3 = 1234567890;
        // long 京の桁以上
        long var4 = 123456789000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);


        // 少数のデータ型
        // floatよりもdoubleの方が多くの小数点以下を扱える
        double var5 = 1.23456789;
        float var6 = 1.234F;

        System.out.println(var5);
        System.out.println(var6);


        // 文字のデータ型
        // 文字１つ ''
        char var7 = 'あ';
        // 文字２つ以上 "" (厳密には文字列ではなくクラス)
        String var8 = "あいうえお";
        
        System.out.println(var7);
        System.out.println(var8);


        // ブール型（真偽値）
        int var_a = 10;
        int var_b = 1;
        boolean var_bool;
        var_bool = (var_a > var_b);

        System.out.println(var_bool);
    } 
}