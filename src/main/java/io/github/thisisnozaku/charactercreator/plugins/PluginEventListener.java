package io.github.thisisnozaku.charactercreator.plugins;

/**
 * Created by Damien on 9/17/2016.
 */
public interface PluginEventListener {
    Object postCharacterLoad(Object character);

    Object prePdfExport(Object character);
}
