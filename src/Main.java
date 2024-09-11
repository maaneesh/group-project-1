import Service.NoteService;
import models.Note;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NoteService noteService = new NoteService();
        boolean active = true;

        while (active) {

            System.out.println("Welcome to Notes App.");
            System.out.println("-------------------------");
            System.out.println("""
                    ENTER,
                    \t1 : TO ADD NOTE\
                    
                    \t2 : TO VIEW ALL\
                    
                    \t3 : TO EXIT
                    -------------------------""");
            System.out.print("Choose: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    noteService.createNote();
                    break;
                case 2:
                    if (noteService.getNotes().isEmpty()) {
                        System.out.println("There are currently no notes to display.");
                        break;
                    } else {
                        for (Note note : noteService.getNotes()) {
                            System.out.println(note);
                            break;

                        }
                    }
                case 3:
                    System.out.println("Have a Nice Day! \n");
                    active = false;
                    break;

            }


        }
        //creating a note and adding it to noteBook ArrayList

//        Note note1 = new Note( 1, "Note 1", "This is my very first note");
//        noteBook.add(note1);
//        noteBook.add(new Note( 2, "Note 2", "This is my second note"));
//        noteBook.add(new Note( 3, "Note 3", "This is my third note"));
//
//Printing noteslist


//        ;
//        noteService.sizeOfNotebook();
//
//


    }


}