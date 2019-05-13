package PrintMethod;

public class Example02 {
    public static void main(String[] args) {
        int i, j, k;
        i = 10;
        j = 15;
        k = i + j;

        System.out.println("The addition is "+k);
        System.out.println("The addition of "+ i +" and "+j +" is "+k);

        System.out.printf("The addition of %d and %d is %d", i,j,k);
    }
}
