public class Fibonacci {
    private int maxOddNumber;
    private int maxEvenNumber;
    private int length;

    public int getMaxOddNumber() {
        return maxOddNumber;
    }

    public void setMaxOddNumber(int maxOddNumber) {
        this.maxOddNumber = maxOddNumber;
    }

    public int getMaxEvenNumber() {
        return maxEvenNumber;
    }

    public void setMaxEvenNumber(int maxEvenNumber) {
        this.maxEvenNumber = maxEvenNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * create Fibonacci sequence
     * f1 and f2 is the Fibonacci numbers
     * f3 is the next Fibonacci number, f3=f1+f2
     * @param number is the biggest number of the interval
     */
    public void fibonacciSequence(int number) {
        this.maxOddAndEvenNumbers(number);
        int f1 = this.getMaxOddNumber();
        int f2 = this.getMaxEvenNumber();
        int f3;
        int L = this.getLength();
        int numberOfOddNum = 1;
        int numberOfEvenNum = 1;
        System.out.print("Fibonacci sequence: ");
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < L; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
            if (f3 % 2 == 0) {
                numberOfEvenNum++;
            } else {
                numberOfOddNum++;
            }
        }
        double oddPerCent = calculatePerCent(numberOfOddNum);
        double evenPerCent = calculatePerCent(numberOfEvenNum);
        System.out.printf("\nPer sent of odd Fibonacci numbers = %.1f%%", oddPerCent);
        System.out.printf("\nPer sent of even Fibonacci numbers = %.1f%%", evenPerCent);
    }

    /**
     * determining the biggest odd and even numbers
     * @param number is the biggest number of the interval
     */
    public void maxOddAndEvenNumbers(int number) {
        if (number % 2 == 0) {
            this.setMaxEvenNumber(number);
            this.setMaxOddNumber(--number);
        } else {
            this.setMaxOddNumber(number);
            this.setMaxEvenNumber(--number);
        }
    }

    /**
     * @param numberOfNumbers is number of odd or even numbers
     * @return per cent of odd or even numbers
     * */
    public double calculatePerCent(int numberOfNumbers) {
        return (double) numberOfNumbers / (double) this.length * 100;
    }
}