package gb_lessons.lections;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import first_pj.main;

public class N_2_api {
    public static void main(String[] args) throws SecurityException, IOException {
      Logger logger = Logger.getLogger(N_2_api.class.getName());
      FileHandler fh = new FileHandler("log.txt");

        /*API- Application programming interface 
         *  Возможности языка платформы java для удоюного взаимодействия с языком
         */
        /*String str = "";
        for (int i = 0; i<1000000;i++){
            str += "+";
            Долгое время выполнения программы
        }*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<100;i++){
            sb.append("+");
            /*Ускорение в несколько тысяч раз 
             * API- StringBuilder:
             *  - concat() - объединение строк
             *  - valueOf() - преобразует Object в строковое представление
             *  - join() - обединяет набор строк в одну с учетом разделения
             *  - charAT() - получение символа по индексу
             *  - indexOf() - первый индекс вхождения подстроки
             *  - lastIndexOf() - последний индекс входения подстроки
             *  - startsWith()/enddsWith() - определяет, начинается/заканчивается ли строка с подстроки
             *  - replace() - замена одной подстроки на другую
             * API - String:
             *  - trim() - удаляет начальные и конечные пробелы
             *  - substring() - возвращает подстроку
             *  - toLowerCase()/toUpperCase - верхний/нижний регистр
             *  - compareTo() - сравнение 2 строк
             *  - equals() - сравнение строки с учетом регистра
             *  - equalsIgnoreCase() - сранивает строки без учета регистра
             *  - regionMatches() - сравнивает подстроки в строках
            */
            //String - много изменений
            //StringBuilder - много преоразований
            /* 
             * Работа с файлами
             * File <name> = new File(<full path to the file>)
             */
            
             /*try {
                Код в котором может быть ошибак
             } catch (Exection e){
                Обработка если ошибка случилась
             } 
             finally {
                Код, который выполниться в любом случае
             }
              */
              try{
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file.txt");
                File file = new File(pathFile);
                if (file.createNewFile()){
                    System.out.println("File created");
                }
                else {
                    System.out.println("File is existing");
                }
              } catch(Exception e){
                System.out.println("Catch");
              }
              finally{
                System.out.println("Finally");
              }
              /*Работа с файлами:
               *  - isHidden() - возвращает истину если каталог или файл скрыты
               *  - length() - возвращает размер в байтах
               *  - lastModified() - время последнего изменения
               *  - list() - возвращает массив файлов и подкаталогов которые находятся в каталоге
               *  - listFiles() - возвращает массив файлов и подкатологов, которые находятся в определенном каталоге
               *  - mkdir() - создает новый каталог
               *  - renameTo(File dest) - переиминовывает фали или католог
               */

               /*Логирование
                * Logger logger = Logger.getLogger()

                Урови важности:
                INFO, DEBUG,ERROR,WARNING

                Вывод
                ConsoleHandler info = new ConsoleHandler();
                log.addHandler(info);
                */
                
                //ConsoleHandler ch = new ConsoleHandler();
              

                //logger.addHandler(ch);

                //ch.setFormatter(sFormat);

                logger.addHandler(fh);
                SimpleFormatter sFormat = new SimpleFormatter();
                fh.setFormatter(sFormat);
                logger.log(Level.WARNING, "test logging 1");
                logger.info("Test logging 2");
                fh.close();


        
        }


    }
    
}
