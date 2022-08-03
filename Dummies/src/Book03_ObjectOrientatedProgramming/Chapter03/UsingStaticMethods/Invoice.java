package Book03_ObjectOrientatedProgramming.Chapter03.UsingStaticMethods;

public class Invoice {
    private static double taxRate = 0.75;
    private double salesTotal;

    public double getTax() {
        return salesTotal * taxRate;
    }
}

//Here the instance method named salesTotal has no trouble accessing the static
//field taxRate.