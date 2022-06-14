package by.academy.lesson2;

class Cat {
    int age;
    String nickname;
    private double money;
    private char firstLetter;
    private boolean isHomeAnimal;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    private void setFirstLetter() {
        firstLetter = nickname.charAt(0);
    }

    public boolean getIsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }

    public void grow() {
        this.age++;
    }

    public void sleep() {
        System.out.println("Cat sleep.");
    }

    public void eat() {
        System.out.println("Cat eat.");
    }

    public void walk() {
        System.out.println("Cat walk.");
    }

    public Cat() { }

    public Cat(String catName) {
        nickname = catName;
        setFirstLetter();
    }
}
