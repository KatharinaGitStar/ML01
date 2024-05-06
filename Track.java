package MusicLandscape.entities;

public class Track {
    private String title;
    private int duration;
    private Artist writer = new MusicLandscape.entities.Artist();
    private Artist performer = new MusicLandscape.entities.Artist();
    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year){
        if (((year >= 1900) || (year < 3000)) && (year > 0)) {
            this.year = year;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration >= 0){
            this.duration = duration;
        }
        else {
            this.duration = 0;
        }

    }

    public String getTitle() {
        if (title == null || title.trim().isEmpty()) {
            return this.title = "unknown title";
        } else {
            return this.title = title;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        if (writer != null) {
            this.writer = writer;
        }
    }

    public Artist getPerformer() {
        return performer;
    }

    public void setPerformer(Artist performer) {
        if (performer != null) {
            this.performer = performer;
        }
    }

    public boolean writerIsKnown() {
        //writer != null checks if the writer object is not null.
        //writer.getName() != null checks if the getName() method returns a non-null value
        return writer != null && writer.getName() != null;
    }

    public String getString() {
        String trackInfo = "";

        // Append title or "unknown" if title is null
        if (title != null && !title.isEmpty()) {
            trackInfo += title + " by ";
        } else {
            trackInfo += "unknown by ";
        }

        // Append writer name or "unknown" if writer is null
        if (writer != null && writer.getName() != null && !writer.getName().isEmpty()) {
            trackInfo += writer.getName() + " performed by ";
        } else {
            trackInfo += "unknown performed by ";
        }

        // Append performer name or "unknown" if performer is null
        if (performer != null && performer.getName() != null && !performer.getName().isEmpty()) {
            trackInfo += performer.getName();
        } else {
            trackInfo += "unknown";
        }

        // Format duration as minutes and seconds
        int minutes = duration / 60;
        int seconds = duration % 60;
        String durationString = String.format(" (%02d:%02d)", minutes, seconds);

        // Append duration
        trackInfo += durationString;

        return trackInfo.trim(); // Trim leading/trailing whitespace
    }
}
