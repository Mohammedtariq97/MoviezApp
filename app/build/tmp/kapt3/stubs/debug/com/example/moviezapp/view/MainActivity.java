package com.example.moviezapp.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010\u001d\u001a\u00020?H\u0002J\u0012\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020?H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001a\u0010;\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&\u00a8\u0006E"}, d2 = {"Lcom/example/moviezapp/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/moviezapp/adapter/MoviesAdapter;", "getAdapter", "()Lcom/example/moviezapp/adapter/MoviesAdapter;", "setAdapter", "(Lcom/example/moviezapp/adapter/MoviesAdapter;)V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "mainActivityViewModel", "Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/example/moviezapp/viewmodel/MainActivityViewModel;", "setMainActivityViewModel", "(Lcom/example/moviezapp/viewmodel/MainActivityViewModel;)V", "movieList", "Ljava/util/ArrayList;", "Lcom/example/moviezapp/model/ResultModel;", "getMovieList", "()Ljava/util/ArrayList;", "setMovieList", "(Ljava/util/ArrayList;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "pastVisibleItems", "getPastVisibleItems", "setPastVisibleItems", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "recyclerViewList", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewList", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerViewList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "bindViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerView", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public androidx.recyclerview.widget.RecyclerView recyclerViewList;
    public android.widget.ProgressBar progressBar;
    private int page = 1;
    public androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.moviezapp.model.ResultModel> movieList;
    private int pastVisibleItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    private boolean isScrolling = false;
    public com.example.moviezapp.viewmodel.MainActivityViewModel mainActivityViewModel;
    public com.example.moviezapp.adapter.MoviesAdapter adapter;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
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
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.moviezapp.model.ResultModel> getMovieList() {
        return null;
    }
    
    public final void setMovieList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.moviezapp.model.ResultModel> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviezapp.adapter.MoviesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.moviezapp.adapter.MoviesAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getMovieList() {
    }
    
    private final void setRecyclerView() {
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