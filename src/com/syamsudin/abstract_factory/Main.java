package com.syamsudin.abstract_factory;

public class Main {
    public static void main(String[] args) {
//      before
//        Game gameMedium = new Game(new LevelMedium(), new ArenaMedium());
//        gameMedium.start();
//
//        Game gameHard = new Game(new LevelHard(), new ArenaHard());
//        gameHard.start();
//    }


//    after using abstract factory
        Game gameEasy = new Game(new GameFactoryEasy());
        gameEasy.start();
    }
}
