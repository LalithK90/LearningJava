package Operators.Statments;

public class LabeledAndBreak {
    public static void main(String[] args) {
// break --> switch, loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( i == 2 ){
                    break; // unlabeled break statement
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //labeled break
       lalith: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( i == 2 ){
                    break lalith; // labeled break statement
                    //if there is anything belong which was labeled as lalith after meet the break that is stoped
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
