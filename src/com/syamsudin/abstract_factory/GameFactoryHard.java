package com.syamsudin.abstract_factory;

import com.syamsudin.abstract_factory.arena.Arena;
import com.syamsudin.abstract_factory.arena.ArenaHard;
import com.syamsudin.abstract_factory.level.Level;
import com.syamsudin.abstract_factory.level.LevelHard;

public class GameFactoryHard implements GameFactory {
    @Override
    public Level createLevel() {
        return new LevelHard();
    }

    @Override
    public Arena createArena() {
        return new ArenaHard();
    }
}
