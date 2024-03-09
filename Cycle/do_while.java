// Демонстрация работы цикла (do - while)

System.out.println("1. if .. else");
            System.out.println("2. switch .. case");
            System.out.println("3. while");
            System.out.println("4. do-while");
            // считывание значения ввода с терминала (будет подробно рассмотрено позднее)
            choice = (char) System.in.read();
            // объявляем вложенный цикл do-while для исключения из потока ввода символа <Enter>,
            // чтобы исключить повторный вывод меню (при вводe символа пункта меню 1-4 и Enter, в переменную choice
            // последовательно помещается два символа и цикл do-while повторяется дважды)
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            // проверка символа введенного пользователем на соответствие меню
        } while (choice < '1' || choice > '4');
        System.out.println("\n");
        // проверяем совпадение значений переменных с использованием операторов switch ..case
        // и выводим в терминал текстовое сообщение соответствующего совпавшего case
        switch (choice) {
            case '1':
                System.out.println("Вы выбрали 1. if .. else");
                System.out.println("Общая форма оператора if .. else выглядит следующим образом:\n" +
                        "if(условие) оператор1;\nelse оператор2;");
                break;
            case '2':
                System.out.println("Вы выбрали 2. switch .. case");
                System.out.println("Общая форма оператора switch .. case выглядит следующим образом:\n" +
                        "switch (выражение) {\ncase значение1:\nпоследовательность операторов\n" +
                        "break;\ncase значение2:\nпоследовательность операторов\nbreak;\n" +
                        "default:\nстандартная последовательность операторов\n}");
                break;
            case '3':
                System.out.println("Вы выбрали 3. while");
                System.out.println("Общая форма оператора while выглядит следующим образом:\n" +
                        "while(условие) {\nтело цикла\n}");
                break;
            case '4':
                System.out.println("Вы выбрали 4. do-while");
                System.out.println("Общая форма оператора do-while выглядит следующим образом:\n" +
                        "do {\nтело цикла\n} while (условие);");
                break;
        }
    }
}
