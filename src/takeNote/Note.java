package takeNote;

import java.awt.*;

public class Note { // this class will keep the properties of note object.
    public String noteContent;
    public String noteTitle;
    public Color noteColor;

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public Color getNoteColor() {
        return noteColor;
    }

    public void setNoteColor(Color noteColor) {
        this.noteColor = noteColor;
    }
}
