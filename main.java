package SIMPLILEARN.assignmentsSelflearningVideo.ArithematicCalculator;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double a =0;
        double b =0;
        String op = null;
        String YESorNO = null;
        Scanner keyboardInput = new Scanner(System.in);



        do {

            if (cal.result == 0.0) {                 //Because I made result variable as static,hence i used result variable of cal class directly without creating its object
                System.out.println("Type value 1: ");
                a = keyboardInput.nextDouble();
                System.out.println("Give operator: ");
                op = keyboardInput.next();
                System.out.println("Type value 2: ");
                b = keyboardInput.nextDouble();

            } else {

                a = cal.result;
                System.out.println("Give operator: ");
                op = keyboardInput.next();
                System.out.println("Type value 2: ");
                b = keyboardInput.nextDouble();

            }

            if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {

                do {
                    System.out.println("Wrong Input.Please choose from '+', '-', '/', '*'");
                    System.out.println("Give operator: ");
                    op = keyboardInput.next();
                } while (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")));
            }

            cal obj = new cal(a,b);



                    if (op.equals("+")) {
                        obj.addition();
                    } else if (op.equals("-")) {
                        obj.subtraction();
                    } else if (op.equals("/")) {
                        obj.division();
                    } else if (op.equals("*")) {
                        obj.multiplication();
                    }




            System.out.print("Do you want to calculate more?y/n: ");
            YESorNO = keyboardInput.next();
        }while(YESorNO.equals("Y") || YESorNO.equals("y"));

    }
}
