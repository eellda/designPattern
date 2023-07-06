package Stretegy;

public class SimpleSumStretegy implements SumStretegy {
    @Override
    public int get(int n) {

        int sum = n;

        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
