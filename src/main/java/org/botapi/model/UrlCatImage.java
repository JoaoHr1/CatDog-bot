package org.botapi.model;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class UrlCatImage implements Comparable<UrlCatImage>{

    private String id;

    @SerializedName("url")
    private String catUrl;

    @Override
    public String toString() {
        return catUrl;
    }

    @Override
    public int compareTo(@NotNull UrlCatImage o) {
        return 0;
    }

    public UrlCatImage(String catUrl, String id) {
        this.catUrl = catUrl;
        this.id = id;
    }

    public UrlCatImage(String catUrl) {
        this.catUrl = catUrl;
    }


    public UrlCatImage() {

    }

    public String getCatUrl() {
        return catUrl;
    }

    public String getId() {
        return id;
    }

    public void setCatUrl(String catUrl) {
        this.catUrl = catUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

}
