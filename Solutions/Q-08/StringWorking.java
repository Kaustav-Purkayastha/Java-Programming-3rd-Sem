// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

/* 8. Write a Java program to show working of different functions of String and StringBuffer classes like
setCharAt(), setLength(), append(), insert(), concat() and equals(). */


public class StringWorking {
    public static void main(String args[]) {
        // StringBuffer example
        StringBuffer sb = new StringBuffer("RAMBO");
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("Original length : " + sb.length());

        sb.setLength(3);
        System.out.println("After using setLength(3) length : " + sb.length() + " string :" + sb);

        sb.insert(3, 'U');
        System.out.println("After using insert(3,'U') :" + sb);

        // StringBuilder example
        StringBuilder stbr = new StringBuilder("MOHAN IS A GOOD BOY");
        System.out.println("\nOriginal StringBuilder : " + stbr);

        stbr.setCharAt(0, 'R');
        System.out.println("After using setCharAt(0,'R') : " + stbr);

        stbr.append(true);
        System.out.println("After using append() : " + stbr);

        // String example
        String str1 = "AMAN", test = "AMAN";
        String str2 = " GUPTA";

        System.out.println("\nString comparison using equals() : " + str1.equals(test));
        System.out.println("String comparison using equals() : " + str1.equals(str2));
        System.out.println("String concatenation using concat() : " + str1.concat(str2));
    }
}