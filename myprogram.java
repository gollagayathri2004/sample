public class myprogram{

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) { // Start from 2 as 1 is not a prime number
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // Optimization: No need to check divisors beyond the square root
        for (int i = 2; i * i <= number; i++) { 
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}