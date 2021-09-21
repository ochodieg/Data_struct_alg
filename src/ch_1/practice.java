package ch_1;

public class practice {
    // javac GeeksforGeeks.java
    // java GeeksforGeeks 1 2 3
    public static void main(String[] args)
    {

        //for (String elem : args)

           // System.out.println("elem");

        for (int i = 0; i < 5; i++) {
        // statement 1, statement 2, statement 3
            // s1: is executed (one time) before the execution of the code block. initiates variable (int i = 0)
            // s2: defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.
            // s3: increases a value (i++) each time the code block in the loop has been executed.
            System.out.println(i);
        }

        int Counter = 21 ;

        if (Counter < 10 ){
            Counter += 2;
            System.out.println("counter is number:" + Counter);
        } else if (20 > Counter && Counter > 10){
            Counter += 3;
            System.out.println("counter has surpassed 10 and is: " + Counter);
        } else if( Counter > 20 || Counter < 0 ) {
            System.out.println("stop");
        }else
            System.out.println("shit");



        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String anyname : cars) { //>>pseudocode: for-each string "anyname" : in array "cars"
            System.out.println(anyname);
        }
    }

}