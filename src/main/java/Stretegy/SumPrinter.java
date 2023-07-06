package Stretegy;

public class SumPrinter {

    // 총 합을 계산하는 방법이 있는 SumStretegy 와 총 합을 구하기 위한 n
    public void print(SumStretegy stretegy, int n) {
        System.out.printf("총 합: %d", n);
        System.out.println(stretegy.get(n));
    }
}
