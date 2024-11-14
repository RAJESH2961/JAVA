//Base class
class FresherSalary{
    int FresherSalary = 36000;
    int attendanceBonus = 3000;
}

// Derived class
class Tcs extends FresherSalary{
    void PrintSalary()
    {
        System.out.println("Fresher salary in TCS is: " + ((float)FresherSalary * 12 / 100000) + " LPA");
    }
}

class Wipro extends FresherSalary{
    void PrintSalary()
    {
        System.out.println("Fresher salary in Wipro is: " + ((float)FresherSalary * 12 / 100000) + " LPA");
    }
}

class Infosys extends FresherSalary{
    void PrintSalary()
    {
        float totalSalary = FresherSalary * 12 + (attendanceBonus * 12);
        float salaryInLPA = totalSalary / 100000;
        System.out.println("Fresher salary in Infosys is: " + (salaryInLPA)  + " LPA");
    }
}


class hierarchical{
    public static void main(String[] args) {
        Tcs sal = new Tcs();
        sal.PrintSalary();

        Wipro wsal = new Wipro();
        wsal.PrintSalary();
        
        Infosys isal = new Infosys();
        isal.PrintSalary();
        
    }
}