public class NewReleasePrice extends Price {

   public int getPriceCode() {
      return Movie.NEW_RELEASE;
   }

   // ✔ cálculo específico de novos lançamentos
   public double getCharge(int daysRented) {
      return daysRented * 3;
   }
}
