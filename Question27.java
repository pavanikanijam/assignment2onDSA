class Solution {
    public double findMedianSortedArrays(int[] number1, int[] number2) {
        int num1 = number1.length;
        int num2 = number2.length;
        int num = num1+ num2;
        int[] number = new int[num1 + num2];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        while (a2 < num1 && a3 < num2) {
            if (number1[a2] <= number2[a3]) {
                number[a1++] = number1[a2++];
            } else {
                number[a1++] = number2[a3++];
            }
        }
        if (a2 < num1) {
            System.arraycopy(number1, a2, number, a1, num1 - a2);
        } else {
            System.arraycopy(number2, a3, number, a1, num2 - a3);
        }
        if (num % 2 == 1) {
            return number[num/2];
        } else {
            return ((double) (number[num/2 - 1] + number[num/2])) / 2;
        }
    }
}
