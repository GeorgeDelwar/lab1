/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell-PC
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            {
                String s = args[i];

                if(isPalindrome(s))
                {
                    System.out.println(s + " - Палиндром");
                }
                else
                {
                    System.out.println(s + " - Не палиндром");
                }
            }
	}

	public static boolean isPalindrome(String s) 
	{
        if (s.equals(reverseString(s)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

	public static String reverseString(String s)
	{
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) 
                {
                    result += s.charAt(i);
                }
            return result;
	}
}
