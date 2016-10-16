package io.github.thisisnozaku.charactercreator.plugins;

import org.apache.felix.scr.annotations.Component;

import java.util.Optional;

/**
 * Marker class to tell the OSGi framework that the containing bundle is a game plugin.
 *
 * <p>
 * Created by Damien on 11/22/2015.
 */
@Component(componentAbstract = true)
public abstract class GamePlugin<T extends Character> {

}
