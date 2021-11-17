package valid_palindrome;

public class ValidPalindrome {

    public boolean isValidPalindrome(String s) {
        String treatedString = this.getTreatedString(s);

        int aPointer = 0;
        int bPointer = treatedString.length() - 1;

        while (aPointer <= bPointer) {
            if (treatedString.charAt(aPointer) != treatedString.charAt(bPointer)) {
                return false;
            }

            aPointer += 1;
            bPointer -= 1;
        }

        return true;
    }

    public String getTreatedString(String s) {
        return s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }

}
