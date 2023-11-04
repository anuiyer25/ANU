public class ParentChild extends Parent {

    public int addition (){
        super.d = 50;
//        super.a = 20;

        int c = a+d;
        return c;
        // return a+b;  both are same
// Method overloading and overriding

    }
    public void childdisplay(){
//        super.parentdisplay();
        System.out.println("Text from Child");
    }
    public static void main(String[] args) {
        ParentChild c = new ParentChild();
        System.out.println("Sum of number:"+ c.addition());
        c.parentdisplay();
        System.out.println("Parent and child method execution again: ");
        c.childdisplay();

    }
}

