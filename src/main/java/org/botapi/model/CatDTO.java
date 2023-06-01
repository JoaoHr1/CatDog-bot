package org.botapi.model;

import com.google.gson.annotations.SerializedName;

public record CatDTO(String id, @SerializedName("url") String catUrl
) {
    @Override
    public String toString() {
        return catUrl;
    }

}