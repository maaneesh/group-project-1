
import Service.NoteService;
import models.Note;

import java.util.Scanner;


public class Main {
    private static volatile boolean userResponded = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Notes App.");

        NoteService noteService = new NoteService();
        boolean active = true;
        new Thread(() -> {
            try {
                Thread.sleep(10000);
                if (!userResponded) {
                    System.out.println("\nNo response from user... terminating program.");
                    System.exit(0);
                }
            } catch (InterruptedException exception) {
                System.out.println("\nTermination thread interrupted.");
            }
        }).start();

        while (active) {

            System.out.println("-------------------------");
            System.out.println("""
                    \tENTER,
                    \t1 : TO ADD NOTE\
                    
                    \t2 : TO VIEW ALL\
                    
                    \t3 : TO EDIT A NOTE\
                    
                    \t4 : TO DELETE A NOTE\
                    
                    \t5 : TO EXIT
                    -------------------------""");
            System.out.print("Please select an option: ");
            int option = sc.nextInt();
            userResponded = true;


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
                        }
                        break;
                    }
                case 3:
                    noteService.editNote();
                    break;
                case 4:
                    noteService.deleteNote();
                    break;
                case 5:
                    System.out.println("Have a Nice Day! \n");
                    active = false;
                    break;

            }

        }

    }

}