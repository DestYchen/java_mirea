package Practice13;
public class File_test {
    public static void main(String[] args){
        String task_txt = "C:\\Users\\dimul\\IdeaProjects\\practice\\src\\Practice13\\file_13.txt";
        File task = new File();
        System.out.println("1: Запись в файл");
        task.task_1(task_txt);
        System.out.println("2: Вывод из файла");
        task.task_2(task_txt);
        System.out.println("3: Добавить в файл");
        task.task_3(task_txt);
        System.out.println("Вывод");
        task.task_2(task_txt);
    }
}
