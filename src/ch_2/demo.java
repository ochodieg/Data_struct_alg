package ch_2;

public class demo {

    public static void main(String[] args){
        Progression sequence;

        // simple progression
        System.out.print("--- simple/default progression --- \n ");
        sequence = new Progression(100);
        sequence.printProgression(10);

        // Arithmetic Progression
        System.out.print("---Arithmetic Progression--- \n");
        AbstractProgression seq2 = new ArithmeticProgression(10);
        seq2.printProgression(10);


        // Geometric Progression
        System.out.print("===Geometric Progression with m=2--- \n");
        sequence = new GeometricProgression();
        sequence.printProgression(10);


        // Fibonacci Progression
        System.out.println("---Fibonacci Progression with 0,1---");
        sequence = new FibonacciProgression();
        sequence.printProgression(10);

        // try to instantiate AbstractProgression (won't work as it's abstract)
        // AbstractProgression seq3 = new AbstractProgression();

    }
}
