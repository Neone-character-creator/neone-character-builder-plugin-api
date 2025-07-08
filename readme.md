### NEOne Character Creator Plugin Api
This project is the API for game plugins for the NEOne Character Creator.

To create a plugin, provide a class that extends GamePlugin. This lets the OSGI framework know that your plugin is a game plugin.

In addition, you must provide either a plugin.json or plugin.xml that describes the plugin metadata, such as the information to identify the plugin and the paths to resources contained within the plugin.

This repository contains example json and xml files you can replace with the information for the plugin.

    {
    "description": {
      "creator": "Your name here",
      "game": "The name of the game system here",
      "version": "Plugin version here"
    },
    "resources" : {
      "character-view" : "path/to/character/sheet.html",
      "description-view" : "path/to/plugin/descriptio/page.html",
      "pdf" : "path/to/character/sheet/form.pdf"
    }
    }

The description element identifies the plugin.

Resources indicates paths to the various resource files inside the plugin bundle.
"character-view" is the html file first displayed when creating a new character or loading an existing one.
"description-view" contains the html of plugin information to display to the user.
"pdf" is the form pdf that will be filled when exporting.

#### Publishing to maven local
To make artifacts available to the NEOne Character Creator, you can publish your plugin to the local maven repository by running:

```bash
./gradlew publishToMavenLocal
```

Now the project will be able to find your plugin in the local maven repository.
