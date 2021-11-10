class project4 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Grid dungeon = new Grid(5,5);
        //dungeon.getSize();
    }
}
class Grid {
    private int x;
    private int y;
    //private boolean hasMonster = false;
    //private boolean hasExplored = false;

    Grid(int gridWidth, int gridHeight) {
        x = gridWidth;
        y = gridHeight;
    }

    int[][] gridArray = new int[x][y];
    
}
