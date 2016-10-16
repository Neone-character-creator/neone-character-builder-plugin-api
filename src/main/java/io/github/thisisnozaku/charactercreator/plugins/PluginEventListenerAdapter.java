package io.github.thisisnozaku.charactercreator.plugins;

/**
 * Provides hooks into plugin events, allowing a plugin to provide special
 * Created by Damien on 9/17/2016.
 */
public class PluginEventListenerAdapter implements PluginEventListener {
    /**
     * Called after loading a serialized character that is meant to be returned as a response to a json request.
     * @param character
     * @return
     */
    @Override
    public Object postCharacterLoad(Object character){
        return character;
    }

    /**
     * Called before a character is to be exported to a pdf.
     * @param character
     * @return
     */
    @Override
    public Object prePdfExport(Object character){
        return character;
    }
}
