interface Tiger {
    void mA();
}

interface Lion {
    void mB();
}

class C implements Tiger,Lion{
    public void mA() {
        System.out.println("ROAR..");
    }

    public void mB() {
        System.out.println("MEOW..!");
    }

    public void mC() {
        System.out.println("GO AND STUDY KID:)");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.mA(); 
        obj.mB(); 
        obj.mC(); 
    }
}
