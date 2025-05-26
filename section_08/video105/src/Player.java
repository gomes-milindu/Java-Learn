public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health = health - damage;

        if(health <= 0){
            System.out.println("Player kncked out of game");
        }
    }

    public int healthRemain(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        health = 100;
    }
}
