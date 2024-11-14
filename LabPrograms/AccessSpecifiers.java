class Decleration {
    public int pubvar = 10;
    private int privar = 10;
    protected int provar = 10;
    int defaultvar = 10;

    void display(){
        System.out.println(pubvar);
        System.out.println(privar);
        System.out.println(provar);
        System.out.println(defaultvar);
    }
}
public class AccessSpecifiers{
    public static void main(String[] args) {
        Decleration obj = new Decleration();
        System.out.println(obj.pubvar);
        // System.out.println(obj.privar);
        System.out.println(obj.provar);
        System.out.println(obj.defaultvar);
        
        
    }
}
