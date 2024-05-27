package Calculator;

import java.util.*;

public class Calculator{
    ArrayList <Integer> numbers = new ArrayList <Integer> ();
    String choiceRaw;
    char choice;
    Scanner sc = new Scanner(System.in);

    public Calculator(){

        while(choice!='X'){
            System.out.print("What would you like to do?\n\n[A]dd\n[S]ubtract\n[M]ultiply\n[D]ivide\n[P]ower rule\n\nE[X]it\n\n");
            choiceRaw = sc.next().toUpperCase();
            choice = choiceRaw.charAt(0);

            switch (choice) {
                case 'A':
                    addition();
                    break;
                case 'S':
                    subtraction();
                    break;
                case 'M':
                    multiplication();
                    break;
                case 'D':
                    division();
                    break;
                case 'P':
                    power();
                    break;
                case 'R':
                    root();
                    break;
                case 'X':
                    break;
            }
        }
    }

    private void addition(){
        int value=0;
        double result;

        while(value<=0){
            result = 0;
            System.out.print("\nHow many numbers do you want to add\n\n>>");
            try{
                value = Integer.parseInt(sc.next());
                for(int i=1;i<=value;i++){
                    System.out.print("\nNumber "+i+"/"+value+"\n>>");
                    result += Integer.parseInt(sc.next());
                }
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            System.out.println("\n"+result);
        }
    }

    private void subtraction(){
        double num1, num2;
        double result;
        boolean flag = false;

        while(flag!=true){
            try{
                System.out.print("\nEnter the first number (?-?)\n>>");
                num1 = Integer.parseInt(sc.next());
                System.out.print("\nEnter the second number ("+num1+"-?)\n>>");
                num2 = Integer.parseInt(sc.next());

                flag = true;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            result = num1-num2;
            System.out.println("\n"+result);
        }
    }

    private void multiplication(){
        int value=0;
        double result;

        while(value<=0){
            result = 1;
            System.out.print("\nHow many numbers do you want to multiply\n\n>>");
            try{
                value = Integer.parseInt(sc.next());
                for(int i=1;i<=value;i++){
                    System.out.print("\nNumber "+i+"/"+value+"\n>>");
                    result = result * Integer.parseInt(sc.next());
                }
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            System.out.println("\n"+result);
        }
    }

    private void division(){
        double num1, num2;
        double result;
        boolean flag = false;

        while(flag!=true){
            try{
                System.out.print("\nEnter the first number (?/?)\n>>");
                num1 = Integer.parseInt(sc.next());
                System.out.print("\nEnter the second number ("+num1+"/?)\n>>");
                num2 = Integer.parseInt(sc.next());

                flag = true;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            result = num1/num2;
            System.out.println("\n"+result);
        }
    }

    private void power(){
        double num1, num2;
        double result;
        boolean flag = false;

        while(flag!=true){
            try{
                System.out.print("\nEnter the first number (?^?)\n>>");
                num1 = Integer.parseInt(sc.next());
                System.out.print("\nEnter the second number ("+num1+"^?)\n>>");
                num2 = Integer.parseInt(sc.next());

                flag = true;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            result = Math.pow(num1,num2);
            System.out.println("\n"+result);
        }
    }

    private void root(){
        double num1, num2;
        double result;
        boolean flag = false;

        while(flag!=true){
            try{
                System.out.print("\nEnter the first number (?√?)\n>>");
                num1 = Integer.parseInt(sc.next());
                System.out.print("\nEnter the second number ("+num1+"√?)\n>>");
                num2 = Integer.parseInt(sc.next());

                flag = true;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a number\n");
                break;
            }

            result = Math.pow(num2,1/num1);
            System.out.println("\n"+result);
        }
    }
}
