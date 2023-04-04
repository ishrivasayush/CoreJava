public class StringbufferAndBuliders {
    public static void main(String []args) {
        StringBuffer sb = new StringBuffer("Ayush");
        System.out.println(sb.capacity()); //21 beacause by defaul;t it is 16.
        sb.append(" Shrivasatava");
        System.out.println(sb);

        sb.insert(0,"Shri ");
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        String s=sb.toString();
        System.out.println(s);
    }
}
