package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Note {
    private int id;
    private String title;
    private String content;
    private ArrayList<Note> noteBook = new ArrayList<>();





    public Note(int id, String title, String content) {
        this.id =id;
        this.title = title;
        this.content = content;
    }

    public void createNote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();

        System.out.println("Enter title:");
        String title = sc.nextLine();

        System.out.println("Enter content:");
        String content = sc.nextLine();
        Note note = new Note(id, title, content);

    }
    public void print(){
        String note = "- ".repeat(15);
        note += "\n Note: ";
        note += this.id;
        note += "\n Title: " + this.title;
        note += "\n Content: " + this.content+"\n";
        System.out.println(note);

//        System.out.println("id: "+id+ " title: " +title+" content: "+content);
    }
}
