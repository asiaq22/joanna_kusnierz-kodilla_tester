public class LeapYear {

        private static boolean czyPrzestepny (int year)
        {
            return ((year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0));
        }
        public static void main (String[] args) {
            int year = 2021;

            if(czyPrzestepny(year)) {
                System.out.println("To jest rok przestępny");
            }
            else{
                System.out.println("To nie jest rok przestępny");
            }
        }
    }
