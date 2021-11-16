package jewels_and_stones;

public class JewelsAndStones {

    public int getHowManyStonesAreJewels(String jewels, String stones) {
        int amountOfStonesThatAreJewels = 0;

        char[] jewelsCharArray = jewels.toCharArray();
        char[] stonesCharArray = stones.toCharArray();

        for (int i = 0; i < stonesCharArray.length; i++) {
            for (int j = 0; j < jewelsCharArray.length; j++) {
                amountOfStonesThatAreJewels += (stonesCharArray[i] == jewelsCharArray[j]) ? 1 : 0;
            }
        }

        return amountOfStonesThatAreJewels;
    }

}
