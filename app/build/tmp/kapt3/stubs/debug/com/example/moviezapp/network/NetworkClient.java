package com.example.moviezapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/moviezapp/network/NetworkClient;", "", "()V", "BASE_URL", "", "TIMEOUT", "", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "retrofitClient", "getRetrofitClient", "app_debug"})
public final class NetworkClient {
    private static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    private static final int TIMEOUT = 10;
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviezapp.network.NetworkClient INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.Nullable()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofitClient() {
        return null;
    }
    
    private NetworkClient() {
        super();
    }
}