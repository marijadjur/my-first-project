package lv.acodemy.classroom;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cat {

    private String name;
    private String color;
    @Setter
    private int age;
    @Setter
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;

    private final int MAX_Energy = 5;
    private int energy = 5;

    public Cat(String name) {
        this.name = name;
    }
       public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }
    public boolean HasFur() {
        return hasFur;
    }
        public void speak() {
        System.out.println("Meow!");
    }
    public void feed () {
        if (energy == MAX_Energy) {
            System.out.println("I cannot eat anymore!");
        } else {
            System.out.println("Om-nom-nom!");
            energy++;
        }
    }
    public void walk () {
        if (energy == 0) {
            System.out.println("I do not have enough energy to walk!");
        } else {
            System.out.println("Walkie-walkie!");
            energy--;
        }
    }
   }

