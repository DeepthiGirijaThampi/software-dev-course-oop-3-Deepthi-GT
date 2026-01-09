package org.example;

public class Album extends LibraryItem{

    protected int trackCount;

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Album: "+getTitle()+" by "+getAuthor()+" ("+getYear()+") - "+trackCount+" tracks";
    }
}
