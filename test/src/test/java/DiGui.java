/**
 * @Auther King
 * @Description:
 */

// 递归思想：自己调用自己，然后有出口(也就是终止条件或者算式的起始条件)
// 每一次调用都要在栈上开辟函数栈帧
//    每次递归的时候，这个方法只执行了一部分就去执行另一部分了
//    归的时候是把当前方法没执行完的部分执行完，归可以return触发，也可以}触发，最先是return触发，也就是函数栈帧的先进后出
//    递归的次数是一样的
public class DiGui {
    public static void main1(int n){
        if(1 == n) {
            System.out.println(n);
            return ;
        }
        main1(n-1);
        System.out.println(n);
    }
    public static int function(int n){
//        设置出口
        if (1 == n){
            return 1;
        }
        return n*function(n-1);
    }
//    打印各位数
    public static void function2(int n){
        if (n < 10){
            System.out.println(n);
//            这里一定要加return 不然半天找不出问题
           return ;
        }
        function2(n / 10);
        System.out.println(n % 10);
    }
//    各位数的值相加
    public static int function3(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + function3(n / 10);

    }

    public static int function4(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return function4(n-1) + function4(n-2);
    }
    public static void main(String[] args) {
//        main1(10);
//        System.out.println(function(4));
//        function2(123);
//        System.out.println(function3(123));
        System.out.println(function4(5));
    }
}
