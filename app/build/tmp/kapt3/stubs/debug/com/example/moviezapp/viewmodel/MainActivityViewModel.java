package com.example.moviezapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepo", "Lcom/example/moviezapp/repository/MoviesRepository;", "(Lcom/example/moviezapp/repository/MoviesRepository;)V", "movieDataListPagination", "Lcom/example/moviezapp/model/BaseModel;", "getMovieDataListPagination", "()Lcom/example/moviezapp/model/BaseModel;", "setMovieDataListPagination", "(Lcom/example/moviezapp/model/BaseModel;)V", "getMovieRepo", "()Lcom/example/moviezapp/repository/MoviesRepository;", "moviesDataList", "Landroidx/lifecycle/MutableLiveData;", "getMoviesDataList", "()Landroidx/lifecycle/MutableLiveData;", "setMoviesDataList", "(Landroidx/lifecycle/MutableLiveData;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "getMovieList", "Lkotlinx/coroutines/Job;", "handleMovieResponse", "response", "Lretrofit2/Response;", "redeclareLivedata", "", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.BaseModel> moviesDataList;
    private int page = 1;
    @org.jetbrains.annotations.Nullable()
    private com.example.moviezapp.model.BaseModel movieDataListPagination;
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviezapp.repository.MoviesRepository movieRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.BaseModel> getMoviesDataList() {
        return null;
    }
    
    public final void setMoviesDataList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.moviezapp.model.BaseModel> p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.moviezapp.model.BaseModel getMovieDataListPagination() {
        return null;
    }
    
    public final void setMovieDataListPagination(@org.jetbrains.annotations.Nullable()
    com.example.moviezapp.model.BaseModel p0) {
    }
    
    private final void redeclareLivedata() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieList() {
        return null;
    }
    
    private final com.example.moviezapp.model.BaseModel handleMovieResponse(retrofit2.Response<com.example.moviezapp.model.BaseModel> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviezapp.repository.MoviesRepository getMovieRepo() {
        return null;
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.repository.MoviesRepository movieRepo) {
        super();
    }
}