package com.pluralsight;

import java.util.ArrayList;

public class ShowdownApp {
    public static void main(String[] args) {
/*
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

        SuperPerson hero = new SuperHero();




 */

        //New methods

        SuperPerson hero = new SuperHero("Tev",500,100);
        SuperPerson villain = new SuperVillain("Loki",500,250);
        SuperPerson antiHero = new SuperPerson("Asta", 300);

 /*       //Polymorphism works, the compiler knows that these are heroes and villains when call fight
        hero.fight(villain);
        villain.fight(hero);
        antiHero.fight(hero);
*/
        ArrayList<SuperPerson> SuperPersons = new ArrayList<SuperPerson>();
        SuperPersons.add(hero);
        SuperPersons.add(villain);
        SuperPersons.add(antiHero);

        for (SuperPerson superPerson : SuperPersons) {

            //instance of operator
            if(superPerson instanceof SuperVillain){
                System.out.println("We found a SuperVillain");
            } else if(superPerson instanceof SuperHero){
                System.out.println("We found a SuperHero");
            }

            if(superPerson instanceof SuperPerson){
                System.out.println("We found a SuperPerson");
            }
        }


        hero.fight(villain);
        villain.fight(hero);

        for (SuperPerson superPerson : SuperPersons) {
            if(hero.isAlive()){
                hero.fight(villain);
            } else if(villain.isAlive()){
                villain.fight(hero);
            }
        }
    }
}
