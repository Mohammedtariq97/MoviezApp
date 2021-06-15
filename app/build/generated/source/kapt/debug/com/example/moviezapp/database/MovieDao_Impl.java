package com.example.moviezapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movieFavourite` (`movie_id`,`movie_name`,`isFavourite`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getMovieId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMovieId());
        }
        if (value.getMovieName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMovieName());
        }
        stmt.bindLong(3, value.getFavourite());
      }
    };
  }

  @Override
  public void insert(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Movie> getMovie(final String movieId) {
    final String _sql = "SELECT * from movieFavourite WHERE movie_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (movieId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, movieId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"movieFavourite"}, false, new Callable<Movie>() {
      @Override
      public Movie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfMovieName = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_name");
          final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
          final Movie _result;
          if(_cursor.moveToFirst()) {
            _result = new Movie();
            final String _tmpMovieId;
            if (_cursor.isNull(_cursorIndexOfMovieId)) {
              _tmpMovieId = null;
            } else {
              _tmpMovieId = _cursor.getString(_cursorIndexOfMovieId);
            }
            _result.setMovieId(_tmpMovieId);
            final String _tmpMovieName;
            if (_cursor.isNull(_cursorIndexOfMovieName)) {
              _tmpMovieName = null;
            } else {
              _tmpMovieName = _cursor.getString(_cursorIndexOfMovieName);
            }
            _result.setMovieName(_tmpMovieName);
            final int _tmpFavourite;
            _tmpFavourite = _cursor.getInt(_cursorIndexOfFavourite);
            _result.setFavourite(_tmpFavourite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
