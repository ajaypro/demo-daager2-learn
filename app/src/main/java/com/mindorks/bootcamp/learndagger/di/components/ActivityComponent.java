package com.mindorks.bootcamp.learndagger.di.components;

import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;


import dagger.Component;

/**
 * Created by Ajay Deepak on 22-08-2019, 17:50
 */

@ActivityScope // hypothetical scope which will have all activity related components
@Component(dependencies = {ApplicationComponent.class} ,modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
