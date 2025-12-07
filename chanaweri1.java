public class chanaweri1 {
    public static void main(String[] args) {

        // For Loops

        for (int i = 0; i <= 10; i++) {
            System.out.println(i); // 1 დან 10-მდე

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("გიორგი სეთურიძე"); // სახელის ხუთჯერ დაწერა
        }


        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i); // ლუწი რიცხვებით თვლა
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i); //  10 დან კლდებადობის მიხედვით
        }

        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                break;
            System.out.println("i  = " + i); // თვლის შეწყვეტა break -ით
        }

        for (int i = 1; i <= 40; i++) {
            if (i % 10 == 0)
                continue;
            System.out.println("i  = " + i); // თვლის გაგრძელება continue -თი
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(" i = " + i);

            for (int j = 0; j <= i; j++) {
                System.out.println(" j = " + j);  // Nested loops
            }

            String text = "Hello Friend";
            for (int a = 0; a < text.length(); a++) {
                System.out.println(a + "--" + " ადგილზე მდებარეობს ასო " + text.charAt(a)); // რომელ პოზიციაზე რომელი სიმბოლო დგას
            }

        }

        String text = "Hello Friend";
        for (int i = 0; i < text.length(); i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + "ადგილზე მდებარეობს ასო " + text.charAt(i)); // მეხუთე ადგილის გამოტოვება
        }

        // While Loops

        int i = 0;
        while (i < 20 ) {
            if (i != 0 && i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i); // როდესაც უნაშთოდ იყოფა სამზე გაგრძელდეს ციკლი
            i ++ ;
        }

    }
}
