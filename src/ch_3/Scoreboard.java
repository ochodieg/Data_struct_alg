package ch_3;

// main goes in this class


public class Scoreboard {
    // instance variables
    private int numEntries = 0; // number of actual entries is initialized to zero
    private GameEntry[] board;  // this is composition (an object that is part of the state of another object)

    // constructor
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }
    // methods
    public void add(GameEntry e ){
        // not every game entry will be added here
        // conditions: if the board isnt full, no check is needed and
        // score will be added, regardless
        int newScore = e.getScore();
        int lowestScore = 0;
        if (numEntries > 0 ){
            lowestScore = board[numEntries -1].getScore();
        }

        //System.out.println((board[numEntries-1].getScore()));

        // if board is not full, enter this if statement
        if(numEntries < board.length || newScore > lowestScore);
        {// <-- arrays come with a built-in characteristic called "length" that returns
            // the number of cells in the array. therefore, board.length will return 10
            // newScore > board[board.length-1].getScore() will compare the very last cell
            // place score in right spot on board // WELP NVM, WE CHANGED IT

            if(numEntries < board.length) {numEntries++;}   // add one to our numEntries if board is not full
            // place score in right spot on board
            int j = numEntries - 1;
            while(j > 0 && board[j-1].getScore() < newScore){   // start at bottom and if score that is being
                                            // added is greater than bottom score, then old bottom score will be deleted
                board[j] = board[j-1]; // take score above it and copy it into that slot
                j--; // step up one
            }

            board[j] = e;

        }


    }


    public String toString(){   // cleaner to keep all data as single string rather than individual data
                                // printed out (think of how i printed things in python, to keep a cleaner block of code)

        // in the book, they use the string builder class, but we will forgo that since it is more complicated than it need to be
        //  we will compile everything as a string and printed out all together within our main

        String sb = "Scoreboard: \n";
        for (int i = 0; i < numEntries ; i++){  // if we were to use GameEntry as condition in loop, instead of numEntries,
                                                // we have to check to make sure it's a valid entry and if it's null, then
                                                // we would have to do something else. numEntries, give us VALID entries
            // starting with zero so we want to start with
            // 1,  vvv
            // sb += (i+1) + ". " + board[i].getName() + "   " + board[i].getScore() + "\n";
            sb += (i+1) + ". " + board[i].toString() + "\n";    // <<-- better
        }
        return sb;

    }


    public static void main(String[] args){
        Scoreboard highscores = new Scoreboard(10);

        GameEntry ge = new GameEntry("leslie", 10);
        highscores.add(ge);
        GameEntry ge2 = new GameEntry("Daniel", 50);
        highscores.add(ge2);

        System.out.println(highscores);

    }


}


