/**
 * @Auther King
 * @Description:
 */
// java里面的string里面有两个属性:value hash,其实就是字符数组维护的,string是一个类,每一个实例化的字符串都是一个对象
// 增删查改的方法都可以找到,了解有很对方法就行了
public class JavaString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("abc");
        System.out.println(str1 + str2);
        for (int i = 0;i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.println(ch);
        }
    }
}
// 字符串常量池:只要是双引号引起来的,就会检查常量池中有没有,没有就存进去,有就拿来用就好了,字符串常量池可以提高存储空间利用和利用效率,有一种缓存的思想
// string table其实是字符数组

// string string buffer string builder
// string 的内容不可修改,其他两个可以修改
// string buffer与string builder大部分功能是相似的
//string buffer采用同步处理,属于线程安全操作,但是StringBuilder没有采用,属于线程不安全操作

// 错误和异常
// 错误是需要程序员自己解决的,异常处理可以规避异常终止代码,比如网络不好,不能把程序搞崩溃吧
// try catch 就是事后认错型,捕获异常之后继续执行,没有捕捉对应的异常,最终异常就会交给JVM,从而程序崩溃
// 不会同时抛出两个既以上的异常
// 如果异常类之间存在父子类关系,不要把父类放在最前面,要放在后面
// try catch finally   finally是解决一些关闭资源的问题,就算异常了,也要把资源关闭
// 自定义异常就是为了抛出异常,好定位出出错位置