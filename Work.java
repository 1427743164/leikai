class Pepole{
    String name;
    String phone;
    public void eat(){
        System.out.println("我喜欢吃");
    }
}
class Student extends Pepole{
    String id;
    String grade;
    String major;
    String school;
    String sth;
    String courselearn;
    String workway;
    public void course(){
        System.out.println("学习课程"+courselearn);
    }
    public void work (){
        System.out.println("学习方法"+workway);
    }
    public void eat(){
        System.out.println("我喜欢吃"+sth);
    }
}
class Teacher extends Pepole{
    String title;
    String teachCourses;
    String school;
    String salary;
    String something;
    String courseteach;
    String food;
    public void teachcourse(){
        System.out.println("授课方法"+courseteach);
    }
    public void workteach (){
        System.out.println("学习方法"+somesthing);
    }
    public void eat(){
        System.out.println("我喜欢吃"+food);
    }
}