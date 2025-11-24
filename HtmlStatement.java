public class HtmlStatement extends Statement {

    @Override
    protected String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
               rental.getCharge() + "<BR>\n";
    }

    @Override
    protected String footerString(Customer customer) {
        StringBuilder result = new StringBuilder();
        result.append("<P>You owe <EM>").append(customer.getTotalCharge()).append("</EM><P>\n");
        result.append("On this rental you earned <EM>")
              .append(customer.getTotalFrequentRenterPoints())
              .append("</EM> frequent renter points<P>");
        return result.toString();
    }
}
