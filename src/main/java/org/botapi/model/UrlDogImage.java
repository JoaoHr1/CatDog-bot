package org.botapi.model;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class UrlDogImage implements Comparable<UrlDogImage> {

    @SerializedName("message")
    private String dogUrl;


    @Override
    public String toString() {
        return dogUrl;
    }

    @Override
    public int compareTo(@NotNull UrlDogImage o) {
        return 0;
    }
}
