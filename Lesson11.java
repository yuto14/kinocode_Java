// 繰り返し処理

class Lesson11 {
    public static void main(String[] args) {
        //for文
        // for(スタート値(カウンタ変数); 継続条件; 増減値)
        for(int i = 0; i <= 4; i++){
            System.out.println(i);
        }

        //ネスト（for文の中にfor文をいれる）
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++){
                System.out.println(i + "-" + j);
            }
        }

        // break文(条件に当てはまると処理を中断)
        for(int i = 0; i <= 4; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        // continue(条件に当てはまると処理をスキップ)
        for(int i = 0; i <= 4; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        // 配列の繰り返し処理
        int array[] = {2, 4, 6, 8, 10};
        for(int i = 0; i <= 4; i++){
            System.out.println(array[i]);
        }

        int array2[] = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int i = 0; i <= 4; i++){
            sum += array2[i];
        }
        System.out.println(sum);
    }
}