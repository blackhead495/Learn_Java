//  Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//  Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package HomeWorks.HomeWork2;

public class H21_SQL_Request {
    public static void main(String[] args) {

        String enterString = "select * from students where ";
        StringBuilder strResult = new StringBuilder();
        String inputStr = "\"name\" : \"Ivanov\",\"country\" : \"Russia\",\"city\" : \"Moscow\",\"age\" : \"null\"}";
        String newStr = inputStr.replace("\"", "")
                .replace("{", "")
                .replace("}", "");
        String[] st = newStr.split(",");

        for (String el : st){
            if (!el.contains("null")) {
                strResult.append(enterString + el + "\n");
            }
        }
        System.out.println(strResult);
    }
}
