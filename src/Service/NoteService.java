package Service;

import models.Note;
import java.util.ArrayList;
import java.util.Iterator;
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
    public void editNote(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID for the note you want to edit: ");
        int noteId = sc.nextInt();

        for (Note note : noteList) {
            if (noteId == note.getId()) {
                System.out.print("Update title:");
                sc.nextLine();
                String title = sc.nextLine();
                System.out.print("Update content:");
                String content = sc.nextLine();
                note.setTitle(title);
                note.setContent(content);
            }
        }
        System.out.println("Note updated successfully");
    }
    public void deleteNote(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID for the note you want to delete: ");
        int noteId = sc.nextInt();
        Iterator<Note> iterator = noteList.iterator();
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (noteId == note.getId()) {
                iterator.remove();  // Safely remove the element
            }
        }
        System.out.println("Note deleted successfully.");
    }

}
