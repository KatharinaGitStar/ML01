public class Track {
    private String title;
    private int duration;
    private Artist writer;
    private Artist performer;
    private int year;

    public Track(String title, int duration, Artist writer, Artist performer, int year) {
        this.title = title;
        this.duration = duration;
        this.writer = writer;
        this.performer = performer;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        this.writer = writer;
    }

    public Artist getPerformer() {
        return performer;
    }

    public void setPerformer(Artist performer) {
        this.performer = performer;
    }

    public boolean writerIsKnown() {
        return writer != null;
    }

    public String getString() {
        //example implementation, not final version
        return "Title: " + title + ", Duration: " + duration;
    }
}

