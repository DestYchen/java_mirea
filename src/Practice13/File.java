package Practice13;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File {
    public void task_1(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введение текст: ");
        String text = sc.nextLine();
        try(FileWriter writer = new FileWriter(name, false)){
            writer.append(text);
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void task_2(String name){
        try(FileReader reader = new FileReader(name)){
            int a;
            while((a = reader.read()) != -1){
                System.out.print((char)a);
            }
            System.out.println();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void task_3(String name){
        try(FileWriter writer = new FileWriter(name, true)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = sc.nextLine();
            writer.append('\n');
            writer.append(text);
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
