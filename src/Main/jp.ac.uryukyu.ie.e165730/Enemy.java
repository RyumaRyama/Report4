package jp.ac.uryukyu.ie.e165730;


public class Enemy extends LivingThing{
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.println("モンスター"+getName()+"は倒れた!");
        }
    }
}