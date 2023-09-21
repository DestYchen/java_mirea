package practice4;

public class BookTest {
    public static void main(String[] args){
        Book b1 = new Book("Александр Сергеевич Пушкин", "Дубровский", 1833);
        Book b2 = new Book("Виктор Пелевин", "Тайные виды на гору Фудзи",2018);
        System.out.println("Первая книга: " + b1.getAuthor() + " " + b1.getTitle() + " " + b1.getDate());
        System.out.println("Вторая книга: " + b2.getAuthor() + " " + b2.getTitle() + " " + b2.getDate());
        b1.SetAuthor("Братья Стругацкие");
        b1.SetTitle("Пикник на обочине");
        b1.SetDate(1972);
        System.out.println("Первая книга после изменения: " + b1.getAuthor() + " " + b1.getTitle() + " " + b1.getDate());
    }
}
