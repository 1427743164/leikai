class animal {
    private String color;
    private int age;

    public animal() {
    }

    public animal(String color, int age) {
        this.color = color;
        this.age = age;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String something) {
        System.out.println("动物在吃" + something);

    }
}

class cat extends animal {
    public cat() {
    }

    public cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛侧着头吃" + something);

    }

    public void catchmouse() {
        System.out.println("猫抓老鼠");
    }
}

class dog extends animal {
    public dog() {
    }

    public dog(String color, int age) {
        super(color, age);

    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死地抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keeppet(animal p, String something) {
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + p.getColor() + "的" + p.getAge() + "岁的宠物");
        if (p instanceof dog d) {
            d.eat(something);
        } else if (p instanceof cat c) {
            c.eat(something);
        }

    }
}

public class duotai {
    public static void main(String[] args) {
        person a = new person("老王", 32);
        dog d = new dog("黑色", 2);
        a.keeppet(d, "骨头");
        person b = new person("老李", 35);
        cat c = new cat("白色", 3);
        b.keeppet(c, "鱼");

    }

}