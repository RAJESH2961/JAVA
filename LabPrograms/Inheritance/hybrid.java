// Base class ElectronicDevice
class ElectronicDevice {
    void powerOn() {
        System.out.println("Electronic device is powered on.");
    }

    void powerOff() {
        System.out.println("Electronic device is powered off.");
    }
}

// Class Computer inherits from ElectronicDevice
class Computer extends ElectronicDevice {
    void operatingSystem() {
        System.out.println("Computer runs an operating system.");
    }
}

// Class Laptop inherits from Computer
class Laptop extends Computer {
    void portability() {
        System.out.println("Laptop is portable.");
    }
}

// Class Desktop inherits from Computer
class Desktop extends Computer {
    void upgradeability() {
        System.out.println("Desktop has high upgradeability.");
    }
}

// Main class to demonstrate the technical class hierarchy
public class hybrid {
    public static void main(String[] args) {
        // Creating an object of Laptop
        Laptop myLaptop = new Laptop();
        myLaptop.powerOn();          // From ElectronicDevice class
        myLaptop.operatingSystem();  // From Computer class
        myLaptop.portability();      // From Laptop class
        myLaptop.powerOff();         // From ElectronicDevice class

        System.out.println();

        // Creating an object of Desktop
        Desktop myDesktop = new Desktop();
        myDesktop.powerOn();         // From ElectronicDevice class
        myDesktop.operatingSystem(); // From Computer class
        myDesktop.upgradeability();  // From Desktop class
        myDesktop.powerOff();        // From ElectronicDevice class
    }
}
