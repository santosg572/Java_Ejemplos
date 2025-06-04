public class Harmonic { 

    // returns 1/1 + 1/2 + 1/3 + ... + 1/n

    public double hh(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

}


