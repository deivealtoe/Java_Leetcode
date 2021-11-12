package squares_of_a_sorted_array;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] sortedArray) {
        int[] squaredArray = new int[sortedArray.length];

        for (int i = 0; i < sortedArray.length; i++) {
            squaredArray[i] = (int) Math.pow(sortedArray[i], 2);
        }

        int lastArrayPositionAfterSort = squaredArray.length - 1;
        for (int i = 0; i < squaredArray.length - 1; i++) {
            for (int j = 0; j < lastArrayPositionAfterSort; j++) {
                if (squaredArray[j] > squaredArray[j + 1]) {
                    int aux = squaredArray[j];
                    squaredArray[j] = squaredArray[j + 1];
                    squaredArray[j + 1] = aux;
                }
            }

            lastArrayPositionAfterSort -= 1;
        }

        return squaredArray;
    }

}
