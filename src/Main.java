public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");

        var boxFirst = 78.2;
        var boxSecond = 82.7;
        var boxWeight = boxFirst + boxSecond;
        System.out.println(boxWeight);
        var boxDiff = boxSecond - boxFirst;
        System.out.println(boxDiff);

        System.out.println("Задание 7");

        var boxMod = boxSecond % boxFirst;
        System.out.println(boxMod);

        System.out.println("Задание 9");

        var workTime = 640;
        var workerTime = 8;
        var workers = workTime / workerTime;
        System.out.println("Работников в компании - " + workers + " человек");
        workers = workers + 94;
        workerTime = workTime / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workerTime + " часов работы может быть поделено между сотрудниками");
    }
}
