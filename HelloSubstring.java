public class HelloSubstring {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            String result = "Hello ";

            for (int i = 0; i < args.length; i++) {
                result += args[i] + ", ";
            }

            // remove last ", "
            result = result.substring(0, result.length() - 2);

            System.out.println(result);
        }
    }
}
