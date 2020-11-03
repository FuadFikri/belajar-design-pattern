package com.syamsudin.adapter;

public class VideoCatalogAdapter implements CatalogAdapter {

    private Video video;

    public VideoCatalogAdapter(Video video) {
        this.video = video;
    }

    @Override
    public String getCatalogTitle() {
        return video.getTitle() + " by " + video.getAuthor();
    }
}
