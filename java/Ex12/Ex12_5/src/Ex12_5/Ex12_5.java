//한 번에 한 칸씩 밀려져 있는 체스판이 있음
//이 체스판 위에 밀리는 곡물의 수를 계산하는 재귀 메서드 작성
package Ex12_5;


public class Ex12_5 {
	public static void main(String[] args) {
        int k = 10; // Number of squares
        long totalGrains = getTotalGrains(k, 1);
        System.out.println("Total number of grains on " + k + " squares: " + totalGrains);
    }

    public static long getTotalGrains(int k, long grains) {
        if (k == 1) {
            return grains;
        } else {
            return grains + getTotalGrains(k - 1, grains * 2);
        }
    }

}
