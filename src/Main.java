public class Main {
    public static void main(String[] args) {

    // Задача 1

    int a = 100000;
    byte b = 100;
    short c = 10000;
    long d = 1000000L;
    float e = 5.55555f;
    double f = 3.3333333333;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);


    // Задача 2

    float g = 27.12f;
    long h = 987678965549L;
    float i = 2.786f;
    short j = 569;
    short k = -159;
    short l = 27897;
    byte m = 67;

    System.out.println(g);
    System.out.println(h);
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(l);
    System.out.println(m);


    // Задача 3

    byte lA = 23;
    byte aS = 27;
    byte eA = 30;

    short totalPages = 480;

    short pages = (short) (totalPages / (lA + aS + eA));

    System.out.println("На каждого ученика рассчитано " + pages + " листов бумаги");


    // Задача 4

    byte bottles2Min = 16;

    short bottles20Min = (short) (bottles2Min * 10);

    System.out.println("За 20 минут машина произвела " + bottles20Min + " штук бутылок");


    short bottlesDay = (short) (bottles20Min * (24 * 60 / 20));

    System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок");


    int bottles3Days = (bottlesDay * 3);

    System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");


    int bottlesMonth = bottles3Days * 10;

    System.out.println("За 1 месяц машина произвела " + bottlesMonth + " штук бутылок");


    // Задача 5

    byte totalCans = 120;

    byte whiteCans = 2;

    byte brownCans = 4;

    byte amountCans = (byte) (whiteCans + brownCans);

    byte classrooms = (byte) (totalCans / amountCans);

    byte totalWhiteCans = (byte) (classrooms * whiteCans);

    byte totalBlackCans = (byte) (classrooms * brownCans);

    System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBlackCans + " банок коричневой краски");


    // Задача 6

    byte quantityBananas = 5;
    byte weightBanana = 80;

    short volumeMilk = 200;
    byte  weightMilk = 105;

    byte quantityIceCream = 2;
    byte weightIceCream = 100;

    byte quantityEggs = 4;
    byte weighEgg = 70;

    float totalG = (short) (quantityBananas * weightBanana + volumeMilk * weightMilk + quantityIceCream * weightIceCream + quantityEggs * weighEgg);

    System.out.println("Вес спортзавтрака составляет " + totalG + " г");

    float totalKg = totalG/ 1000;

    System.out.println("Вес спортзавтрака составляет " + totalKg + " кг");


    // Задача 7

    short loseWeight = 7000;

    short min = 250;
    short max = 500;

    short daysMin = (short) (loseWeight / min);
    short daysMax = (short) (loseWeight / max);
    short daysAverage = (short) ((daysMin + daysMax)/2);

    System.out.println("Уйдет " + daysMin + " дней на похудение, если каждый день будет терять в весе " + min + " г");

    System.out.println("Уйдет " + daysMax + " дней на похудение, если каждый день будет терять в весе " + max + " г");

    System.out.println("В среднем на похудение 7 кг уйдет " + daysAverage + " день");


    // Задача 8

    int masha = 67760;
    int denis = 83690;
    int kristina = 76230;

    int masha2 = (int) (masha * 1.1);
    int denis2 = (int) (denis * 1.1);
    int kristina2 = (int) (kristina * 1.1);

    int mashaY = (masha2 - masha) * 12;
    int denisY = (denis2 - denis) * 12;
    int kristinaY = (kristina2 - kristina) * 12;

    System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + mashaY + " рублей.");
    System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denisY + " рублей.");
    System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + kristinaY + " рублей.");

    }
}