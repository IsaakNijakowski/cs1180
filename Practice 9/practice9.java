import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class practice9{
    public static void main(String[] args) throws IOException {
        //Importing text file
        File text = new File("./cs1180/Practice 9/test.txt");
        Scanner input = new Scanner(text);
        int x = input.nextInt();
        int y = input.nextInt();
        //Creating a multidimensional array from the text file
        String[][] multiArray = new String[x][y];
        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                multiArray[i][e] = input.next();
            }
        }
        //Setting up integers to detemine a max amount
        int max = 0;
        int tempMax = 0;
        //Finding max of each row in multidimensional array
        for (int i = 0; i < x; i++) {
            for (int e = 0; e < y; e++) {
                if (multiArray[i][e].equals("+")) {
                    tempMax++;
                }
            }
            if (tempMax>max) {
                max = tempMax;
            }
            tempMax=0;
        }
        //Printing max
        System.out.println(max);
        input.close();
    }
    /*public static void main(String[] args) throws NullPointerException{
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }*/
}