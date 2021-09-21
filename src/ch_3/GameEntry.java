package ch_3;

public class GameEntry {  // Note that we could have used our generic Pair<>, but may want to add more states (date, how long did score take to, etc)
    // but pair wouldnt work for that as it only works if there are only 2 members of the state
    // Instance variables
    private String name = "";
    private int score = 0;

    // Constructors
    // no default constructor. can add one if we want
    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    // Methods
    public String getName() { return name; }    // getter method
    public int getScore() { return score; } // getter method
    public String toString() {  // override toString
        return name + "\t" + score;
    }
}