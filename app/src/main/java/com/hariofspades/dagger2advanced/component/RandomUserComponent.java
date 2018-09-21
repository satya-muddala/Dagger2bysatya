package com.hariofspades.dagger2advanced.component;


import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.model.RandomUsers;

import com.hariofspades.dagger2advanced.module.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by Hari on 23/11/17.
 */

@Component(modules = {RandomUsersModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();
}
