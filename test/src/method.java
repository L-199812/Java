/**
 * @Auther King
 * @Description:
 */
public class method {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
//        java里面的方法就是函数
//    public static 返回值类型 方法名（形式参数列表）{}
//        java是全局搜索函数
        add(10,20);
//        函数栈帧
    }
}
// 方法的重载：方法的名称一样、参数列表不一样、返回值不影响；本质就是编译器会通过参数更改名字，也就是签名

//利用函数重载求两个整数和三个整数中的最大值
class test12{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(max(a, b));
        System.out.println(max(a, b, c));

    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int max(int a, int b, int c){
        int max = max(a, b);
        return max > c ? max : c;
    }
}
//迭代求解斐波那契数
class test13{
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++){
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

}
