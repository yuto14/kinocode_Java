// クラス：　データ、処理をまとめたもの
// 　　　　　Javaではデータのことをフィールド
//         処理のことをメソッドという
//         メソッド、データのようなクラスの要素をメンバーという。

// フィールド：　クラス内で定義された変数のことでメンバー変数ともいう。
//             変数と同じように数値、文字列を代入、参照できる。
//             クラスにフィールドを追加することをフィールドを定義するという


class Student {
    //nameというフィールドを作成
    String name = "sato";
    public void calculateAvg(int math,int english){
        System.out.println((math + english) / 2);
    }
}


// クラスはそのままでは使用できず、クラスから作られたインスタンスを変数に代入してから使用する（インスタンス化しないと使用できない）
// インスタンスを作ることをインスタンス化、オブジェクト化、オブジェクト生成という。
//　インスタンス化とはクラスという型からインスタンスというものを作ることをいう。
public class Lesson13 {
    public static void main(String[] args) {
        // インスタンス化（a001はオブジェクト名）
        Student a001 = new Student();
        //　フィールドに値を代入（オブジェクト名.フィールド名で代入）
        a001.name = "sato";
        System.out.println(a001.name);
        a001.calculateAvg(90,80);

        Student a002 = new Student();
        a002.name = "susuki";
        System.out.println(a002.name);
        a002.calculateAvg(70,80);

    }

}

// クラスのメリット
//   一度定義すると後からいくらでもオブジェクトを作ることが可能
