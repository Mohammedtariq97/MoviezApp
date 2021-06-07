package com.example.moviezapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0012R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/example/moviezapp/repository/MoviesRepository;", "", "()V", "favButtonModel", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviezapp/database/Movie;", "getFavButtonModel", "()Landroidx/lifecycle/LiveData;", "setFavButtonModel", "(Landroidx/lifecycle/LiveData;)V", "getMovieDetailFromInternet", "Lcom/example/moviezapp/model/MovieDescriptionModel;", "movieId", "", "getMoviesData", "Ljava/util/ArrayList;", "Lcom/example/moviezapp/model/ResultModel;", "page", "", "gettingDataFromDB", "context", "Landroid/content/Context;", "insertFabButtonInDB", "", "title", "i", "app_debug"})
public final class MoviesRepository {
    @org.jetbrains.annotations.Nullable()
    private static androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> favButtonModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviezapp.repository.MoviesRepository INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> getFavButtonModel() {
        return null;
    }
    
    public final void setFavButtonModel(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> getMoviesData(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviezapp.model.MovieDescriptionModel> getMovieDetailFromInternet(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId) {
        return null;
    }
    
    public final void insertFabButtonInDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int i) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> gettingDataFromDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String movieId) {
        return null;
    }
    
    private MoviesRepository() {
        super();
    }
}