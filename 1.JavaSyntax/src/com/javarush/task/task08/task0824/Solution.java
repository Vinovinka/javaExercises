package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> family = new ArrayList<>();

        ArrayList<Human> grandFathers = new ArrayList<>();
        ArrayList<Human> father = new ArrayList<>();
        ArrayList<Human> mother = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();

        children.add(new Human("Анна", false, 13, new ArrayList()));
        children.add(new Human("Иван", true, 15, new ArrayList()));
        children.add(new Human("Катерина", false, 18, new ArrayList()));

        father.add(new Human("Антон", true, 34, children));
        mother.add(new Human("Юля", false, 31, children));

        grandFathers.add(new Human("Денис", true, 67, father));
        grandFathers.add(new Human("Клавдия", false, 76, mother));
        grandFathers.add(new Human("Семен", true, 66, father));
        grandFathers.add(new Human("Даная", false, 56, mother));

        family.addAll(grandFathers);
        family.addAll(father);
        family.addAll(mother);
        family.addAll(children);


        for (Human x : family) {
            System.out.println(x);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human (String name, boolean sex, int age, ArrayList children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
