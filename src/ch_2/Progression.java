package ch_2;


/** Generates a simple progression. By default: 0, 1, 2, ... */

public class Progression {
    String shit = "ass";
    /*
     * instance variables
     */
    protected long current;

    /*
     * Constructors
     */
    /** Constructs a progression starting at zero. */
    public Progression() { this(0); }

    /** Constructs a progression with given start value. */
    public Progression(long start) { current = start; } // ez to turn into abstarct class
                                                        // however, we wont be able to instantiate it on its own
                                                        // but sub classes like fibonacci and geometric can

    /*
     * Methods
     */
    /** Returns the next value of the progression. */
    public long nextValue() {
        advance();  //<<=-- protected
        return current;
    }

    /** Advances the current value to the next value of the progression. */
    protected void advance() {
        current++;
    }

    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n) {
        System.out.println("Current value: " + current);
        System.out.print("Next " + n + " values: "); //no new line
        for (int i=0; i<n; i++) {
            System.out.print(nextValue() + " ");
        }
        System.out.println();
    }
}


