public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int random = (int)(Math.random()*letters.length()) ;
        return letters.charAt(random);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int mid = letters.length() / 2;
        String firstHalf = letters.substring(0, mid);
        String secondHalf = letters.substring(mid);
        return firstHalf + company + secondHalf;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        //The top string is what is reacting to every vowel. either its uppercase or lowercase 
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < letters.length(); i++){
            //if the current isn't a vowel, nothing happens cause it doesn't exist in our string
            //if it's a vowel we change the vowel of the string letter to remove the vowel character, but keeps everything else.
            if(vowels.indexOf(letters.charAt(i)) != -1){
                letters = letters.substring(0,i) + letters.substring(i+1);
                //Will return the new string after the vowel is removed
                return;
            }
        }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int startindex = (int)(Math.random()*(letters.length()-num));
        String replacement = "";
        String replaced = (letters.substring(startindex,num));
        letters = letters.replace(replacement, replaced);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        //String findWord = word;
    }
}
