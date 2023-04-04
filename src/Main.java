public class Main {
    public static void main(String[] args) {

        int moneyInAccount = 100; //денег на текущем счете у клиента
        int deposit = 1500; //сумма пополнения
        int bonusRubles = deposit / 100; //количество бонусных рублей
        int allMoney = moneyInAccount + deposit; //сумма денег на счете и суммы пополнения


        if (deposit > 1000) {
            System.out.println((bonusRubles) + allMoney + " итоговый счет, включая бонусные рубли ");
            System.out.println((deposit / 100 + " количество бонусных рублей "));
        } else {
            System.out.println(allMoney + " итоговый счет ");
        }

    }
}

