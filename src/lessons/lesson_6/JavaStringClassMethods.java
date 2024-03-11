package src.lessons.lesson_6;

public class JavaStringClassMethods {
    public static void main(String[] args) {

        char[] name = {'J', 'A', 'V', 'A'};
        String s = new String(name);
        System.out.println(s);

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        String s4 = new String("cat");

        //  ==  and equals operator
        System.out.println("----------------------------== operator----------------------------");
        System.out.printf("s1 == s2 ? %b\n", s1 == s2);
        System.out.printf("s1 == s3 ? %b\n", s1 == s3);
        System.out.printf("s3 == s4 ? %b\n", s3 == s4);

        // equals
        System.out.println("----------------------------equal----------------------------");
        System.out.printf("s1.equal(s2) ? %b\n", s1.equals(s2));
        System.out.printf("s1.equal(s3) ? %b\n", s1.equals(s3));
        System.out.printf("s3.equal(s4) ? %b\n", s3.equals(s4));

        // Remove
        System.out.println("\n----------------------------Replace nothing to remove----------------------------");
        String para = "John like to learn code";
        String removeWords = para.replace("to learn", "");
        System.out.println("para: " + para);
        System.out.println("removeWords: " + removeWords);

        // Concat
        System.out.println("\n----------------------------Concat----------------------------");
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(" ").concat(lastName));

        // substring
        System.out.println("\n----------------------------substring----------------------------");
        String url = "https://www.google.com";
        System.out.println("url.substring(8, 22):  " + url.substring(8, 22));
        System.out.println("url.substring(8):  " + url.substring(8));

        // IndexOf

        // Java String Format Specifiers
        System.out.println("\n----------------------------Java String Format Specifiers----------------------------");
        System.out.println(String.format("Integer value:%d", 101));
        System.out.println(String.format("String value: %s", "Hello Word!"));
        System.out.println(String.format("Float value: %f", 101.00));
        System.out.println(String.format("Hexadecimal value: %x", 101));
        System.out.println(String.format("Char value: %c", 'c'));

        // contains
        System.out.println("\n----------------------------boolean contains----------------------------");
        String result = "test status is fail";
        System.out.println("result: " + result);
        System.out.println("result.contains(\"passed\"): " + result.contains("passed"));

        // Regular expression |Regex
        System.out.println("\n----------------------------Regex----------------------------");

        String cookingTimeString = "Time 200 mins";
        String filerNumberString = cookingTimeString.replaceAll("[^0-9]","");
        int cookingTime = Integer.parseInt(filerNumberString);
        System.out.println("cookingTime: " + cookingTime);



        /*
         NOTE:
            1. Use the String.replace over the String.replaceAll when possible
            2. If you have to use the String.replaceAll, try to precompile the regular expression in the hot paths
            3. Go with a specialized version of the String.replace(char, char) instead of the String.replace(String, String) when you can
        */
    }
}
