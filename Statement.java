import java.util.Enumeration;

public abstract class Statement {

    // Template Method
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    // Métodos abstratos que mudam de acordo com a implementação
    protected abstract String headerString(Customer aCustomer);
    protected abstract String eachRentalString(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
}
