public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    // swap first half and second half
    public String scramble()
    {
        int mid = word.length() / 2;                // integer division
        String first = word.substring(0, mid);
        String second = word.substring(mid);
        return second + first;
    }
    
    // insert insertText so its first char lands at index insertIdx
    public String bananaSplit(int insertIdx, String insertText)
    {
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }
    
    // insert insertText at the index of first occurrence of insertChar
    public String bananaSplit(String insertChar, String insertText)
    {
        int pos = word.indexOf(insertChar);
        return word.substring(0, pos) + insertText + word.substring(pos);
    }
    
    public String toString()
    {
        return "[" + word + "]";
    }
}