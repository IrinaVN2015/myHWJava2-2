public class Main {
    public static void main(String[] args) {

        int x = 100; //денег на текущем счете у клиента
        int y = 1500; //сумма пополнения
        int z = y / 100; //количество бонусных рублей
        int k = x + y; //сумма денег на счете и суммы пополнения


        if (y > 1000) {
            System.out.println((z) + k + " итоговый счет, включая бонусные рубли ");
            System.out.println((y / 100 + " количество бонусных рублей "));
        } else {
            System.out.println(k + " итоговый счет ");
       }

        }
 }

