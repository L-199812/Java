/**
 * @Auther King
 * @Description:
 */
//继承就是对共性的抽取，提高代码复用

//    私有属性也能被继承，但是不能被访问，private等只是控制访问权限的，跟继承那些没关系
class animal {
    int age;
    String name;
    public void eat() {
        System.out.println(name + "is eating!");
    }
}
class dog  extends animal {
    public void barks() {
        System.out.println(name + "door");
    }
}
class cat extends animal {
    public void CatMouse() {
        System.out.println(name + "Mouse");
    }
}
public class class4 {
    public static void main(String[] args) {

    }
}

// c++ 中 class name :public name1,public name2 {}
// java当中没有多继承，super就是一种关键字，可以访问到父类继承下来的属性，this可以访问到所有，也就是继承下来的和自己的特性
// python里面是self,super一样的