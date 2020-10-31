package com.syamsudin.abstract_factory;

import com.syamsudin.abstract_factory.arena.Arena;
import com.syamsudin.abstract_factory.level.Level;

public interface GameFactory {
    Level createLevel();
    Arena createArena();
}
