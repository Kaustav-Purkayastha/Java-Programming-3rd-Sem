/*Program to show working of different functions of String and StringBuffer classes like
setCharAt(), setLength(), append(), insert(), concat() and equals().*/

class Program8 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("RAMBO");
        StringBuilder stbr = new StringBuilder("MOHAN IS A GOOD BOY");
        System.out.println("Original String : " + stbr);
        stbr.setCharAt(0, 'R');
        System.out.println("After using setCharAt(0,'R') : " + stbr);
        stbr.append(true);
        System.out.println("After using append() : " + stbr);
        System.out.println("Original length : " + sb.length() + " string :" + sb);
        sb.setLength(3);
        System.out.println("After using setLength(3) length : " + sb.length() + " string :" + sb);
        sb.insert(3, 'U');
        System.out.println("After using insert(3,'U') :" + sb);
        String str1 = "AMAN", test = "AMAN";
        String str2 = " GUPTA";
        System.out.println(str1.equals(test));
        System.out.println(str1.equals(str2));
        System.out.println(str1.concat(str2));
    }
}