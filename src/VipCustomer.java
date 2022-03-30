public class VipCustomer {
    // Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.
    private String name;
    private double creditLimit;
    private String eMailAddress;
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit,"yes@mail.com");
        System.out.println("With two parameters VipCustomer runs...");
    }

    public VipCustomer(String name, double creditLimit, String eMailAddress){
        System.out.println("With three parameters VipCustomer runs...");
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }
    public VipCustomer(){
        this("Ali", 5458,"jonathan.steven@gx.com");
        System.out.println("Without parameters VipCustomer runs...");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEMailAddress() {
        return eMailAddress;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer0 = new VipCustomer();
        System.out.println("1:name " + vipCustomer0.getName() + " 1:Credit Limit " + vipCustomer0.getCreditLimit()+
                " 1:Mail " + vipCustomer0.getEMailAddress());

        VipCustomer vipCustomer1 = new VipCustomer("John" ,142562); // no effect
        System.out.println("2:name " + vipCustomer1.getName() + " 2:Credit Limit " + vipCustomer1.getCreditLimit()+
                " 2:Mail " + vipCustomer1.getEMailAddress());

        VipCustomer vipCustomer = new VipCustomer("Ayse", 254, "no mail address");
        System.out.println("Name: " + vipCustomer.getName() + " Credit Limit: " + vipCustomer.getCreditLimit()
                + "  E mail address: " + vipCustomer.getEMailAddress());




    }
}
