public abstract class Statement {

    // Template Method
    public String value(Customer customer) {
        StringBuilder result = new StringBuilder();
        result.append(headerString(customer));

        for (Rental rental : customer.getRentals()) {
            result.append(eachRentalString(rental));
        }

        result.append(footerString(customer));
        return result.toString();
    }

    // Métodos abstratos que mudam de acordo com a implementação
    protected abstract String headerString(Customer customer);
    protected abstract String eachRentalString(Rental rental);
    protected abstract String footerString(Customer customer);
}
