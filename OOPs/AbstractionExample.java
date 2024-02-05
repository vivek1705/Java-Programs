package OOPs;

// Interface representing devices that can be powered on and off
interface PowerSwitchable {
    
    void powerOn();
    void powerOff();
}

// Interface representing devices that can display information
interface Displayable {
    void displayInfo();
}

// Abstract class representing an electronic device
abstract class ElectronicDevice implements PowerSwitchable, Displayable {

    String modelName;

    // Constructor for electronic devices
    ElectronicDevice(String modelName) {
        this.modelName = modelName;
    }

    void commonFunctionality() {
        System.out.println("This electronic device is a " + modelName);
    }
}

//  class representing a Television
class Television extends ElectronicDevice {
    // Constructor for Television
    Television(String modelName) {
        super(modelName);
    }

    public void powerOn() {
        System.out.println(modelName + " is powered on");
    }

    public void powerOff() {
        System.out.println(modelName + " is powered off");
    }

    public void displayInfo() {
        System.out.println("Television displays video and audio content");
    }
}

// class representing a Smartphone
class Smartphone extends ElectronicDevice {
    // Constructor for Smartphone
    Smartphone(String modelName) {
        super(modelName);
    }

    public void powerOn() {
        System.out.println(modelName + " is powered on");
    }

    public void powerOff() {
        System.out.println(modelName + " is powered off");
    }

    public void displayInfo() {
        System.out.println("Smartphone displays various applications and multimedia");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating instances of Television and Smartphone
        Television samsungTV = new Television("Samsung Smart TV");
        Smartphone iPhone = new Smartphone("iPhone 13");

        // Using common functionality and abstract methods
        samsungTV.commonFunctionality();
        samsungTV.powerOn();
        samsungTV.displayInfo();
        samsungTV.powerOff();

        System.out.println(); // Adding a line break for clarity

        iPhone.commonFunctionality();
        iPhone.powerOn();
        iPhone.displayInfo();
        iPhone.powerOff();
    }
}
