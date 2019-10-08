package lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

//Добавить в программу "Вендинговый автомат" журналирование событий,
//при этом стоит указать различные уровни логирования, как информационного уровня,
//так и предупреждения и ошибки.
//Настроить сбор логов в файл.
//Фреймворк логирования - на ваш выбор.
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("Начало работы программы");
        InternalAccount internalAccount = new InternalAccount();
        Drinks[] drinks = Drinks.values();
        while (true){
            Scanner in= new Scanner(System.in);
            System.out.println("1 - Посмотреть меню" + "\n" + "2 - Внести денги" + "\n" + "3 - Выбрать напиток");
            int x;
            try {
                x = in.nextInt();
            } catch (Exception e){
                logger.warn("Некорректное значение");
                continue;
            }
            switch (x){
                case 1: int i = 1;
                    logger.info("Выбрано: просмотр меню");
                    for (Drinks dr: drinks) {
                        System.out.println(i + " " + dr + " " + drinks[i-1].getPrice() + "р.");
                        i++;
                    }
                    break;
                case 2: float sum;
                    logger.info("Выбрано: внесение денег");
                    try {
                        System.out.println("Внесите деньги");
                        sum = in.nextFloat();
                        internalAccount.setSum(sum);
                    } catch (Exception E){
                        logger.warn("Некорректное значение");
                        continue;
                    }
                    break;
                case 3: int drink;
                    logger.info("Выбрано: выбор напитка");
                    System.out.println("Введите номер напитка");
                    try {
                        drink = in.nextInt();
                        if (drink < 1 || drink > drinks.length){
                            logger.warn("Некорректное значение");
                            continue;
                        } else {
                            Drinks dr = drinks[drink-1];
                            if (dr.getPrice() <= internalAccount.getSum()){
                                System.out.println(dr);
                                internalAccount.setSum(- dr.getPrice());
                                logger.info("Баланс: {}", internalAccount.getSum());
                            } else {
                                logger.warn("Недостаточно средств. Пополните счёт.");
                                logger.info("Баланс: {}", internalAccount.getSum());
                                continue;
                            }
                        }

                    } catch (Exception e){
                        continue;
                    }
                    break;
            }
        }
    }
}
