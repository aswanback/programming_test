class Scratch {
    static void Fibonacci(int n) {
        int two_previous = 0;
        int previous = 1;
        int result = 0;
        System.out.format("%d",two_previous);
        System.out.format(", %d",previous);
        while(result != n) {
            result = previous + two_previous;
            System.out.format(", %d",result);
            two_previous = previous;
            previous = result;
        }
    }

    public static void main(String[] args) {
        Fibonacci(34);  //prints each fibbonacci number on a newlein
    }
}