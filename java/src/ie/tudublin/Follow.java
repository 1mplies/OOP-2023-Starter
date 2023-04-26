package ie.tudublin;

//Follow class
public class Follow 
{
    //initializing word and count fields
    private String word;
    private int count;

    //increment word count
    public void increment()
    {
        this.count++;
    }

    //method to pull the word 
    public String accessWord()
    {
        return this.word;
    }

    //method to pull the word count
    public int accessCount()
    {
        return this.count;
    }

    //constructor to initialize the word and start the counter at 1
    public Follow(String word)
    {
        this.word = word;
        this.count = 1;
    }

    //follow object into a string
    public String toString()
    {
        return this.word + "(" + this.count + ")";
    }
}

