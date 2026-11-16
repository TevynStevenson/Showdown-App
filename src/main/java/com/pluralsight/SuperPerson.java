package com.pluralsight;

public class SuperPerson {

    private String name;
    private int health;
    private int experiencePoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health >= 0){
            this.health = health;
        }

    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        if(experiencePoints >= 0 ){
            this.experiencePoints = experiencePoints;
        }
    }

    public void takeDamage(int damage){
        if(damage >= 0){

            this.health = Math.max(0,this.health - damage);
        }
    }

    public boolean isAlive(){
        if(getHealth() > 0 );
        return getHealth() > 0;
    }

    public String getStatus(){
        return String.format("%s has %d health", getName(),getHealth());
    }

    public void fight(SuperPerson opponent){
        System.out.printf("%s prepare to fight %s", getName(), opponent.getName());
    }
}
