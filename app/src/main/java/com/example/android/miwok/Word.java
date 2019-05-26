package com.example.android.miwok;

public class Word {
   private String word;
   private String translation;
   private int imagid = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String word, String translation, int imgid) {
        this.word = word;
        this.translation=translation;
        this.imagid=imgid;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }

    public int getImagid() {
        return imagid;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setImagid(int imagid) {
        this.imagid = imagid;
    }
}

/**
 * <?xml version="1.0" encoding="utf-8"?>
 * <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
 *     android:orientation="vertical"
 *     android:layout_width="match_parent"
 *     android:layout_height="match_parent"
 *     android:background="#FFF8E1">
 *
 *
 *     <TextView
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:text="@string/word"
 *         android:paddingTop="16dp"
 *         android:paddingBottom="16dp"
 *         android:paddingLeft="16dp"
 *         android:id="@+id/colorWord"/>
 *
 *     <TextView
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:text="@string/translation"
 *         android:paddingTop="16dp"
 *         android:paddingBottom="16dp"
 *         android:paddingLeft="16dp"
 *         android:id="@+id/colorTranslation"/>
 *
 *
 *
 * </LinearLayout>
 *
 * */