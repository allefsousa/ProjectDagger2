package com.project.allef.dagger2.module;

import com.project.allef.dagger2.data.Martelo;

import dagger.Module;
import dagger.Provides;

@Module
public class Martelos {
    @Provides
    public Martelo providesMartelo() {
        return new Martelo();
    }

//    @Provides
//    public MarteloMedio providesMarteloMedio() {
//        return new MarteloMedio();
//    }
//
//    @Provides
//    public MarteloGrande providesMarteloGrande() {
//        return new MarteloGrande();
//    }
}
