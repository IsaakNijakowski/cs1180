class Practice10 {
    public static void main(String[] args) {
        System.out.println("Test");
        Player user = new Player("user",10,3);
        Player enemy = new Player("enemy",5,1);
        System.out.println("Player name: " + user.getName());
        System.out.println("Player health: " + user.getHealth());
        System.out.println("Player max damage: " + user.getMaxDamage());
        System.out.println("Enemy name: " + enemy.getName());
        System.out.println("Enemy health: " + enemy.getHealth());
        System.out.println("Enemy max damage: " + enemy.getMaxDamage());
        System.out.println("The player attacks!");
        user.hit(enemy);
        System.out.println("Enemy health: " + enemy.getHealth());
        System.out.println(user.toString());

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