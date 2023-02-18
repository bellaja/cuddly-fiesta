public class Main {
    public static void main(String[] args) {

        long[] salesCount = {4,5,6,7,8,9};
        long maxNumber = salesCount[0];
        for (int i = 0; i < salesCount.length; i++) {
            if (salesCount[i] > maxNumber) {
                maxNumber = salesCount[i];
            }
        }
        long minNumber = salesCount[0];
        for (int i = 0; i < salesCount.length; i++) {
            if (salesCount[i] < minNumber) {
                minNumber = salesCount[i];
            }
        }

        SalesManager manager = new SalesManager(salesCount);

        long sum = 0;
        for (int i = 0; i < salesCount.length; i++) {
            sum = sum + salesCount[i];
        }

        sum = sum - minNumber - maxNumber;
        System.out.println(sum);

    }
}