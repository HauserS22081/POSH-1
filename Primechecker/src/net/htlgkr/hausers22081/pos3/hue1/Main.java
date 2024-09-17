package net.htlgkr.hausers22081.pos3.hue1;

public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(500);

        System.out.println("15: " + !primeSieve.isPrime(15));
        System.out.println("5: " + primeSieve.isPrime(5));
        System.out.println("200: " + !primeSieve.isPrime(200));

        primeSieve.printPrimes();
    }
}
