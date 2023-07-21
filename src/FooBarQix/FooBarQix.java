package FooBarQix;

public class FooBarQix {

    public static void main(String[] args) {
        System.out.println(compute(String.valueOf(303)));

    }

    public static String compute(String str) {
        int num = Integer.parseInt(str);
        if (num <= 0) {
            return "*";
        }
        StringBuilder res = new StringBuilder();
        if (num % 3 == 0) {
            res.append("Foo");
        }
        if (num % 5 == 0) {
            res.append("Bar");
        }
        if (num % 7 == 0) {
            res.append("Qix");
        }
        for (int i = 0; i < str.length(); i++) {
            res.append(checkNum(Character.getNumericValue(str.charAt(i))));
        }
        String result = res.toString();
        return result.matches("\\**") ? str.replace('0','*') : result;
    }

    public static String checkNum(int num) {
        StringBuilder res = new StringBuilder();
        switch (num) {
            case 0 -> {
                res.append("*");
            }
            case 3 -> {
                res.append("Foo");
            }
            case 5 -> {
                res.append("Bar");
            }
            case 7 -> {
                res.append("Qix");
            }
        }
        return res.toString();
    }
}
