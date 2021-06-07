package com.example.moviezapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviezapp/api/APIUserRestClient;", "Landroid/app/Activity;", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "mApiUser", "Lcom/example/moviezapp/api/APIUser;", "getMApiUser", "()Lcom/example/moviezapp/api/APIUser;", "setMApiUser", "(Lcom/example/moviezapp/api/APIUser;)V", "getMovieDescriptionList", "", "movieId", "retrofitEventListener", "Lcom/example/moviezapp/network/RetrofitEventListener;", "getMoviesList", "page", "", "Companion", "app_debug"})
public final class APIUserRestClient extends android.app.Activity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String API_KEY = "0e12101a22c608993caa890e9dabea92";
    @org.jetbrains.annotations.Nullable()
    private com.example.moviezapp.api.APIUser mApiUser;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviezapp.api.APIUserRestClient instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviezapp.api.APIUserRestClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_KEY() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.moviezapp.api.APIUser getMApiUser() {
        return null;
    }
    
    public final void setMApiUser(@org.jetbrains.annotations.Nullable()
    com.example.moviezapp.api.APIUser p0) {
    }
    
    public final void getMoviesList(int page, @org.jetbrains.annotations.NotNull()
    com.example.moviezapp.network.RetrofitEventListener retrofitEventListener) {
    }
    
    public final void getMovieDescriptionList(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    com.example.moviezapp.network.RetrofitEventListener retrofitEventListener) {
    }
    
    public APIUserRestClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviezapp/api/APIUserRestClient$Companion;", "", "()V", "instance", "Lcom/example/moviezapp/api/APIUserRestClient;", "getInstance", "()Lcom/example/moviezapp/api/APIUserRestClient;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviezapp.api.APIUserRestClient getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}