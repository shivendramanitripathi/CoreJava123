package inheritence;

public class TestInheritence12 {
    public static void main (String[]args) {

        Biycycle bicycle = new Biycycle(100, 3);
        System.out.println("Bicyle details are \n"+bicycle.toString());

        TestInheritence testInheritence = new TestInheritence( 200,15,22);
        System.out.println("\n\nMountain bike details are \n"+ testInheritence.toString());
    }
    }

