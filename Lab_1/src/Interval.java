public class Interval {
    private int leftNumber;
    private int rightNumber;
    private int sumOfOddNumbers;
    private int sumOfEvenNumbers;

    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }

    public int getSumOfOddNumbers() {
        return sumOfOddNumbers;
    }

    public void setSumOfOddNumbers(int sumOfOddNumbers) {
        this.sumOfOddNumbers = sumOfOddNumbers;
    }

    public int getSumOfEvenNumbers() {
        return sumOfEvenNumbers;
    }

    public void setSumOfEvenNumbers(int sumOfEvenNumbers) {
        this.sumOfEvenNumbers = sumOfEvenNumbers;
    }

    /**
     * create and print odd numbers
     * calculate sum of this numbers
     * */
    public void oddNumbers() {
        int leftNum = this.getLeftNumber();
        System.out.print("Odd numbers: ");
        if (leftNum % 2 == 0) {
            leftNum++;
        }
        for (; leftNum <= rightNumber; leftNum += 2) {
            System.out.print(leftNum + " ");
            sumOfOddNumbers += leftNum;
        }
        this.setSumOfOddNumbers(sumOfOddNumbers);
    }

    /**
     * create and print even numbers
     * calculate sum of this numbers
     * */
    public void evenNumbers() {
        int rightNum = this.rightNumber;
        System.out.print("\nEven numbers: ");
        if (rightNum % 2 != 0) {
            rightNum--;
        }
        for (; rightNum >= leftNumber; rightNum -= 2) {
            System.out.print(rightNum + " ");
            sumOfEvenNumbers += rightNum;
        }
        this.setSumOfEvenNumbers(sumOfEvenNumbers);
    }
}