package OOPs;

class Family{
    String familyName;
 
    public Family(String familyName){
        this.familyName = familyName;
    }

    public String getfamilyName(){
        return familyName;
    }

    public void displayfamilyName()
    {
        System.out.println("Family Name: " +familyName);
    }
}

class Parent extends Family{
    public String parentName;

    Parent(String familyName, String parentName){
        super(familyName);
        this.parentName = parentName;
    }

    public String getparentName(){
        return parentName;
    }

    public void displayparentName(){
        displayfamilyName();
        System.out.println("Parent Name: " +parentName);
    }
}

class Child extends Family{
    public String childName;

    public Child(String familyName, String childName){
        super(familyName);
        this.childName = childName;
    }
    
    public String getchildName(){
        return childName;
    }

    public void displaychildName(){
        displayfamilyName();
        System.out.println("Child Name: " +childName);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        
        Parent p = new Parent("ABC", "XYZ");
        p.displayparentName();

        Child c = new Child("ABC", "AAA");
        c.displaychildName();
    }
}
