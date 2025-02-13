public class decoder
{
    public static String message(String input, int key) {
        String decodedmessage = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isLetter(current)) {
                char decodedChar = (char) ((Character.toLowerCase(current) - 'a' - key + 26) % 26 + 'a');
                decodedmessage += decodedChar;
            } else {
                decodedmessage += current;
            }
        }

        return decodedmessage;
    } 
    
    public static String removePunctuation(String word) {
        String blank = "";

        for (int i = 0; i < word.length(); i++) {
            char currentchar = word.charAt(i);
            if (Character.isAlphabetic(currentchar) || currentchar == ' ') {
                blank += currentchar;
            } 
        }

        return blank;
    }   
}
