package org.botapi.model;

import com.google.gson.annotations.SerializedName;

public record DogDTO(@SerializedName("message") String dogUrl) {
    @Override
    public String toString() {
        return dogUrl;
    }
}
