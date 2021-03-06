package com.startng.newsapp.RoomDb;

import android.os.AsyncTask;
import android.util.Log;

import com.startng.newsapp.NoteModel;

public class UpdateAsyncTask extends AsyncTask<NoteModel, Void, Void> {
    private static final String TAG = "DeleteAsyncTask";
    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteModel... notes) {
        Log.d(TAG, "doInBackgroungThread: " + Thread.currentThread().getName());
        mNoteDao.update(notes);
        return null;
    }
}
