public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String lowercased = "";
        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if(x >= 'A' && x <= 'Z'){
                x = (char)(x + 32);
            }
            lowercased += x;
        }
        return lowercased;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int loc2 = 0;
        
        for(int i = 0; i < str1.length(); i++){
            if(loc2 == str2.length()) return true;

            if(str1.charAt(i) == str2.charAt(loc2)){
                loc2++;
            } else {
                loc2 = 0;
            }
        }

        return loc2 == str2.length();
    }
}
