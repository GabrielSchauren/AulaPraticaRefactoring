public class TextStatement extends Statement {

    @Override
    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    protected String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
               rental.getCharge() + "\n";
    }

    @Override
    protected String footerString(Customer customer) {
        StringBuilder result = new StringBuilder();
        result.append("Amount owed is ").append(customer.getTotalCharge()).append("\n");
        result.append("You earned ").append(customer.getTotalFrequentRenterPoints())
              .append(" frequent renter points");
        return result.toString();
    }
}
