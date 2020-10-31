package com.syamsudin.abstract_factory;

import com.syamsudin.abstract_factory.arena.Arena;
import com.syamsudin.abstract_factory.arena.ArenaEasy;
import com.syamsudin.abstract_factory.level.Level;
import com.syamsudin.abstract_factory.level.LevelEasy;

public class GameFactoryEasy implements GameFactory {
    @Override
    public Level createLevel() {
        return new LevelEasy();
    }

    @Override
    public Arena createArena() {
        return new ArenaEasy();
    }
}
