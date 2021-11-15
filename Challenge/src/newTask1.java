import java.util.Scanner;

public class newTask1 {

    public static void main(String[] args) {

        int rows;


        System.out.print("Enter height of triangle: ");

        Scanner height = new Scanner(System.in);
        rows = height.nextInt();

        for (int i=0; i< rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }

}
