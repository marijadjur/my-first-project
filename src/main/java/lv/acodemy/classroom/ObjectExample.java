package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.setWeight(3.6);
        System.out.println(barsik.getWeight());

        System.out.println(barsik);

        barsik.speak();
        barsik.feed();

        Cat tigi = new Cat("Tigi", "white", "persian", "male", true);
        tigi.setWeight(2.3);
        tigi.setAge(3);
        System.out.println(tigi);

        System.out.printf("My cat`s name is: %s. My cat is %d old.\n", tigi.getName(), tigi.getAge());

        tigi.walk();
        tigi.walk();
        tigi.walk();
        tigi.walk();
        tigi.walk();
        tigi.walk();
        System.out.println(tigi.getEnergy());

        //Update methode feed, so we can feed our cat;
        //Every feed methode call increase energy for 1;

        tigi.feed();
        tigi.feed();
        tigi.feed();
        tigi.feed();
        tigi.feed();
        tigi.feed();
    }
}
