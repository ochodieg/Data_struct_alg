package ch_2;

public class FibonacciProgression extends Progression {
    // additional instance variables
    protected long prev;



    // constructors
    public FibonacciProgression(long first, long second) {
        super(second); // good practice to call superclass constructor for data that is a part of the super class
        prev = first;
    }

    //default values
    public FibonacciProgression() { this(0, 1); }



    // override superclass method
    protected void advance() {
        // take old current + the previous value, add them together and assign into new current
        // along the way we have to save the old current value as "previous" value, so that it is ready for next iteration


        // because we will lose old current value once we change it, we need to
        // make a "temporary" value as placeholder
        long temp = prev;   // previous value goes into temporary
        prev = current; // then update previous value with "old" current value
        current += temp;    // then update "new" current value which is itself + its previous value
    }

}