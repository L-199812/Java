/**
 * @Auther King
 * @Description:
 */
public class YinYong {
//    jvm的内存划分
//    1.内存是一块连续的内存空间
//    2.分区：方法区、虚拟机栈、本地方法栈、堆、程序计数器；方法区和堆是线程共享的区域
//    引用
//    局部变量栈区一个数组名字，指向堆上的一个内容，也就是数组名字就是代表的一个对象，该对象存储在堆上
//    一个引用只能指向一个对象


    public static void main(String[] args) {
        int[] array1 = null; // 空指针，java中null地址跟0地址没有区别
//        对象的回收是没有人引用，局部变量的销毁是函数结束
//        java里面的数组都是对象，是引用变量
//        java里面一切皆对象，数组也是，类似于C++历练的stl
//        二维数组就是一维数组，数据元素是一维的而已，二维数据是要明确几行几列的{{},{}......}
    }
}