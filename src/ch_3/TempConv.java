package ch_3;
import java.util.Scanner;
public class TempConv {
    public static void main(String[] args) {
        double fahr;
        double cel;
        Scanner in;
        Scanner piss = new Scanner(System.in);

        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + cel);

        System.out.println("whats the name of the girl u wanna fuck?");
        String girl = in.next();
        System.out.println("you wanna fuck " + girl);
        // if(girl == int){
          //  System.out.println("fuk u");
        }



        }


