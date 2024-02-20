public class HelloWorldPrinter {
    public static void printHelloWorld(int n) {
        if (n <= 0) {
            return; // base case: if n is non-positive, return without printing
        } else {
            System.out.println("Hello World"); // print "Hello World"
            printHelloWorld(n - 1); // recursively call printHelloWorld with n - 1
        }
    }

    public static void main(String[] args) {
        int n = 3; // Example: print "Hello World" 3 times
        printHelloWorld(n);
    }
}
