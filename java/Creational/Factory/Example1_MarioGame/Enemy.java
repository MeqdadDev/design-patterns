package DesignPatterns.Creational.Factory;

public abstract class Enemy {
    
    private String name;
    private int damage;
    private int health;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void showUp(){
        System.out.println(getName() + " is showing up. Damage is " + getDamage() + ". Health is " + getHealth());
    }
}
