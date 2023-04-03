/**
 * @Auther King
 * @Description:
 */
//    静态内部类:静态内部类创建对象不需要外部类对象
//    静态内部类不能访问外部类的非静态成员变量，因为外部类的非静态成员变量需要外部类的引用的，也就是需要外部类的对象
//    大原则：：一个类的属性就是静态和非静态，静态里面不能有非静态的
public class class3 {
    int data1 = 1;
    public int data2 = 2;
    public static int data3 = 3;
    public void func() {
        System.out.println("out::func");
    }
//    静态内部类
    static class InClass {
        int data4 = 4;
        public int data5 = 5;
        public static int data6 = 6;
        public void func2() {
            System.out.println("in::func2");
        }

    @Override
    public String toString() {
        return "InClass{" +
                "data4=" + data4 +
                ", data5=" + data5 +
                '}';
    }
}
}
class test9 {
    public static void main(String[] args) {
        class3.InClass inClass = new class3.InClass();
        System.out.println(inClass);
    }
}
//局部内部类：只能在方法内部使用，其他位置都不能用
//java比较安全，不会让程序员拿到真的栈和堆的地址
//右键----生成