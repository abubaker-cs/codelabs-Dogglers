package com.example.dogglers.adapter;

import java.lang.System;

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/dogglers/adapter/DogCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/dogglers/adapter/DogCardAdapter$DogCardViewHolder;", "context", "Landroid/content/Context;", "layout", "", "(Landroid/content/Context;I)V", "dataList", "", "Lcom/example/dogglers/model/Dog;", "getDataList", "()Ljava/util/List;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DogCardViewHolder", "app_debug"})
public final class DogCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.dogglers.adapter.DogCardAdapter.DogCardViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.dogglers.model.Dog> dataList = null;
    private final android.content.Context context = null;
    private final int layout = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.dogglers.model.Dog> getDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.dogglers.adapter.DogCardAdapter.DogCardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.dogglers.adapter.DogCardAdapter.DogCardViewHolder holder, int position) {
    }
    
    public DogCardAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int layout) {
        super();
    }
    
    /**
     * Initialize view elements
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/dogglers/adapter/DogCardAdapter$DogCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "dogAge", "Landroid/widget/TextView;", "getDogAge", "()Landroid/widget/TextView;", "dogHobby", "getDogHobby", "dogImageView", "Landroid/widget/ImageView;", "getDogImageView", "()Landroid/widget/ImageView;", "dogName", "getDogName", "app_debug"})
    public static final class DogCardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private final android.widget.ImageView dogImageView = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView dogName = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView dogAge = null;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView dogHobby = null;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getDogImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getDogName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getDogAge() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getDogHobby() {
            return null;
        }
        
        public DogCardViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
            super(null);
        }
    }
}