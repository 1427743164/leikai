//学号202100350
//姓名雷凯
class human {
    String name;
    String id;
    String sex;
    public void humaneat(){
        System.out.println(name+"吃饭")；
    }
    public void humansleep(){
        System.out.println(name+"睡觉")；
    }
    public void humanwalk(){
        System.out.println(name+"走路")；
    }

}
class student extends human{
    String studentid;
    String classnum;
    String grade;
    public void studentclss(){
        System.out.println(name+"上课")；
    }
    public void studenttest(){
        System.out.println(name+"考试")；
    }
    public Student(String name, String id, String sex, String studentid, String classnum, String grade) {
        this.id = id;
        this.classnum = classnum;
        this.grade = grade;
        count++;
    }
}

class teacher extends human{
    String teacherid;
    String post;
    String wageid;
    public void teacherclss(){
        System.out.println(name+"上课")；
    }
    public void taacherwork(){
        System.out.println(name+"批卷")；
    }
    public Student(String name, String id, String sex, String steacherid, String post, String wageid) {
        this.id = id;
        this.teacherid = teacherid;
        this.post = post;
        count++;
    }

}

class police extends human{
    String policenum;
    String department;
    String rank;
    public void policework(){
        System.out.println(name+"执勤")；
    }
    public void policetrain(){
        System.out.println(name+"训练")；
    }
    public Student(String name, String id, String sex, String policenum, String department, String rank) {
        this.id = id;
        this.policenum = policenum;
        this.department = department;
        count++;
    }
}
    public static void main(String[] args) {
            Student  a = new Student("1","a","男","20210122222","8班","90");
            Student  b = new Student("2","b","男","20210174527","4班","99");
            Student  c = new Student("3","c","女","20210171721","1班","100");
            Teacher  d = new Teacher("4","d","男","20180727452","班主任","200");
            Teacher  e = new Teacher("5","e","男","20140452748","数学老师","150");
            Policeman f = new Policeman("6","f","女","8952","刑事部","二级警员");
            Policeman g = new Policeman("7","g","女","4821","刑事部","二级警员");
            Student.count();  
            Teacher.count();  
            police.count(); 
    }