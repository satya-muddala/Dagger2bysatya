package com.hariofspades.dagger2advanced.MainActivityFeature;

import com.hariofspades.dagger2advanced.MainActivity;
import com.hariofspades.dagger2advanced.adapter.RandomUserAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private final MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @MainActivityScope
    public RandomUserAdapter randomUserAdapter(){
        return new RandomUserAdapter(mainActivity);
    }
}
