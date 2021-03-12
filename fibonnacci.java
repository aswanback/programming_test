class Scratch {
    static void Fibonacci(int n) {
        int two_previous = 0;
        int previous = 1;
        int result = 0;
        System.out.println(two_previous);
        System.out.println(previous);
        while(result != n) {
            result = previous + two_previous;
            System.out.println(result);
            two_previous = previous;
            previous = result;
        }
    }

    public static void main(String[] args) {
        Fibonacci(34);
    }
}