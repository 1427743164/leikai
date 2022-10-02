package Jxcia;
class Student {
    String name;
    public void speak(){
        System.out.println("我是江信学院的学生")；
    }
}
class Softstudent extends Student {
    public void learn () {
        System.out.println("我是"+name+",我正在学习Java");
    }
}
public class TestExtends {
    public static void main(String[] args) {
        Softstudents ss = new Softstudents();
        ss.name="张三";
        ss.speak();
        ss.learn();
    }
}