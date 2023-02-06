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
        System.out.println("задача1");
        var dog = 8 ;
        System.out.println(dog);
        var cat = 3.6 ;
        System.out.println(cat);
        var paper = 763789 ;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача2");
        var dog = 8 ;
        dog = dog + 4 ;
        System.out.println (dog);
        var cat = 3.6 ;
        cat = cat + 4 ;
        System.out.println (cat);
        var paper = 763789 ;
        paper = paper + 4 ;
        System.out.println (paper);
    }
    public static void task3 () {
        System.out.println("Задача3");
       double dog = 8.0 ;
       dog = dog - 3.5 ;
       System.out.println(dog);
        var cat = 3.6 ;
        cat = cat - 1.6 ;
        System.out.println(cat);
        var paper = 763789 ;
        paper = paper - 7639 ;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача4");
        var friend = 19 ;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);
    }
    public static void task5 (){
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
        var boxerOne = 78.2;
        System.out.println("Вес первого боксёра - " + boxerOne + " КГ");
        var boxerTwo = 82.7;
        System.out.println("Вес второго боксёра - " + boxerTwo + " КГ");
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксёров - " + totalWeight + " КГ");
        var differentiaWeight = boxerTwo - boxerOne;
        System.out.println("Разница в весе боксёров - " + differentiaWeight + " КГ");
    }
    public static void task7(){
        System.out.println("Задача7");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var differentiaWeight = boxerTwo - boxerOne;
        System.out.println("Разница в весе - " + differentiaWeight + " КГ");
        var heavierOn = (boxerOne+boxerTwo) % boxerOne;
        System.out.println("Тяжелее на - "+ heavierOn+ " КГ");
        var heavierOnVersion2 = boxerTwo % boxerOne;
        System.out.println(heavierOnVersion2 + " КГ");
    }
    public static void task8(){
        System.out.println("Задача8");
        var allHours = 640;
        var totalEmployees = allHours / 8;
        System.out.println("Всего сотрудников в компании - "+ totalEmployees + " человек");
        var addEmployees = 94;
        var ifMoreEmployees = totalEmployees + addEmployees;
        var moreEmployeesHours = ifMoreEmployees * 8;
        System.out.println("если в компании работает " + ifMoreEmployees + " сотрудника, то всего " + moreEmployeesHours + " часов работы может быть поделено между сотрудниками");
    }
}