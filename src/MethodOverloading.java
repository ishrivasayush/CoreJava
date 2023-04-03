public class MethodOverloading {
    public static void main(String[] args) {
        Calcy c=new Calcy();
        c.add(100,200);
    }
}
class Calcy{
    int a;
    int b;

    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    float add(float a,float b)
    {
        return a+b;
    }
    float add(int a,float b)
    {
        return a+b;
    }
    float add(float a,int b)
    {
        return a+b;
    }
}