package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2; j++) {
                if (j >= cathetusLength + 1 - i && j <= cathetusLength) {
                    System.out.print(cathetusLength - j + 1);
                } else if (j > cathetusLength && j <= cathetusLength + i - 1) {
                    System.out.print(j - cathetusLength + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
