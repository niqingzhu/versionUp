package de.idos.updates.demo;


import de.idos.updates.UpdateSystem;
import de.idos.updates.Version;
import de.idos.updates.VersionFinder;
import de.idos.updates.VersionStore;
import de.idos.updates.repository.FilesystemRepository;
import de.idos.updates.store.FilesystemVersionStore;

import java.io.File;

import net.sf.anathema.ApplicationLauncher;

public class DemoBootLoaderTestTwo
{
/*  public static void main(String[] arguments)
    throws Exception
  {
    String mainClass = "de.idos.updates.Demo";
    String mainMethod = "startDemo";
    String applicationName = "updatedemo";

    File userHome = new File(System.getProperty("user.home"));
    File applicationHome = new File(userHome, "." + applicationName);
    File versionStore = new File(applicationHome, "versions");
    VersionStore store = new FilesystemVersionStore(versionStore);

    UpdateSystem updateSystem = new UpdateSystem(store, new FilesystemRepository(new File("./src/main/resources")));
    updateSystem.checkForUpdatesSinceVersion(VersionFinder.BASE_VERSION);
    updateSystem.updateToLatestVersion();
    Version latestVersion = updateSystem.getLatestVersion();

    File versionFolder = new File(versionStore, latestVersion.asString());

    new ApplicationLauncher(versionFolder).launch(mainClass, mainMethod);
  }*/
}