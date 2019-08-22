package com.mindorks.bootcamp.learndagger.di.components;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ajay Deepak on 22-08-2019, 17:08
 *
 * Component will take modules that it will make use to build dagger component
 * Marked with singleton as we are providing networkservice and databaseservice or any other classes as a
 * singleton only. Also application component will only take singleton scope
 */

@Singleton
@Component(modules = {ApplicationModule.class})
 public interface ApplicationComponent {

    void inject(MyApplication application);

    NetworkService getNetworkService();

    DatabaseService getDatabaseService();
}
