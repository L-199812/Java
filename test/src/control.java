import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Auther King
 * @Description:
 */
// 顺序结构
public class control {
    public static void main(String[] args) {
//        选择结构if(布尔表达式){}
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0){
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");
        }
//        else也是与最近的if匹配，最好把{}加上，可以增强代码可读性
    }
}
// 选择结构switch String、枚举这种引用类型的类型也可以 8种基本类型中：char short byte int 基本都是用int
class main2{
    public static void main(String[] args) {
        int a = 1;
        String b = "hello";
        switch(b){
            case "hello":
                System.out.println("one");
                break;
            case "abc":
                System.out.println("two");
                break;
        }
    }
}

//while循环结构
class test2{
    public static void main(String[] args) {
        int i = 1;
        while(i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
//for循环结构
class test3{
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}

// 调试比较智能


