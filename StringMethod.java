// using Java's built-in String methods.
public class StringMethod {

    public static void main(String[] args) {
        // Original strings for demonstration
        String text = "   Java Programming is Fun!   ";
        String text2 = "JAVA";
        String text3 = "java";
        String numbers = "1,2,3,4,5";
        String regexText = "apple,orange,banana,apple";
        String emptyText = "";
        String spacedText = "  hello  ";

        // 1. contains() - checks if string contains a sequence
        boolean containsFun = text.contains("Fun");
        System.out.println("1. Contains 'Fun'? " + containsFun);

        // 2. substring() - extracts part of string
        String sub1 = text.substring(5);
        String sub2 = text.substring(5, 16);
        System.out.println("2. Substrings: '" + sub1 + "', '" + sub2 + "'");

        // 3. join() - joins strings with delimiter
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("3. Joined string: " + joined);

        // 4. replace() - replaces characters
        String replaced = text.replace('a', '@');
        System.out.println("4. Replaced 'a' with '@': " + replaced);

        // 5. replaceAll() - replaces all matches of regex
        String replacedAll = regexText.replaceAll("apple", "fruit");
        System.out.println("5. Replaced all 'apple': " + replacedAll);

        // 6. replaceFirst() - replaces first match of regex
        String replacedFirst = regexText.replaceFirst("apple", "fruit");
        System.out.println("6. Replaced first 'apple': " + replacedFirst);

        // 7. charAt() - gets character at index
        char thirdChar = text.charAt(3);
        System.out.println("7. Character at index 3: " + thirdChar);

        // 8. getBytes() - converts string to byte array
        byte[] byteArray = text.getBytes();
        System.out.println("8. Byte array length: " + byteArray.length);

        // 9. indexOf() - finds index of substring
        int indexOfPro = text.indexOf("Pro");
        System.out.println("9. Index of 'Pro': " + indexOfPro);

        // 10. compareTo() - lexicographical comparison (case-sensitive)
        int compareResult = text2.compareTo(text3);
        System.out.println("10. Comparison (case-sensitive): " + compareResult);

        // 11. compareToIgnoreCase() - case-insensitive comparison
        int compareIgnore = text2.compareToIgnoreCase(text3);
        System.out.println("11. Comparison (ignore case): " + compareIgnore);

        // 12. trim() - removes leading/trailing whitespace
        String trimmed = text.trim();
        System.out.println("12. Trimmed: '" + trimmed + "'");

        // 13. format() - formats string
        String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
        System.out.println("13. Formatted: " + formatted);

        // 14. split() - splits string into array
        String[] numArray = numbers.split(",");
        System.out.println("14. Split numbers:");
        for (String num : numArray) {
            System.out.println("    - " + num);
        }

        // 15. toLowerCase() - converts to lowercase
        String lower = text.toLowerCase();
        System.out.println("15. Lowercase: " + lower);

        // 16. toUpperCase() - converts to uppercase
        String upper = text.toUpperCase();
        System.out.println("16. Uppercase: " + upper);

        // 17. valueOf() - converts other types to string
        String value = String.valueOf(123.45);
        System.out.println("17. Value of double: " + value);

        // 18. toCharArray() - converts to character array
        char[] charArray = text.toCharArray();
        System.out.println("18. First 5 chars: " + 
                          new String(charArray, 0, 5) + "...");

        // 19. matches() - checks if matches regex
        boolean matches = text.matches(".*Fun.*");
        System.out.println("19. Matches '.*Fun.*'? " + matches);

        // 20. startsWith() - checks prefix
        boolean startsWithJava = text.startsWith("Java");
        System.out.println("20. Starts with 'Java'? " + startsWithJava);

        // 21. endsWith() - checks suffix
        boolean endsWithFun = text.endsWith("Fun!");
        System.out.println("21. Ends with 'Fun!'? " + endsWithFun);

        // 22. isEmpty() - checks if empty
        boolean isEmpty = emptyText.isEmpty();
        System.out.println("22. Is empty? " + isEmpty);

        // 23. intern() - returns canonical representation
        String interned = text.intern();
        System.out.println("23. Interned string reference: " + 
                         (interned == text.intern()));

        // 24. contentEquals() - compares content with CharSequence
        boolean contentEqual = text.contentEquals(new StringBuilder(text));
        System.out.println("24. Content equals StringBuilder? " + contentEqual);

        // 25. hashCode() - returns hash code
        int hashCode = text.hashCode();
        System.out.println("25. Hash code: " + hashCode);

        // 26. subSequence() - similar to substring but returns CharSequence
        CharSequence subSeq = text.subSequence(5, 16);
        System.out.println("26. Subsequence: " + subSeq);

        // Additional demonstration with the spaced text
        System.out.println("\nAdditional demo with '" + spacedText + "':");
        System.out.println("Trimmed length: " + spacedText.trim().length());
        System.out.println("Original length: " + spacedText.length());
    }
}