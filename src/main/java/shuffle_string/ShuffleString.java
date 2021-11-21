package shuffle_string;

public class ShuffleString {

    public String shuffleString(String s, int[] indices) {
        char[] stringCharArray = s.toCharArray();
        char[] newCharArray = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            newCharArray[indices[i]] = stringCharArray[i];
        }

        return String.valueOf(newCharArray);
    }

}
