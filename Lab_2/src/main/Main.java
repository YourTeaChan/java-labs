package main;

import library.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            Book [] arrayOfBooks = new Book[5];
            arrayOfBooks[0] = new Book(25103,"Blood of Elves","Andrzej Sapkowski","Rivia",2008,320,20);
            arrayOfBooks[1] = new Book(25107,"The Lady of the Lake","Andrzej Sapkowski","Wild Hunt",2017,531,24.3);
            arrayOfBooks[2] = new Book(25108,"Season of Storms","Andrzej Sapkowski","Wild Hunt",2018,384,27.8);
            arrayOfBooks[3] = new Book(15801,"A Study in Scarlet","Arthur Conan Doyle","Sherlocked",2001,411,26.99);
            arrayOfBooks[4] = new Book(15803,"The Hound of the Baskervilles","Arthur Conan Doyle","Sherlocked",2003,480,29);

            printData(arrayOfBooks);

            listOfBooksAuthor(arrayOfBooks);
            listOfBooksEdition(arrayOfBooks);
            listOfBooksPublishedAfterThisYear(arrayOfBooks);
        }
        catch (Exception message) {
            System.out.println("\nException " + message);
        }
    }

    public static void listOfBooksAuthor(Book [] array) throws Exception {
        System.out.print("\nEnter the author of the book: ");
        Scanner in = new Scanner(System.in);
        String author = in.nextLine();
        if(author.isEmpty()){
            throw new Exception("Empty line of author!");
        }

        int k = 0;
        for (Book book : array) {
            if (author.equals(book.getAuthor())) {
                System.out.println(book);
                k++;
            }
        }
        if(k == 0){
            System.out.println("There is no book by this author.");
        }
    }

    public static void listOfBooksEdition(Book [] array) throws Exception {
        System.out.print("\nEnter the edition of the book: ");
        Scanner in = new Scanner(System.in);
        String edition = in.nextLine();
        if(edition.isEmpty()){
            throw new Exception("Empty line of edition!");
        }

        int k = 0;
        for (Book book : array) {
            if (edition.equals(book.getEdition())) {
                System.out.println(book);
                k++;
            }
        }
        if(k == 0){
            System.out.println("There is no book in this edition.");
        }
    }

    public static void listOfBooksPublishedAfterThisYear(Book [] array) throws Exception{
        System.out.print("\nEnter a year after which the books were published: ");
        Scanner in = new Scanner(System.in);
        int year  = in.nextInt();
        if(year <= 0){
            throw new Exception("Incorrect value of year!");
        }

        int k = 0;
        for (Book book : array) {
            if (book.getYearOfPublication() > year) {
                System.out.println(book);
                k++;
            }
        }
        if(k == 0){
            System.out.println("There is no book published after this year.");
        }
    }

    public static void printData(Book [] array){
        for (Book book : array) {
            System.out.println(book);
        }
    }
}