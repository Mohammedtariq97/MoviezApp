package com.example.moviezapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007J\u0018\u0010%\u001a\u0004\u0018\u00010\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\'H\u0002J\b\u0010(\u001a\u00020)H\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lcom/example/moviezapp/viewmodel/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepo", "Lcom/example/moviezapp/repository/MoviesRepository;", "(Lcom/example/moviezapp/repository/MoviesRepository;)V", "gdataList", "Ljava/util/ArrayList;", "", "getGdataList", "()Ljava/util/ArrayList;", "setGdataList", "(Ljava/util/ArrayList;)V", "genre", "Landroidx/lifecycle/MutableLiveData;", "getGenre", "()Landroidx/lifecycle/MutableLiveData;", "genreString", "getGenreString", "()Ljava/lang/String;", "setGenreString", "(Ljava/lang/String;)V", "liveDatafavButton", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviezapp/database/Movie;", "getLiveDatafavButton", "()Landroidx/lifecycle/LiveData;", "setLiveDatafavButton", "(Landroidx/lifecycle/LiveData;)V", "movieDetail", "Lcom/example/moviezapp/model/MovieDescriptionModel;", "getMovieDetail", "setMovieDetail", "(Landroidx/lifecycle/MutableLiveData;)V", "getMovieRepo", "()Lcom/example/moviezapp/repository/MoviesRepository;", "Lkotlinx/coroutines/Job;", "url", "handleMovieDetailResponse", "response", "Lretrofit2/Response;", "redeclareLivedata", "", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.MovieDescriptionModel> movieDetail;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> genre = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String genreString = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> gdataList;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.example.moviezapp.database.Movie> liveDatafavButton;
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviezapp.repository.MoviesRepository movieRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.MovieDescriptionModel> getMovieDetail() {
        return null;
    }
    
    public final void setMovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.MovieDescriptionModel> p0) {
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
    
    private final void redeclareLivedata() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private final com.example.moviezapp.model.MovieDescriptionModel handleMovieDetailResponse(retrofit2.Response<com.example.moviezapp.model.MovieDescriptionModel> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviezapp.repository.MoviesRepository getMovieRepo() {
        return null;
    }
    
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.repository.MoviesRepository movieRepo) {
        super();
    }
}