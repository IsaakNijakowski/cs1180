/*
 * Isaak Nijakowski
 * Practice 10
 * CS1180-06L
 * 11/8/2021
 */

class Practice10 {
    public static void main(String[] args) {
        //Initialize player objects
        Player user = new Player("Isaak",20,10);
        Player enemy = new Player("Green Slime",10,20);
        //Fight till player reaches zero health
        System.out.println(user.toString() + "  " + enemy.toString());
        while (user.getHealth() > 0 && enemy.getHealth() > 0) {
            user.hit(enemy);
            enemy.hit(user);
            System.out.println(user.toString() + "  " + enemy.toString());
        }
        //Print winner
        if (user.getHealth() <= 0 && enemy.getHealth() <= 0) {
            System.out.println(user.getName() + " and " + enemy.getName() + " have defeated each other!");
        } else if (user.getHealth() <= 0) {
            System.out.println(enemy.getName() + " has won!");
        } else {
            System.out.println(user.getName() + " has won!");
        }

    }
}
class Player {
    private String name;
    private int health;
    private int maxDamage;

    public Player(String text, int num1, int num2) {
        name = text;
        health = num1;
        maxDamage = num2;
    }

    public void hit(Player player) {
        int damage = (int)(Math.random()*maxDamage)+1;
        player.setHealth(player.getHealth()-damage);
    }
    public String toString() {
        return name + " (" + health + ")";
    }

    public String getName() {
        return name;
    }
    public void setName(String text) {
        name = text;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int num) {
        health = num;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
    public void setMaxDamage(int num) {
        maxDamage = num;
    }
}