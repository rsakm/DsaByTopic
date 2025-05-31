package _01;

public class BinomialCoefficient {
    public static void main(String[] args) {

    }

    static long findBinomialCoeff(int n,int r){

        long factN = Factorial_n.findFactorial(n);
        long factR = Factorial_n.findFactorial(r);
        long factNminusR = Factorial_n.findFactorial(n-r);

        return factN/(factR * factNminusR);
    }
}
