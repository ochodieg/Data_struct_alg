package ch_2;


// public class ArithmeticProgression extends Progression { //<<-- means arithmetic progression comes with all the methods
                                                        // in progression
public class ArithmeticProgression extends AbstractProgression {
    // additional instance variable
    protected long increment;   //<<-- notice protected

    // Constructors
    public ArithmeticProgression() {
        this(1, 0);
    }
    public ArithmeticProgression(long stepsize) {   // notice only using ints which is an assumption
                                                    // notice only passing in stepsize and no start
        this(stepsize, 0);                      // therefore initiating default values
        // "this" keyword always calls object it is in. Therefore, it's gonna call arithmetic progression
        // if it were in "progression" object, it would then call "progression"
    }
    public ArithmeticProgression(long stepsize, long start) {
        super(start); // calls constructor of superclass (progression) and passes in "start"
                        // sets up "current" instance variable
        increment = stepsize;
    }

    // Override super method
    protected void advance() { current += increment; } // over-writing super class

}