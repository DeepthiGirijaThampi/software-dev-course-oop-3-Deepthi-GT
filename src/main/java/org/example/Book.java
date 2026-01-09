package org.example;

public class Book extends LibraryItem{

    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book: "+getTitle()+" by "+getAuthor()+" ("+getYear()+") - "+pageCount+" pages";
    }

    public void readBook(){

        System.out.println("\n Reading "+getTitle() + " by "+getAuthor());
    }


}
