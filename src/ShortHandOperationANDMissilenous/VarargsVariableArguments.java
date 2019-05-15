package ShortHandOperationANDMissilenous;

public class VarargsVariableArguments {

    public static void main(String[] args) {
        Show show = new Show();
        show.display(10);
        show.display(15, 20);
        
        Show1 show1 = new Show1();
        show1.display(1,2,3);
    }

    static class Show {
        public void display(int a) {
            System.out.println(a);
        }

        public void display(int a, int b) {
            System.out.println(a);
            System.out.println(b);
        }
    }

    static class Show1 {
        public void display(int ... a) // Varargs --> Variable Arguments
        {
            System.out.println("\n Varargs use \n");
            for (int b :a){
            System.out.println(b);}
        }
    }
}
