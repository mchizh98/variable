public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
    }

    public static void task7 () {
        System.out.println("Задача7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница веса спорстменов " + weightDifference + " кг");
        var difference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница с помощью функции остатка от деления " + difference + " кг");
    }

    public static void task8 () {
        System.out.println("Задача8");
        var totalWorkingTime = 640;
        var timeOfOne = 8;
        var totalEmployees = totalWorkingTime / timeOfOne;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingTime = totalEmployees * timeOfOne;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingTime + " часов работы может быть поделено между сотрудниками");
    }

}