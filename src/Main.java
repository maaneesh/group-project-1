import models.Note;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Note> noteBook = new ArrayList<>();
        //creating a note and adding it to noteBook ArrayList

        Note note1 = new Note( 1, "Note 1", "This is my very first note");
        noteBook.add(note1);
        noteBook.add(new Note( 2, "Note 2", "This is my second note"));
        noteBook.add(new Note( 3, "Note 3", "This is my third note"));
//Printing noteslist
        for (Note note : noteBook) {
            note.print();

        }

    }



}