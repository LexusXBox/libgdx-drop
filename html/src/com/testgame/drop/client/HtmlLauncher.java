package com.testgame.drop.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.testgame.drop.Drop;

public class HtmlLauncher extends GwtApplication {
   @Override
   public GwtApplicationConfiguration getConfig () {
      return new GwtApplicationConfiguration(800, 480);
   }

   @Override
   public ApplicationListener createApplicationListener () {
      return new Drop();
   }
}