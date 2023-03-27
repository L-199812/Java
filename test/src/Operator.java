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

//    

}
}
