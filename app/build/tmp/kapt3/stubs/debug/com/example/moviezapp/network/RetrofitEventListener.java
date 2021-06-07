package com.example.moviezapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J \u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\n"}, d2 = {"Lcom/example/moviezapp/network/RetrofitEventListener;", "", "onError", "", "call", "Lretrofit2/Call;", "t", "", "onSuccess", "response", "app_debug"})
public abstract interface RetrofitEventListener {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
    retrofit2.Call<?> call, @org.jetbrains.annotations.Nullable()
    java.lang.Object response);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    retrofit2.Call<?> call, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t);
}