package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {

        SuperPerson superPerson = new SuperPerson();

        //Make new person
        superPerson.setName("Super Kimball");
        superPerson.setHealth(100);
        superPerson.setExperiencePoints(25);

        SuperHero superHero = new SuperHero();
        superHero.setName("Super Tev");
        superHero.setHealth(100);
        superHero.setExperiencePoints(25);

        SuperVillain superVillain = new SuperVillain();
        superVillain.setName("Dracula");
        superVillain.setHealth(100);
        superVillain.setExperiencePoints(75);

        superHero.fight(superVillain);
        superVillain.takeDamage(25);
        superHero.takeDamage(10);

        System.out.println(superHero.getStatus());
        System.out.println(superVillain.getStatus());



    }
}
