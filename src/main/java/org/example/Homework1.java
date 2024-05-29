package org.example;

public class Homework1 {
    public static void main(String[] args) {
        //Переменная 1/////////////////////////////////////////////////////////////////////////////////
        String StringNumberOne = "Здесь должен находиться большое и очень большой текст";

        //is.Empty проверяет строку на пустоту
        boolean result1 = StringNumberOne.isEmpty();
        System.out.println(result1);


        //Переменная 2/////////////////////////////////////////////////////////////////////////////////
        String StringNumberTwo = "";

        //is.Blank проверяет строку на null
        boolean result2 = StringNumberTwo.isBlank();
        System.out.println(result2);


        //Переменная 3/////////////////////////////////////////////////////////////////////////////////
        String StringNumberThree = "Учимся писать на Java";

        //.substring позволяет получить часть строки 0 в данном случае начало строки,
        // 5 - пятый символ в строке
        String result3 = StringNumberThree.substring(0, 5);
        System.out.println(result3);


        //Переменная 4/////////////////////////////////////////////////////////////////////////////////
        String StringNumberFour = "Здесь могла быть ваша реклама";

        //.index.Of возвращает идекс под которым находится символ
        // или строка появляются первый раз в строке
        int result4 = StringNumberFour.indexOf("ь");
        System.out.println(result4);


        //Переменная 5/////////////////////////////////////////////////////////////////////////////////
        String StringNumberFive = "Что-то тут тоже лежит";

        //.lastIndexOf ищет указанную строку в данной строке с конца, если находит совпадение,
        // то возвращает номер первого символа
        int result5 = StringNumberFive.lastIndexOf("тут");
        System.out.println(result5);

        //привет с .lastIndexOf когда значение не найдено, вернет -1
        int result6 = StringNumberFive.lastIndexOf("здесь");
        System.out.println(result6);


        //Переменная 6/////////////////////////////////////////////////////////////////////////////////
        String StringNumberSix = "Я ХОЧУ БЫТЬ МАЛЕНЬКИИМ";

        //.toLowerCase переводит строку в нижний регистр
        String result7 = StringNumberSix.toLowerCase();
        System.out.println(result7);


        //Переменная 7/////////////////////////////////////////////////////////////////////////////////
        String StringNumberSeven = "я хочу быть большим";

        //.toUpperCase переводит строку в верхний регистр
        String result8 = StringNumberSeven.toUpperCase();
        System.out.println(result8);


        //Переменная 8/////////////////////////////////////////////////////////////////////////////////
        String StringNumberEight = "Суббота день тяжелый";

        //.replace заменяет выбранную часть строки на другое значение
        String result9 = StringNumberEight.replace("Суббота", "Понедельник");
        System.out.println(result9);


        //Переменная 9/////////////////////////////////////////////////////////////////////////////////
        String StringNumberNine = "Суббота день тяжелый";

        //.starts.With проверяет начинается ли начало строки с введенного значения
        //негативный вариант
        boolean result10 = StringNumberNine.startsWith("Понедельник");

        //положительный вариант
        boolean result11 = StringNumberNine.startsWith("Субб");
        System.out.println(result10 + "\n" + result11);


        //Переменная 10/////////////////////////////////////////////////////////////////////////////////
        String StringNumberTen = "Требуется разработчик микросервисов на RUST";

        //.endsWith проверяет совпадает ли последнее значение строки с введеным значением
        boolean result12 = StringNumberTen.endsWith("RUST");
        System.out.println(result12);


        //Переменная 11/////////////////////////////////////////////////////////////////////////////////
        String StringNumberEleven = "(Фантазия кончается) ";

        //.repeat повторяет строку столько раз, сколько указано, число должно быть целым
        String result13 = StringNumberEleven.repeat(5);
        System.out.println(result13);


        //Переменная 12/////////////////////////////////////////////////////////////////////////////////
        String StringNumberTwelve = "The great OF Britain";

        //.contains используяется для проверки,
        // является ли набор введеных символов частью строки

        //пример с "of"
        boolean result14 = StringNumberTwelve.contains("of");

        //пример с "Th"
        boolean result15 = StringNumberTwelve.contains("Th");

        //пример с "great"
        boolean result16 = StringNumberTwelve.contains("great");
        System.out.println(result14 + "\n"+ result15 + "\n" + result16);


        //Переменная 13/////////////////////////////////////////////////////////////////////////////////
        String StringNumberThirteen = "Внутренний покой";

        //.concat используется для объединения строк
        String result17 = StringNumberThirteen.concat(" снился мне иногда....");
        System.out.println(result17);


        //Переменная 14/////////////////////////////////////////////////////////////////////////////////
        String StringNumberFourteen = "   Почти конец        ";

        //.trim убирает пробелы с начала и конца строка
        String result18 = StringNumberFourteen.trim();

        System.out.println("Пример с .trim "+ result18);
        System.out.println("Пример без .trim "+ StringNumberFourteen);


        //Переменная 15/////////////////////////////////////////////////////////////////////////////////
        String StringNumberFifteen = "На этом пожалуй пойдем спать";

        //.equals сравнивает строки и возвращает значение равны ли они
        boolean result19 = StringNumberFifteen.equals("На этом пожалуй пойдем спать");
        boolean result20 = StringNumberFifteen.equals("Good night");

        System.out.println(result19 + "\n" + result20);


    }
}
