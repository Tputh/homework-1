public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ!");
        System.out.println("дз 1 ");
        // Задача 1
        System.out.println("Задача 1");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задание 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("общий вес боксёров" + (boxer1Weight + boxer2Weight));
        System.out.println("разница веса боксёров" + (boxer2Weight - boxer1Weight));
        // Задание 7
        System.out.println("Задача 7");
        var totalWorkingHours = 640;
        var hoursePeyDey = 8;
        var totalEmployers = totalWorkingHours / hoursePeyDey;
        System.out.println("Всего работников в компании" + totalEmployers + "человек");

        totalEmployers = totalEmployers + 94;
        System.out.println("если в компании работает" + totalEmployers + "человек");
        var hoursTotal = totalEmployers * hoursePeyDey;
        System.out.println("то всего" + hoursTotal + "часов работы может быть поделенно между сотрудниками");
    }
}