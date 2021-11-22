package number_of_steps_to_reduce_a_number_to_zero;

public class NumberOfStepsToReduceANumberToZero {

    public int getAmountOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;

            count++;
        }

        return count;
    }

}
