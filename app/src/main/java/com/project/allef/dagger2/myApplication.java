package com.project.allef.dagger2;

import android.app.Application;

import com.project.allef.dagger2.contract.DaggerNossoComponent;
import com.project.allef.dagger2.contract.NossoComponent;
import com.project.allef.dagger2.module.Martelos;

public class myApplication extends Application {
    private static NossoComponent component;



    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger(){
        component = DaggerNossoComponent.builder()
                .martelos(new Martelos())
                .build();

    }
    public static NossoComponent getComponent() {
        return component;
    }

}
