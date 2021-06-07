package com.example.moviezapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\f\u001a\u00020\rR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "moviesDataList", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/example/moviezapp/model/ResultModel;", "getMoviesDataList", "()Landroidx/lifecycle/LiveData;", "setMoviesDataList", "(Landroidx/lifecycle/LiveData;)V", "getMovieList", "page", "", "gettingMoreDataFromInternet", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> moviesDataList;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> getMoviesDataList() {
        return null;
    }
    
    public final void setMoviesDataList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> getMovieList(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.moviezapp.model.ResultModel>> gettingMoreDataFromInternet(int page) {
        return null;
    }
    
    public MainActivityViewModel() {
        super();
    }
}