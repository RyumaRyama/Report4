package jp.ac.uryukyu.ie.e165730;


public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.println("勇者"+name+"は道半ばで力尽きてしまった。");
        }
    }
}
