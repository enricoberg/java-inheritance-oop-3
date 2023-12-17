class User {
    private int userId;
    private String username;
    private String email;

    public User(int id, String user, String mail){
        userId=id;
        username=user;
        email=mail;
    }
    //GETTERS OF USER CLASS
    public int getuserId(){
        return userId;
    }
    public String getusername(){
        return username;
    }
    public String getemail(){
        return email;
    }
    //SETTERS OF USER CLASS
    public void setuserId(int user){
        this.userId=user;
    }
    public void setusername(String user){
        this.username=user;
    }
    public void setemail(String mail){
        this.email=mail;
    }
}

class Customer extends User {
    private String address;
    
    public Customer(int id, String user, String mail, String customerAddress){
        super(id, user, mail);
        address=customerAddress;
    }
    
    //GETTER AND SETTER FOR ADDITIONAL PROPERTY ADDRESS
    public String getaddress(){
        return address;
    }
    public void setaddress(String newAddress){
        this.address=newAddress;
    }
}

class Admin extends User {
    private int adminId;
    private String adminRole;

    public Admin(int id, String user, String mail, int adminid){
        super(id,user,mail);
        adminId=adminid;
        adminRole="ADMIN";
    }
    //GETTER AND SETTER FOR ADDITIONAL ADMIN PROPERTIES
    public int getadminId(){
        return adminId;
    }
    public void setadminId(int newId){
        this.adminId=newId;
    }
    public String getadminRole(){
        return adminRole;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        User basicuser = new User(56,"mario_rossi","mario.rossi@gmail.com");
        Customer customer1 = new Customer(43,"giorgio_verdi","giorgio.verdi@gmail.com","via Risorgimento 43, Milano (MI)");
        Admin adminuser = new Admin(1,"admin","admin",123);
        basicuser.setusername("mario.rossi");
        System.out.println(basicuser.getusername());
        customer1.setaddress("piazza Martiri 5, Torino (TO)");
        System.out.println(customer1.getaddress());
        System.out.println(adminuser.getadminRole());

    }
}
