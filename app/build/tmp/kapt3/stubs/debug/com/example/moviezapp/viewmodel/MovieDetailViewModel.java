package com.example.moviezapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/moviezapp/viewmodel/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "gdataList", "Ljava/util/ArrayList;", "", "getGdataList", "()Ljava/util/ArrayList;", "setGdataList", "(Ljava/util/ArrayList;)V", "genre", "Landroidx/lifecycle/MutableLiveData;", "getGenre", "()Landroidx/lifecycle/MutableLiveData;", "genreString", "getGenreString", "()Ljava/lang/String;", "setGenreString", "(Ljava/lang/String;)V", "liveDatafavButton", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviezapp/database/Movie;", "getLiveDatafavButton", "()Landroidx/lifecycle/LiveData;", "setLiveDatafavButton", "(Landroidx/lifecycle/LiveData;)V", "movieDetail", "Lcom/example/moviezapp/model/MovieDescriptionModel;", "getMovieDetail", "setMovieDetail", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.LiveData<com.example.moviezapp.model.MovieDescriptionModel> movieDetail;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> genre = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String genreString = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> gdataList;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> liveDatafavButton;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviezapp.model.MovieDescriptionModel> getMovieDetail() {
        return null;
    }
    
    public final void setMovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.moviezapp.model.MovieDescriptionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenreString() {
        return null;
    }
    
    public final void setGenreString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getGdataList() {
        return null;
    }
    
    public final void setGdataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> getLiveDatafavButton() {
        return null;
    }
    
    public final void setLiveDatafavButton(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> p0) {
    }
    
    public MovieDetailViewModel() {
        super();
    }
}