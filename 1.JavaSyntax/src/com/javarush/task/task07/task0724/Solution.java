package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {

    public static void main(String[] args) {
        Human granddad1 = new Human("Анатолий", true, 90);
        Human granddad2 = new Human("Павел",true, 78);
        Human grany1 = new Human("Катерина", false, 89);
        Human grany2 = new Human("Антонина", false, 67);
        Human mother = new Human("Вылерия", true, 24, granddad1, grany1);
        Human father = new Human("Ян", true, 22, granddad2, grany2);
        Human child1 = new Human("Антон", true, 45, father, mother);
        Human child2 = new Human("Кантонина", false, 11, father, mother);
        Human child3 = new Human("Валентина", false, 78, father, mother);
        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grany1);
        System.out.println(grany2);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}