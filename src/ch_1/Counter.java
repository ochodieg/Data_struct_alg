/*


package ch_1;

public class Counter {

    // Attributes/data/state/instance variables
    private int count;

    // Constructors
    public Counter() {} // default constructor
    public Counter(int initial) { // overloading
        count = initial;           // can expand body if desired
    }

    // Methods
    public int getCount() { return count; } // getter method or accessor method
    public void increment() { count++; } // update method, modifier method
    public void increment(int delta) { count += delta; } // overload increment()
    // count = count + delta; +=, -=, *=, /=
    //public void increment(Counter ct) { this.count += ct.getCount(); }
    public void reset() { count = 0; }

}

 */


package ch_1;

public class Counter {
    // Attributes/data/state/instance variables

    private int count;
    // public int count;


    // constructors always have the name of the class
    public Counter() {} // {} <- means default constructor therefore not passing anything in
    // because constructor is a function, it has " () " at the end

    public Counter(int initial) { // overloading -> when you have multiple methods with the same class, same name but different parameters being set
        // compiler know which one to execute based on number/type of parameters sent
        // can expand body if desired
        count = initial;// <-- this statement means it is going to take its count value and make it equal to the given parameter " initial"
    } // second constructor takes a parameter for its initial count

// methods

    public int getCount() {return count;}       // returns the data member " count "
    // getter method or accessor
    // there are modifier methods to change the data in the class

    public void increment() {count++;} // update method, modifier method.
                                        // ++ is short for "add one" and can be used for iteration
    public void increment(int delta) { count += delta; } // overload increment(). compiler will know which to call based on whether an int is sent when called  // some delta is any value
    // count = count + delta;
    // +=, -=, *=, /= are all used similar to python

    // public void increment(Counter ct) { this.count += ct.getCount(); } // <-- look up " this " keyword again. beyond what we are covering here
    public void reset(){ count = 0; }



}






