package com.linkshortener;

public class URLMapping {
    private String longURL;
    private String shortURL;

    public URLMapping(String longURL, String shortURL) {
        this.longURL = longURL;
        this.shortURL = shortURL;
    }

    public String getLongURL() {
        return longURL;
    }

    public String getShortURL() {
        return shortURL;
    }
}
