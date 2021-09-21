package ch_2;

/*
* reasons to make class abstract:
* if youre not going to instantiate the SUPER, ( youre planning on
* making subclasses and instantiating those) then you should make it abstract
*
* it can lead to more robust code
*
 */


// use keyword 'abstract'
public abstract class AbstractProgression {
    /*
     * instance variables
     */
    protected long current;

    /*
     * Constructors.
     * even though we can never create an instantiation of an abstract
     * class, we still have a constructor so that the subclasses that inherit from it can instantiate
     */
    /** Constructs a progression starting at zero. */
    public AbstractProgression() { this(0); }

    /** Constructs a progression with given start value. */
    public AbstractProgression(long start) { current = start; }

    /*
     * Methods
     */
    /** Returns the next value of the progression. */
    public long nextValue() {  // this is a concrete method as it stays the same in geometric, fibonacci, arithmetic etc
        advance();
        return current;
    }

    /** Advances the current value to the next value of the progression. */
    protected abstract void advance(); // abstract method
    // takes in nothing and returns a void. basically just a "signature"
    // keyword "abstract" tells you that this method is not defined in this abstract class
    // but it will need to be defined in subclass
    // c++ just uses keyword "virtual"

    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n) { // concrete method (doesnt change)
        System.out.println("Current value: " + current);
        System.out.print("Next " + n + " values: ");
        for (int i=0; i<n; i++) {
            System.out.print(nextValue() + " ");
        }
        System.out.println();
    }

}