package com.syamsudin.template;

public class BlockGame extends BlockTemplate {
    @Override
    public String getTitle() {
        return "Block game 1";
    }

    @Override
    public String getEndTitle() {
        return "finish block game 1";
    }

    @Override
    public Integer getHeight() {
        return 10;
    }

    @Override
    public Integer getWidth() {
        return 10;
    }

    @Override
    public String getCharacter() {
        return "X";
    }
}
