public class Exercise3 {
    public static void main(String[] args) {
         double investmentAmount = 1000.0;
         double profitRate = 0.05;

         for (int year = 1; year <= 10; year++) {
            investmentAmount = investmentAmount * (1 + profitRate);

            System.out.println("Year " + year + ": " + investmentAmount);

         }

        
    }
    
}
