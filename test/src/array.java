import java.util.Arrays;

/**
 * @Auther King
 * @Description:
 */
//与C语言那些是有点不一样的
//    连续的存储空间、存储相同的数据元素
public class array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int ret = array1[2];
        System.out.println(ret);

//        不能越界,越界运行会报错
//          int re = array1[3];
//        输出数组长度，不需要用sizeof，直接用方法.length
        int len = array1.length;

        int[] array2 = {1, 2, 3}; // 直接赋值，静态初始化
        int[] array3 = new int[]{1, 2, 3};  //动态初始化
//        以上两种没有本质区别，只是写法上的区别，内存的分配位置等都是一样的
        int[] array4 = new int[10]; // 只分配内存，但是没有赋值，只有默认值0，其他类型的都有默认值
//        可修改数组中的内容
        array1[1] = 100;



//        数组的遍历
//        1 for循环
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
//        2增强for循环，但是拿不到下表
        for(int x : array1) {
            System.out.println(x);
        }
//        3.Arrays工具
       String ret2 =  Arrays.toString(array1);
        System.out.println(ret2);
    }
}
