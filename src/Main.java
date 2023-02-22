public class Main {
    public static void main(String[] args) {

        long[] salesCount = {4,5,6,7,8,9};



        SalesManager manager = new SalesManager(salesCount);


        System.out.println(manager.max());
        System.out.println(manager.min());
        System.out.println(manager.getSum());
    }
}