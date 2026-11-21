package loopwhile;

public class WhileDemo2 {
    public static void main(String[] args) {

       //1.定义一个变量记录本金
        double principal = 10000;
       /* //2.定义变量记录期望的本金
        double target = 20000;
        //3.定义变量记录年数
        int year = 0;
        while (principal < target) {
            principal += principal * 0.017;
            year++;
        }
        System.out.println("需要" + year );*/
        //计算一年的利息
        System.out.println(10000/(principal*0.017));





    }

}
