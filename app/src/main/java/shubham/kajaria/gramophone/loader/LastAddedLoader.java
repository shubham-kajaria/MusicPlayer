package shubham.kajaria.gramophone.loader;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.annotation.NonNull;

import shubham.kajaria.gramophone.model.Song;
import shubham.kajaria.gramophone.util.PreferenceUtil;

import java.util.ArrayList;

public class LastAddedLoader {

    @NonNull
    public static ArrayList<Song> getLastAddedSongs(@NonNull Context context) {
        return SongLoader.getSongs(makeLastAddedCursor(context));
    }

    public static Cursor makeLastAddedCursor(@NonNull final Context context) {
        long cutoff = PreferenceUtil.getInstance(context).getLastAddedCutoff();

        return SongLoader.makeSongCursor(
                context,
                MediaStore.Audio.Media.DATE_ADDED + ">?",
                new String[]{String.valueOf(cutoff)},
                MediaStore.Audio.Media.DATE_ADDED + " DESC");
    }
}
