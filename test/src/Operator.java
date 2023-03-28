import org.w3c.dom.ls.LSOutput;

/**
 * @Auther King
 * @Description:
 */
public class Operator {
//    大多数都是通用的
//    但是java里面可以进行12.5%2.5这种小数求余数
    public static void main(String[] args) {
        System.out.println(12.5%2.5);
    //    前置++和后置++跟C那些是一样的
        int a = 10;
        int b = ++a;  // 先++，再使用
        System.out.println(b);
    //    特殊的地方
        a = a++;
        System.out.println(a);

    //   逻辑表达式也有短路问题，当& 和| 的两边是逻辑表达式时，也会当成逻辑运算
        int l = 10;
        System.out.println(l > 9 || a++>0);
        System.out.println(a);

    //位操作：按位与 按位或 按位异或  // 左移<< 右移>>  按位操作的都是在二进制的基础上进行的
//        右移有有符号右移和无符号右移>>>
    }
}
class test1{
    public static void main(String[] args) {
//        条件表达式
        int a = 10;
        int b = 20;
        int max = a > b? a:b;
        System.out.println(max);
    }
// java当中必须把值赋给变量，不然就会报错
//    优先级最好的局势加括号控制

}
