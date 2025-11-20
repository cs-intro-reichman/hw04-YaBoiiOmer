public class Primes {
    public static void main(String[] args) {
        boolean[] primes = findPrimes(3);
        printPrimes(primes);
    }

    public static boolean[] findPrimes(int n){
        boolean[] isPrime = new boolean[n+1];

        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i < isPrime.length; i++){
            if(!isPrime[i]) continue;
            for(int j = Math.min(i+1, isPrime.length -1); j < isPrime.length; j++){
                if(j % i == 0) isPrime[j] = false;

            }
        }

        return isPrime;
    }

    public static void printPrimes(boolean[] primes){
        System.out.println("Prime numbers up to " + (primes.length -1) + ":");
        int primeCounter = 0;
        for(int i = 0; i < primes.length; i++){
            if (!primes[i]) continue;
            primeCounter++;
            System.out.println(i);
        }
        double percentOfPrimes = ((double) primeCounter/ (primes.length -1))*100;
        System.out.println(String.format("There are %d primes between 2 and %d (%d%% are primes)", primeCounter, primes.length - 1, (int)percentOfPrimes));
    }
}