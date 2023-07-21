package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(53));
        }
    }

    public static String fizzBuzz(int i) {
        String str = String.valueOf(i);
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            int num = Character.getNumericValue(str.charAt(j));
            switch (num) {
                case 3 -> {
                    res.insert(0, "Fizz");
                }
                case 5 -> {
                    res.append("Buzz");
                }
            }
        }
        if (i % 3 == 0) {
            res.append("Fizz");
        }
        if (i % 5 == 0) {
            res.append("Buzz");
        }
        String result = res.toString();
        return result.equals("") ? str : result;
    }
}
