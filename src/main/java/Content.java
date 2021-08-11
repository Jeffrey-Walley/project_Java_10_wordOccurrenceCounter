public class Content {
    private String paragraph;

    public Content(String p) {
        paragraph = p;
    }

    public int getCount(String word) {
        String trimmed = paragraph.trim();
        int count = 0;
        int wordLength = word.length();
        int trimLength = trimmed.length();

        // if word is not found
        if (trimLength < wordLength) {
            return 0;
        }
        // count match if 'trimmed' string equal to the target
        if (trimLength == wordLength && trimmed.substring(0, wordLength).equals(word)) {
            return 1;
        }
        // now implied that 'trimLength > wordLength'
        // count the first word if it matches the target
        if (trimmed.substring(0, wordLength).equals(word)) {
            count++;
        }
        // count last word of trimmed string if it matches target word
        if ((trimmed.substring(trimLength - wordLength).equals(word)
                && trimmed.charAt(trimLength - wordLength - 1) == ' ')) {
            count++;
        }
// we have now checked the first and last word of the trimmed string
// we can iterate through the string now and count words with the 'window approach'
        for (int i = wordLength; i < trimLength - wordLength; i++) {
            if ((trimmed.substring(i, i + wordLength)).equals(word)
                    && trimmed.charAt(i + wordLength) == ' '
                    && trimmed.charAt(i - 1) == ' ')
                count++;
        }
        return count;
     }
}
