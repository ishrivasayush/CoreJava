public class Strings {
    public static void main(String[] args) {
        String s1="Ayush";
        String s2=new String("Ayush");
        System.out.println(s1.hashCode());
        System.out.println(s1.length());
        System.out.println(s1.concat(" Shrivastava"));
        System.out.println(s1+" Shrivastava");

        System.out.println(s1.charAt(0));

        String str1="Abhay";
        String str2="Abhay";
        String str3=new String("Abhay");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


    }
}
