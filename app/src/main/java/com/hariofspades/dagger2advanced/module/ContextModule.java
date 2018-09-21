package com.hariofspades.dagger2advanced.module;


import android.content.Context;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 23/11/17.
 */
@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Named("application_context")
    @Provides
    public Context context(){ return context.getApplicationContext(); }

    @Named("activity_context")
    @Provides
    public Context activityContext(){ return context; }
}
