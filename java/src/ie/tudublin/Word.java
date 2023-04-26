package ie.tudublin;

import java.util.ArrayList;

public class Word 
{

    private String word;
    // list of words that follow the word and their counts
    private ArrayList<Follow> follows;

    //constructor makes an arraylist for following words
    public Word(String word)
    {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    // method for adding a follow word to the arraylist
    public void addFollow(String follow) 
    {
        //check if the word already exists in the arraylist, in order to increment if it does,
        for (Follow f : follows) 
        {
            if (f.accessWord().equals(follow)) 
            {
                // if yes, increment
                f.increment();
                return;
            }
        }
        // if no, add a new object to array list, initialized as 1
        this.follows.add(new Follow(follow));
    }

    // accessor to get the word
    public String getWord() 
    {
        return this.word;
    }

    // accessor to get the arraylist
    public ArrayList<Follow> getFollows() 
    {
        return this.follows;
    }

    // word object --> string
    public String toString() 
    {
        String stringout = this.word + ": ";
            for (Follow f : follows) 
        {
            stringout += f.toString() + " ";
        }
        return stringout;
    }

}

