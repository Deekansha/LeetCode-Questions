package com.company;

public class Palindrome {
    public boolean isPalindrome(String s) {
        /*if(s.length()== 0)
            return true;
        String z = s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(z);
        String reverse = "";
        for(int i = z.length()-1;i>=0;i--)
            reverse+= z.charAt(i);
        System.out.println(reverse);
        return reverse.equals(z);*/
        for(int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                ++j;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                --i;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Palindrome p = new Palindrome();

        String s = "A man, a plan, a canal: Panama";
        String t = "race a car";
        boolean x = p.isPalindrome(s);
        System.out.println(x);
        //String str1 = "amanaplanacanalpanama";
        //String str2 = "amanaplanacanalpanama";
        //System.out.println(str1.equals(str2));


}
}

