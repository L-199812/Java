import org.w3c.dom.ls.LSOutput;

/**
 * @Auther King
 * @Description:
 */

// java里面局部变量如果不初始化是不能用的，编译都会出错

//    static修饰的方法是静态方法，调用不依赖对象，直接类名.方法就可以，C++里面是类名：：方法
//    static 修饰的是类的成员变量和成员方法，不修饰类方法的局部变量

//    import导入的是一个具体的类，不能导入一个包

//    内部类，就是定义在一个类里面的类就是内部类，有静态和非静态内部类
//    内部类中不能使用static去修饰,非要定义可以加一个final,final有点类似于const 常量一般定义为大写
//    内部类可以访问外部类和内部类的全部，同名的话优先内部类的
//    内部类中调用外部类的同名成员变量：在对象中拿到外部类的this
//    外部类中不能直接访问内部类的成员，要访问就必须要创建内部类的对象
    class OutClass {
        public int data1;
        int data2;
        public static int data3;
        public void test() {
            System.out.println("outclass::test()");
        }
        public class InClass {
            public int data4;
            int data5;
            public static final int DATA6 = 10;
            public void func() {
                System.out.println("inClass::func()");
            }
        }
}
public class class2 {
    public static void main(String[] args) {
//        局部变量
//        String s;
//        s = s++;
//        System.out.println(s);
//        内部类的使用1
        OutClass outClass = new OutClass();
        OutClass.InClass InClass = outClass.new InClass();
//        内部类的使用2
        OutClass.InClass InterClass = new OutClass().new InClass();

    }
}
