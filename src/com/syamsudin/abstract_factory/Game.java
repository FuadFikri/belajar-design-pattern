package com.syamsudin.abstract_factory;

import com.syamsudin.abstract_factory.arena.Arena;
import com.syamsudin.abstract_factory.level.Level;

public class Game {
    private Level level;
    private Arena arena;


    // before
//    public Game(Level level, Arena arena) {
//        this.level = level;
//        this.arena = arena;
//    }


    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.arena = gameFactory.createArena();
    }

    public void start(){
        System.out.println("game started");
        this.arena.start();
        this.level.start();
    }
}
