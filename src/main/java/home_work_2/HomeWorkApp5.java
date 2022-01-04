package home_work_2;

public class HomeWorkApp5 {
    public static void main(String[] args) {

        System.out.println(isLeapOrNotLeapYear(2024));

    }

    //Метод определяет является ли год високосным или не является и возвращает логическое значение
    public static boolean isLeapOrNotLeapYear(int y) {
        int l = y % 4;

       if(l == 0){
           l = y % 100;
           if(l == 0){
               l = y % 400;
               if(l == 0){
                   return true;
               } else {
                   return false;
               }
           } else {
               return true;
           }
       } else {
           return false;
       }

    }
}
