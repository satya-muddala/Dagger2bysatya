package com.hariofspades.dagger2advanced.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hari on 23/11/17.
 */
@Module(includes = OkHttpClientModule.class)
public class RandomUsersModule {

    @Provides
    public RandomUsersApi randomUsersApi(Retrofit retrofit){
        return retrofit.create(RandomUsersApi.class);
    }


    @Provides
    public Retrofit retrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://randomuser.me/")
                .build();
    }



    @Provides
    public GsonConverterFactory gsonConverterFactory(){
        return GsonConverterFactory.create(new GsonBuilder().create());
    }

}
