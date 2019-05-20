package Abstraction;

/* File name : Salary.java */
public class Salary1 extends Employee1 {
    private double salary;   // Annual salary

    public double computePay() {
        /**this include error then comment sout
         * */
        //System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
    // Remainder of class definition
}
