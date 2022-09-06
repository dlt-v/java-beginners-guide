public class Primes {
    public static void main(String[] args) {
        /*
         * A program that prints out all the prime numbers from 2 to 100.
         * A prime number is a natural number greater than 1
         * that is not a product of two smaller natural numbers.
         */

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
