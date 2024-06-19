# Multiloader template for minecraft development
This template simplifies creation of multiloader project files to be used for development of Fabric/Neoforge/Forge mods

## How to use this template
Basically everything should be configurable from `gradle.properties` file, you just need to update basic mod attributes such as mod ID, name, and so on... But the most important change is to change the `root_project` property to match with your project directory as that is used to properly discover subproject directories.
So for example if you are developing project in `CoreLib` directory, you will need to change the property value to `CoreLib`, that is all.

## Access transformers and access wideners
Project sources are remapped using the access wideners. So in case you need to expose some hidden field/method, you need to define accesswidener for it within the `common` module. But if you are developing also for Forge/Neoforge you need to include accesstransformer - which should again be defined in the `common` module in META-INF. No additional setup should be needed both the accesswidener and accesstransformer should be applied automatically for each project, you just need to refresh the gradle project.

## Mixins
Mixins are enabled by default for all mod loaders. Shared mixins should again go into the `common` module and `<modid>.mixins.json` files, loader specific mixins then into subproject directories and mixin config files.

## Removing mod loaders
In case you do not want to support all 3 mod loaders, you can just navigate into `settings.gradle` and remove the `include(subproject)` lines and then delete the related submodules from your project.
