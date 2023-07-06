package Stretegy;

public class GaussSumStretegy implements SumStretegy {
    @Override
    public int get(int n) {
        return (n + 1) * n / 2;
    }
}
