package com.syamsudin.template;

public class BlockGame2 extends BlockTemplate {
    @Override
    public String getTitle() {
        return "Block game 2";
    }

    @Override
    public String getEndTitle() {
        return "END block game 2";
    }

    @Override
    public Integer getHeight() {
        return 20;
    }

    @Override
    public Integer getWidth() {
        return 10;
    }

    @Override
    public String getCharacter() {
        return "O";
    }
}
