package Project_Euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
    }

    public static int multipliesOf3Or5() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static Optional<Integer> largestPalindromeProduct() {
        int product = 0;
        int length = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 900; j--) {
                product = i * j;
                StringBuilder str = new StringBuilder(String.valueOf(product));
                length = str.length();
                if (str.substring(0, length / 2).equals(str.reverse().substring(0, length / 2))) {
                    list.add(product);
                }

            }
        }
        return list.stream().max(Integer::compareTo);
    }

    public static int smallestMultiple() {
        boolean isCorrect = true;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            isCorrect = true;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    isCorrect = false;
                }
            }
            if (isCorrect) {
                return i;
            }
        }
        return 0;
    }

    public static int sumSquareDifference() {
        int res = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                res += 2 * i * j;
            }

        }
        return res;
    }

    public static int prime() {
        int count = 0;
        int res = 0;
        for (int i = 1; count <= 10001; i++) {
            if (isPrime(i)) {
                count++;
                res = i;
            }
        }
        return res;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long num) {
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long findProductOfDigits(String num) {
        long product = 1;
        for (int i = 0; i < num.length(); i++) {
            product = product * Character.getNumericValue(num.charAt(i));
        }
        return product;
    }

    public static long largestProductInASeries() {
        String str = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        String res = "";
        long max = 0L;
        for (int i = 0; i < str.length() - 13; i++) {
            res = str.substring(i, i + 13);
            System.out.println(res);
            max = Math.max(findProductOfDigits(res), max);
        }
        return max;
    }


    public static int specialPythagoreanTriplet() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i < 999; i++) {
            a = i;
            for (int j = i; j < 1000 - i; j++) {
                b = j;
                c = 1000 - a - b;
                if (a < b && b < c && (a * a) + (b * b) == (c * c)) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    return a * b * c;
                }
            }
        }
        return 0;
    }


    public static long summationOfPrimes() {
        long sum = 0L;
        for (long i = 1; i < 2_000_000L; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static long largestProductInAGrid() {
        int[][] grid = new int[20][20];
        String str = "8 2 22 97 38 15 0 40 0 75 4 5 7 78 52 12 50 77 91 8 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 4 56 62 0 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 3 49 13 36 65 52 70 95 23 4 60 11 42 69 24 68 56 1 32 56 71 37 2 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 3 45 2 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 2 62 12 20 95 63 94 39 63 8 40 91 66 49 94 21 24 55 58 5 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 9 75 0 76 44 20 45 35 14 0 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 3 80 4 62 16 14 9 53 56 92 16 39 5 42 96 35 31 47 55 58 88 24 0 17 54 24 36 29 85 57 86 56 0 48 35 71 89 7 5 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 5 94 47 69 28 73 92 13 86 52 17 77 4 89 55 40 4 52 8 83 97 35 99 16 7 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 3 46 33 67 46 55 12 32 63 93 53 69 4 42 16 73 38 25 39 11 24 94 72 18 8 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 4 36 16 20 73 35 29 78 31 90 1 74 31 49 71 48 86 81 16 23 57 5 54 1 70 54 71 83 51 54 69 16 92 33 48 61 43 52 1 89 19 67 48";
        String[] s = str.split(" ");
        int index = 0;
        int max = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                grid[i][j] = Integer.parseInt(s[index]);
                index++;
            }
        }

        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));

        }
        int right = 0;
        int down = 0;
        int diag = 0;
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                right = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                down = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                diag = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                max = Math.max(max, right);
                max = Math.max(max, down);
                max = Math.max(max, diag);
            }
        }

        for (int i = 19; i > 3; i--) {
            for (int j = 0; j < 17; j++) {
                right = grid[i][j] * grid[i - 1][j] * grid[i - 2][j] * grid[i - 3][j];
                down = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                diag = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];
                max = Math.max(max, right);
                max = Math.max(max, down);
                max = Math.max(max, diag);
            }
        }
        return max;
    }

    public long highlyDivisibleTriangularNumber(long start, long end) {
        System.out.println(this);
        long num = 0;
        int count = 0;
        for (long i = start; i < end; i++) {
            count = 0;
            num += i;
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count > 500) {
                System.out.println("Success:" + this);
                return num;
            }
        }
        return 0;
    }


}
