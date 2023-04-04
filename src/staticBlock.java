public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
    }
}
class Mobile{
    static String name;
    String Model;
    float price;
    static {
        name="Apple";
        System.out.println("Ayush");
    }
}