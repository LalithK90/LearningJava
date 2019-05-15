package Array;

public class JaggedArray {
    public static void main(String[] args) {
        Example01();
    }

    private static void Example01() {
        int a = 4, b = 5, c = 6, d = 7;
        int x[] = {1, 2, 3, 4, 5};
        int y[] = {7, 8, 9};
        int z[] = {6, 5, 4};

        int p[][] = {
                {1, 2, 3, 4, 5, 9},
                {7, 8, 9},
                {6, 5, 4}
        };
        for (int i[] : p){
            for (int j :i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        //create a jagged array
        int[][] k = new int[3][5];
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[5];


    }
}
