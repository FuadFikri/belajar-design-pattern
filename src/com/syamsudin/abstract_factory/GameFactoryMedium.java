package com.syamsudin.abstract_factory;

import com.syamsudin.abstract_factory.arena.Arena;
import com.syamsudin.abstract_factory.arena.ArenaMedium;
import com.syamsudin.abstract_factory.level.Level;
import com.syamsudin.abstract_factory.level.LevelMedium;

public class GameFactoryMedium implements GameFactory {
    @Override
    public Level createLevel() {
        return new LevelMedium();
    }

    @Override
    public Arena createArena() {
        return new ArenaMedium();
    }
}
