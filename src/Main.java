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

    public static void task1() {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;

        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов: " + totalWeight + " кг");

        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе бойцов: " + weightDifference + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;

        var weightDifference1 = weightSecondBoxer - weightFirstBoxer;
        var weightDifference2 = weightSecondBoxer % weightFirstBoxer;

        System.out.println("Разница с использованием вычитания: " + weightDifference1);
        System.out.println("Разница с использованием отатка от деления: " + weightDifference2);
    }

    public static void task8() {
        // 1)----------------------------------------------
        System.out.println("Задача 8");

        var workingHours = 640;
        var hoursPerOne = 8;
        var amountOfWorkers = workingHours / hoursPerOne;

        System.out.println("Всего работников в компании — " + amountOfWorkers + " человек.");

        // 2)-----------------------------------------------
        var amountOfWorkers2 = amountOfWorkers + 94;
        var workingHours2 = amountOfWorkers2 * hoursPerOne;

        System.out.println("Если в компании работает " + amountOfWorkers2 + " человек, то всего " + workingHours2 + " часов работы может быть поделено между сотрудниками.");
    }


}