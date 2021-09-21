package ch_2;


// we can have any type of pair
// we have a pir of "things" which can be anything we want
// we will make the pair generic to assign data type during instantiation

// when we instantiate, we will define A and B
public class Pair<A,B> {    // pair syntax is the same in C++
    // instance variables
    A first;
    B second;


    // constructor

    public Pair(A a, B b) {
        //no default constructor
        first = a;
        second = b;


    }

    // methods
    public A getFirst() { return first; } // returns A
    public B getSecond() { return second; } // returns B
    public String toString() {   // overriding toString method
                                // default method in a lot of java objects
                                // instead of calling some print method, we just try to print it

        return"[" + first + "," + second + "]"; // common notation for a lot of types of pairs
    }

    public static void main (String[] args){
        // this will give us two mains, one inside of pair, and one inside of demo
        // take care of which you call

        Pair<String,Double> bid;    // we'll say this is a bid for a stick price
        //bid = new Pair<String, Double>("ORCL",35.64);   // calls constructor , give explicit in types
        //System.out.println(bid.toString());

        Pair<Double,Double> point = new Pair<>(1.5,2.25);   // use type reference
        System.out.println(point);  /* instead of calling the toString method and
                                    * since toString method has been overridden
                                    it is what java will try to call if you try to print out
                                    the object.
                                    it will go look for the toString method for you so you dont have to
                                    call it directly
                                    */

    }

}
