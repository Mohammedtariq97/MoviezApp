package com.example.moviezapp.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00105\u001a\u000206H\u0002J\u0012\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0016\u0010:\u001a\u0002062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u00102\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001f\u00a8\u0006?"}, d2 = {"Lcom/example/moviezapp/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "mainActivityViewModel", "Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "setMainActivityViewModel", "(Lcom/example/moviezapp/viewmodel/MainActivityViewModel;)V", "movieAdapter", "Lcom/example/moviezapp/adapter/MoviesAdapter;", "getMovieAdapter", "()Lcom/example/moviezapp/adapter/MoviesAdapter;", "setMovieAdapter", "(Lcom/example/moviezapp/adapter/MoviesAdapter;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "pastVisibleItems", "getPastVisibleItems", "setPastVisibleItems", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "recyclerViewList", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewList", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerViewList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "bindViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerView", "moviesList", "Ljava/util/ArrayList;", "Lcom/example/moviezapp/model/ResultModel;", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public androidx.recyclerview.widget.RecyclerView recyclerViewList;
    public android.widget.ProgressBar progressBar;
    private int page = 1;
    public com.example.moviezapp.adapter.MoviesAdapter movieAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private int pastVisibleItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    private boolean isScrolling = false;
    public com.example.moviezapp.viewmodel.MainActivityViewModel mainActivityViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviezapp.view.MainActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerViewList() {
        return null;
    }
    
    public final void setRecyclerViewList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviezapp.adapter.MoviesAdapter getMovieAdapter() {
        return null;
    }
    
    public final void setMovieAdapter(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.adapter.MoviesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    public final int getPastVisibleItems() {
        return 0;
    }
    
    public final void setPastVisibleItems(int p0) {
    }
    
    public final int getVisibleItemCount() {
        return 0;
    }
    
    public final void setVisibleItemCount(int p0) {
    }
    
    public final int getTotalItemCount() {
        return 0;
    }
    
    public final void setTotalItemCount(int p0) {
    }
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviezapp.viewmodel.MainActivityViewModel getMainActivityViewModel() {
        return null;
    }
    
    public final void setMainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.viewmodel.MainActivityViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setRecyclerView(java.util.ArrayList<com.example.moviezapp.model.ResultModel> moviesList) {
    }
    
    private final void bindViews() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviezapp/view/MainActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}