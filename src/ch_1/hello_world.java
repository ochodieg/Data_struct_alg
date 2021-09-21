
package ch_1;

public class hello_world {   /* "class" is a keyword that tells java this is a class
                               "public" is an access modifier for this class, making it public
                               saying "you can access this class outside of this class"

                            */
    public static void main(String[] args) {    /* <-- *PUBLIC* is access modifier for method
                                                        (access Method outside of class
                                                        - there are THREE different access modifiers for methods)
                                                        fo main, you HAVE to call method outside of class cuz
                                                        you have to be able to run this class
                                                        *STATIC* means that this method is defined by/for class
                                                        not by/for object
                                                        *VOID* is in the location of where you would place
                                                        the data type that will be returned by this method
                                                        "void" simply states there is nothing returned
                                                        *STRING* is an array of various strings

    */
        System.out.println("Hello world");

        // comments made like this

        /*
         * <_ convention to add this star block comment
         */
        // variable names must start with a character: $ or  _
        // can contain digits but cant start with digit
        // cant be keywords like "public"

        // primitive/basic data types
        boolean flag = true; // not lowercase true/false
        char grade = 'a'; //single quotes -> ' <- used for char, -> " <- used for string which is considered an array of characters
        int i = 257; // 32-bit int; byte=8-bit; short = 16-bit; long=64-bit(L)<- capital l at the end of your int
        byte a = 127; // cant be 256 since 8bit is 0 - 255 or -255 to 255
        float pi = 3.1415F;// 32-bit (note the F at the end)
        double ee = 2.71828; // 64-bit

        System.out.println((int)ee);    // int casting TRUNCATES, does not round

        String greeting = "hello"; // use double quotes
        greeting = "hola";
        greeting = greeting + "!" + String.valueOf(i);


        // variables, methods, functions start with lower case
        // class names start with upper case



        System.out.println(greeting);





        // data/state/attibutes...etc -> usually private
        // functions/methods -> usually public


        // access modifiers:
        // public - accessible from inside/outside class
        // private - accessible from inside class
        //protected - accessible from classes and subclasses, only

        //classes and objects

        Counter c; // declares a variable -- no object constructed
        c = new Counter(); // constructs a counter, assigns its reference to " c "
        // initializes count to value of 0
        // generally you want to initialize your data instead of letting java do it for you

        System.out.println("value of c.count: " + c.getCount()); // gets the value of count through public method // " . " in c.getCount just says "hey, we're getting something in object "c" like with turtles in python

        // if we try
        // System.out.println("value of c.count: " + c.count);
        // then we will get error: java: count has private access in Ch1.counter
        // this is because we are trying to access the data " count " directly
        //rather than through the designates function, getCount()
        // this could work if we used the access modifier " public " for the count attribute but this is bad practice

        Counter c2 = new Counter(10);
        System.out.println("value of c2.count: " + c2.getCount());

        c.increment();
        System.out.println("value of c.count after increment(): " + c.getCount());
        c.increment(50);
        System.out.println("value of c.count after increment(50): " + c.getCount());
        c.increment(c2.getCount()); // passing the return value of the getcount method
        System.out.println("value of c.count after adding the return of c2.getCount(): " + c.getCount()); // not the best way of doing this
                                                                                                         // beyond scope of lesson
        c.reset();
        System.out.println("value of c.count after reset is: " + c.getCount());

        //Arrays
        // int[] primes; //array of ints. You can instantiate without initializing but that is usually not done.
        //arrays use " [] "

        // a middle road of initialization ( i want this array of ints and im not gonna fill it in yet but i want to you to allocate memory ) then you...
        // int[] primes = new int[100]; // create an array of 100 int, all zero (memory management)

        // similar to a list but not as powerful since arrays must all be the same type. ( an array of one type)
        // whereas python lists can have mix types
        // not as flexible as python

        int[] primes = {2,3,5,7,11,13,17,19,23,29};
        // curly braces " {} " simply denote the elements within the array
        System.out.println(primes[0]);
        // cant slice like in python
        //System.out.println(primes[0:5]); wont work. must index ONE at a time


        //Enumerators
        // sort of like classes except they're only data and constants
        // now the hello_world class is containing two things
        // the "main" and enumerator "Day"
        Day today;
        today = Day.THUR;
        today = Day.TUE;
        System.out.println(today);

        int temp = 0;

        Counter d = new Counter(5);// declares and constructs a counter having value 5
        // pseudocode: specified class - variable d = new specified class
        // therefore dependent on the name of public class " Counter " in declared in Counter.java
        // because it is a class type variable
        // This establishes the identifier, c, as a variable of type Counter, but it does not create
        //a Counter instance.
        d.increment( ); // value becomes 6
        Counter e = d; // assigns e to reference the same object as d
        temp = e.getCount( ); // will be 6 (as e and d reference the same counter)
        e.increment(2); // value of e (also known as d) becomes 8


    }

    public enum Day { MON, TUE, WED, THUR, FRI, SAT, SUN}; // <<- used a lot for flags/error within codes (stylistically capitalized)
}