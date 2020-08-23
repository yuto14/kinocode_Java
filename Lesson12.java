// メソッド
// 利点　同じコードを２回書かなくて良い、同じものを他の場面で使える、他の人も使用できる。
// 自分で作るもの、Javaが用意しているメソッドの２種類

lass Lesson11 {
    //public static void main(String[] args)部分がメソッド定義部分

    //public(アクセス修飾子）他のクラスからアクセスできるかを決める。
    //アクセス修飾子は４つ　public（他クラスからアクセス可）,protected（同じパッケージ、サブクラスから可）,指定なし（同じパッケージから可）,private（同じクラスから可）の４つ

    //static(その他の修飾子)代表的なものは３つ static(クラスから直接呼び出し可)、abstract(クラスをインスタンス化できない)、final(クラスの上書き不可)

    //void(戻り値のデータ型) void(戻り値なし)、int(整数型)、String(文字列型)

    //main(メソッド名)mainメソッドはJavaコードに必ず必要

    //(String[] args)※引数のデータ型（mainメソッドの場合左記が一般的）

    public static void main(String[] args) {
        //for文
        // for(スタート値(カウンタ変数); 継続条件; 増減値)
        for(int i = 0; i <= 4; i++){
            System.out.println(i);
        }
    }
}
