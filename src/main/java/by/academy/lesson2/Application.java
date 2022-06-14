package by.academy.lesson2;

public class Application {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Cat jack = new Cat("jack");
        System.out.println(tom.nickname);
        System.out.println(jack.nickname);
        jack.grow();
        jack.setIsHomeAnimal(true);
        System.out.println("cat age: " + jack.age);
        jack.eat();
        jack.sleep();
        jack.grow();
        System.out.println("cat age: " + jack.age);
        jack.setMoney(15.2);
        System.out.println("money: " + jack.getMoney());
        System.out.println("animal is home: " + jack.getIsHomeAnimal());
        System.out.println("first letter of nick: " + jack.getFirstLetter());
        System.out.println("tets");
        String t = "1";
    }
}
