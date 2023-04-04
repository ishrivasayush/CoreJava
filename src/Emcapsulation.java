public class Emcapsulation {
    public static void main(String[] args) {
        MobilePhone mp=new MobilePhone();
        mp.setName("Apple");
        mp.setCompany("Npple");
        System.out.println(mp.getCompany());
        System.out.println(mp.getName());
    }
}
class MobilePhone{
    private String name;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company.charAt(0)=='A') {
            this.company = company;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
