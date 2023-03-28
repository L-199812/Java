import java.util.Scanner;

/**
 * @Auther King
 * @Description:
 */
public class OutIn {
    public static void main(String[] args) {
//        三种输出语句
//        1.输出且换行
        System.out.println(10);
//        2.输出不换行
        System.out.print(10);
        System.out.print(10);
        System.out.println();
//        3.格式化输出
        int a = 10;
        System.out.printf("a的值是：%d",a);
    }
}
// 有字符串的输入的时候，优先接收字符串的收入，不然enter键会导致很多问题
class KeyInput{
    public static void main(String[] args) {
//        ctr+鼠标左键 进入Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
//        接收字符串
        String name = scan.next();
        System.out.println("name:"+name);
        System.out.println("请输入您的年龄：");
//        接收整数型数字
        int age = scan.nextInt();
//        用到了字符串的相加
        System.out.println("age:"+age);
//        next开头的方法就是接收不同类型的数据的
//        用完了就要关闭
        scan.close();
    }
}
// 循环输入就是has开头的方法，返回的是一个布尔值，说明缓冲区中还有没有数据

// 1的个数
class number{
    public static void main(String[] args) {
        int n = -1;
        int count = 0;
//        只需要移动31次
        for(int i = 0; i < 32; i++){
            if(((n >>> i) & 1) != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

// 1的个数优化，对于1的个数很少的时候不需要移动很多次
class number2{
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for(int i = 0; i < 32; i++){

            if(n != 0){
                if(((n >>> i) & 1) != 0){
                    count++;
                }
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}

//计算1+二分之一-三分之一.......
class add{
    public static void main(String[] args) {
        double sum = 0;
//        +-号交替实现的方法用一个标志位
        int flag = 1;
        for(int i = 1; i <= 100; i++) {
            sum = sum + (1.0/i)*flag;
            flag = -flag;
        }
        System.out.println(sum);
    }
}
// 求1-999999的仙花数
class test4{
    public static void main(String[] args) {
        for(int i = 1; i <= 999999; i++){
            // 1.求是几位数
            int temp= i;
            int count = 0;
            while(temp != 0){
                temp /= 10;
                count++;
            }
            // 2.求每一位数字
            temp = i;
            int sum = 0;
            while(temp != 0){
                sum += Math.pow(temp%10,count);
                temp /= 10;
            }
            // 3.判断是不是水仙花数
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}


