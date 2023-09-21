package practice4;

public class Book {
    private String author;
    private String title;
    private Integer date;
    public Book(String a, String t, Integer d){
        author = a;
        title = t;
        date = d;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public Integer getDate(){
        return date;
    }
    public void SetAuthor(String a){
        author = a;
    }
    public void SetTitle(String t){
        title = t;
    }
    public void SetDate(Integer d){
        date = d;
    }
}
