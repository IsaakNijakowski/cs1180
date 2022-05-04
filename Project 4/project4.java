import java.util.Scanner;

class project4 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Grid dungeon = new Grid(5,5);
        dungeon.addMonsters(25);
        dungeon.printMonsters();
        dungeon.printGrid();
    }
}
class Grid {
    public int playerHealth = 50;
    public int x;
    public int y;
    public boolean[][] hasExplored;
    public int[][] monsters;
    public boolean[][] location;

    Grid(int gridWidth, int gridHeight) {
        x = gridWidth;
        y = gridHeight;
        hasExplored = new boolean[gridWidth][gridHeight];
        monsters = new int[gridWidth][gridHeight];
        location = new boolean[gridWidth][gridHeight];
        location[0][0] = true;
        addMonsters((gridWidth*gridHeight)/6);
    }

    public void addMonsters(int monsterAmount) {
        //Add monsters
        for (int i = 0; i < monsterAmount; i++) {
            monsters[(int)(Math.random()*(x))][(int)(Math.random()*(x))] += 1;
        }
        //Prevent monsters from being in the first space
        if (monsters[0][0] > 0) {
            monsters[0][0] = 0;
            addMonsters(1);
        }
    }

    public void printGrid() {
        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                if (location[i][e] == true) {
                    System.out.print("[P]");
                } else if (hasExplored[i][e] == true) {
                    System.out.print("[ ]");
                } else if (monsters[i][e] > 1 && nearPlayer(i,e)) {
                    System.out.print("[!]");
                } else {
                    System.out.print("[?]");
                }
            }
            System.out.println();
        }
    }

    public void printMonsters() {
        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                System.out.print("[" + monsters[i][e] + "]");
            }
            System.out.println();
        }
    }

    public boolean nearPlayer(int xLoc, int yLoc) {
        if (xLoc > 0 && location[xLoc - 1][yLoc] == true) {
            return true;
        } else if (xLoc < x-1 && location[xLoc + 1][yLoc] == true) {
            return true;
        } else if (yLoc > 0 && location[xLoc][yLoc - 1] == true) {
            return true;
        } else if (yLoc < y-1 && location[xLoc][yLoc + 1] == true) {
            return true;
        } else {
            return false;
        }
    }
    
}
