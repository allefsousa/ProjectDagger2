package com.project.allef.dagger2.contract;

import com.project.allef.dagger2.MainActivity;
import com.project.allef.dagger2.module.Martelos;

import dagger.Component;
import dagger.Module;

@Component (modules = {Martelos.class})
public interface NossoComponent {
    void inject(MainActivity nossaActivity);
}
