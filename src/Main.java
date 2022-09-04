public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(){
        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2020;
        int clientOS = 1;
        if(clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложение для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложение для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложение для Android по ссылке");
            } else {
                System.out.println("Установите версию приложение для Android по ссылке");
            }
    }
}
    public static void task3(){
        //Задание 3
        System.out.println("Задание 3");
        int year = 2020;
        if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task4(){
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if(deliveryDistance > 20){
            deliveryDays++;
        }

        if(deliveryDistance > 60){
            deliveryDays++;
        }

        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void task5(){
        //Задания 5
        System.out.println("Задание 5");
        int monthNumber = 9;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц: " + monthNumber);
        }
    }
    public static void task6() {
        //Задание 7
        System.out.println("Задание 6");

        int age = 19;

        int salary = 58_000;

        double limit;



        if (age < 23) {

            limit = salary * 2;

        } else {

            limit = salary * 3;

        }

        if (salary >= 50_000) {

            limit *= 1.2;

        } else if (salary >= 80_000) {

            limit *= 1.5;

        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");

    }







    public static void task7() {
        //Задание 7
        System.out.println("Задание 7");

        int age = 25;

        int salary = 60_000;

        int wantedSum = 330_000;

        int maxPayment = salary / 2;

        int creditTerm = 12;

        float interestRate = 10;

        if (age < 23) {

            interestRate++;

        } else if (age < 30) {

            interestRate += 0.5;

        }

        if (salary > 80_000) {

            interestRate -= 0.7;

        }

        float creditSum = wantedSum * (1 + (interestRate / 100));

        float payment = creditSum / creditTerm;

        System.out.println("Ваш максимальный платеж: " + maxPayment + ". Платеж по кредиту: " + payment);

        if (payment > maxPayment) {

            System.out.println("Отказано.");

        } else {

            System.out.println("Одобрено.");

        }

    }
}