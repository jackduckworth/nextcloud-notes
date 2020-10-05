package it.niedermann.owncloud.notes.persistence.entity;

import androidx.room.Entity;
import androidx.room.Ignore;

import it.niedermann.owncloud.notes.widget.AbstractWidgetData;

@Entity()
public class WidgetSingleNoteEntity extends AbstractWidgetData {
    private long noteId;

    public WidgetSingleNoteEntity() {

    }

    @Ignore
    public WidgetSingleNoteEntity(int id, long accountId, long noteId, int modeId) {
        super(id, accountId, modeId);
        setNoteId(noteId);
    }

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }
}