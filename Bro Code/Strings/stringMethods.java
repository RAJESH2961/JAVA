public class stringMethods{
    public static void main(String[] args) {
        String name = "Rajesh";
        System.out.println(name.isEmpty());
        name = name.replace('a', 'j');
        System.out.println(name);
        //Seperating username and Domain
        String email = "grajesh2906@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("User name is :"+username);
        String domain = email.substring(email.indexOf('@')+1);
        System.out.println("Domain is : "+domain);

    }
}