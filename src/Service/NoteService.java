package Service;

import models.Note;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteService {


    private final ArrayList<Note> noteList = new ArrayList<>();


    public List<Note> getNotes(){
        return noteList;
    }

    public void sizeOfNotebook() {
        System.out.println(noteList.size());
    }

    public void createNote(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title:");
        String title = sc.nextLine();
        System.out.print("Enter content:");
        String content = sc.nextLine();
        noteList.add(new Note( title, content));
        System.out.println("Note created successfully");

    }



//    public void print(){
//        String note = "- ".repeat(15);
//        note += "\n Note: ";
//        note += this.id;
//        note += "\n Title: " + this.title;
//        note += "\n Content: " + this.content+"\n";
//        System.out.println(note);
//
////        System.out.println("id: "+id+ " title: " +title+" content: "+content);
//    }
}
