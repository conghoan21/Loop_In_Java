import java.util.Scanner;
public class vehinh {
    public static void main(String[] args){
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle 1");
        System.out.println("3. Draw the square triangle 2");
        System.out.println("4. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice){
            case  1:
                System.out.println("Draw the rectangle");
                for (int i=1; i<=3;i++){
                    for (int j=1; j<=7;j++){
                        if((j==1) || (j==7) || (i==1) || (i==3)){
                            System.out.print("*");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Draw the square triangle 1");
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Draw the square triangle 2");
                for(int i=5;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Draw the isosceles triangle");
                for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < k; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j < k; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        while(choice!= 0) {

        }
    }

}
