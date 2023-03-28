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
