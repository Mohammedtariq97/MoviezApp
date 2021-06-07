package com.example.moviezapp.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.moviezapp.database.Movie.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviezapp/database/MoviesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/example/moviezapp/database/MovieDao;", "Companion", "app_debug"})
public abstract class MoviesDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.moviezapp.database.MoviesDatabase movieDbInstance;
    private static final int NUMBER_OF_THREADS = 2;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ExecutorService databaseWriteExecutor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviezapp.database.MoviesDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviezapp.database.MovieDao movieDao();
    
    public MoviesDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/moviezapp/database/MoviesDatabase$Companion;", "", "()V", "NUMBER_OF_THREADS", "", "databaseWriteExecutor", "Ljava/util/concurrent/ExecutorService;", "getDatabaseWriteExecutor", "()Ljava/util/concurrent/ExecutorService;", "movieDbInstance", "Lcom/example/moviezapp/database/MoviesDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.concurrent.ExecutorService getDatabaseWriteExecutor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviezapp.database.MoviesDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}