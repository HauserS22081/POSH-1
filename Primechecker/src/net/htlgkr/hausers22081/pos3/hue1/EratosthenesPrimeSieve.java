package net.htlgkr.hausers22081.pos3.hue1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EratosthenesPrimeSieve implements PrimeSieve{


    public EratosthenesPrimeSieve(int upperBound) {
        // length = upperBound - 2 -> because then areNumbersPrimes[0] =^ 2;
        boolean[] areNumbersPrimes = new boolean[upperBound - 2];

        // at beginning every number is a Prime and they get false when they are the product of another number
        fillArrayWithTrue(areNumbersPrimes);

        makeAllNumbersThatAreNotPrimesFalse(areNumbersPrimes);
    }

    private void makeAllNumbersThatAreNotPrimesFalse(boolean[] areNumbersPrimes) {
        
    }

    private void fillArrayWithTrue(boolean[] array) {
        Arrays.fill(array, true);
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
