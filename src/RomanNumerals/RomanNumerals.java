package RomanNumerals;

public class RomanNumerals {

    public static void main(String[] args) {
        int num = 49;
        String str = fromNormal(num);
        System.out.println(str);
        System.out.println(fromRoman(str));
    }

    public static String fromNormal(int num) {
        if (num > 3000 || num == 0) {
            return null;
        }
        StringBuilder str = new StringBuilder();
        int i = num / 1000;
        if (i != 0) {
            str.append("M".repeat(i));
            num -= i * 1000;
        }
        char[] chars = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int k = 2;
        int div;
        for (int j = 100; k <= 6; j = j / 10) {
            div = num / j;
            if (div != 0) {
                if (div < 4) {
                    str.append(String.valueOf(chars[k]).repeat(div));
                }
                if (div > 4 && div < 9) {
                    str.append(chars[k - 1]);
                    str.append(String.valueOf(chars[k]).repeat(div - 5));
                }
                if (div == 4) {
                    str.append(chars[k]);
                    str.append(chars[k - 1]);
                }
                if (div == 9) {
                    str.append(chars[k]);
                    str.append(chars[k - 2]);
                }
                num -= j * div;
            }
            k += 2;
        }
        return str.toString();
    }

    public static int fromRoman(String str) {
        if (str == null) {
            return 0;
        }
        int res = 0;
        int num1 = numFromDig(str.charAt(str.length() - 1));
        int num2 = 0;
        if (str.length() == 1) {
            return num1;
        }
        res += num1;
        for (int i = str.length() - 2; i >= 0; i--) {
            num2 = numFromDig(str.charAt(i));
            if (num2 < num1) {
                res -= num2;
            } else {
                res += num2;
            }

            num1 = num2;
        }

        return res;
    }

    static int numFromDig(char ch) {
        switch (ch) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}
