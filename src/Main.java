public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

    var friend = 19;
    friend = friend + 2;
        System.out.println(friend);
    friend = friend / 7;
        System.out.println(friend);

    var frog = 3.5;
        System.out.println(frog);
    frog = frog * 10;
        System.out.println(frog);
    frog = frog / 3.5;
        System.out.println(frog);
    frog = frog + 4;
        System.out.println(frog);

    var heavyBoxer = 82.7;
    var lightBoxer = 78.2;
    var totalWeight = heavyBoxer + lightBoxer;
        System.out.println("общий вес боксёров " + totalWeight +" кг!");
    var weightDifference = heavyBoxer - lightBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");
    var differenceWeight = heavyBoxer % lightBoxer;
        System.out.println("Разница в весе " + differenceWeight + " кг!");

    var workingHours = 640;
    var workingDay = 8;
    var companyEmployees = workingHours / workingDay;
        System.out.println("Всего работников в компании " + companyEmployees + " человек.");
    var employeesNow = companyEmployees + 94;
        System.out.println(employeesNow);
    var newWorkShift = workingHours / employeesNow;
        System.out.println("Если в компании работает " + employeesNow + " человека, то всего по " + newWorkShift + " часа работы может быть поделено между сотрудниками." );













    }


}