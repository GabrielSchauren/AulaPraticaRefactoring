public abstract class Price {
   public abstract int getPriceCode();

   public abstract double getCharge(int daysRented);

   // ✔ comportamento padrão: 1 ponto
   public int getFrequentRenterPoints(int daysRented) {
      return 1;
   }
}
