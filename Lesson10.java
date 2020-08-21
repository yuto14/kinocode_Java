// 条件分岐

class Lesson10 {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 20){
            System.out.println("大人");
        } 


        int age2 = 18;
        if (age2 >= 20){
            System.out.println("大人２");
        } else {
            System.out.println("子供２");
        }

        int age3 = 0;
        if (age3 >= 20){
            System.out.println("大人３");
        } else if(age3 == 0) {
            System.out.println("赤ちゃん３");
        } else {
            System.out.println("子供３");
        }
    }
}