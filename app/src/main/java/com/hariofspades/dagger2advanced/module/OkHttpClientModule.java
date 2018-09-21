package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import java.io.File;

import javax.inject.Named;
import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by Hari on 23/11/17.
 */
@Module(includes = ContextModule.class)
public class OkHttpClientModule {

    @Provides
    public OkHttpClient okHttpClient(File cacheFile){
        return new OkHttpClient()
                .newBuilder()
                .cache(new Cache(cacheFile, 10 * 1000))
                .build();
    }


    @Provides
    public File file( @Named("application_context") Context context){
        File file = new File(context.getCacheDir(), "HttpCache");
        file.mkdirs();
        return file;
    }
}
