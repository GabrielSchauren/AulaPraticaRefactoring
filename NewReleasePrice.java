public class NewReleasePrice extends Price {

   public int getPriceCode() {
      return Movie.NEW_RELEASE;
   }

   public double getCharge(int daysRented) {
      return daysRented * 3;
   }

   // ✔ comportamento especial para novos lançamentos
   public int getFrequentRenterPoints(int daysRented) {
      return (daysRented > 1) ? 2 : 1;
   }
}
