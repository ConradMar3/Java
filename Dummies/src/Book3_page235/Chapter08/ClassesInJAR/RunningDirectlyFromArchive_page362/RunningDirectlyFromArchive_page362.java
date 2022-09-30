package Book3_page235.Chapter08.ClassesInJAR.RunningDirectlyFromArchive_page362;

/*
With just a little work, you can set up an archive so that a Java program can be run
directly from it. All you have to do is create a manifest file before you create the
archive. Then, when you run the jar utility to create the archive, you include the
manifest file on the jar command line.

A manifest file is a simple text file that contains information about the files in the
archive. Although it can contain many lines of information, it needs just one line
to make an executable jar file:

 > Main-Class: ClassName

The class name is the fully qualified name of the class that contains the main
method that is executed to start the application. It isn’t required, but it’s typical
to use the extension .mf for manifest files.

For example, suppose you have an application whose main class is GuessingGame,
and all the class files for the application are in the package com.lowewriter.game.
First, create a manifest file named game.mf in the com\lowewriter\game direc-
tory. This file contains the following line:

 > Main-Class: com.lowewriter.game.GuessingGame

Then run the jar command with the options cfm, the name of the archive to
create, the name of the manifest file, and the path for the class files. Here’s an
example:

 > jar cfm game.jar com\lowewriter\game\game.mf com\lowewriter\game\*.class

Now you can run the application directly from a command prompt by using the
java command with the -jar switch and the name of the archive file. Here’s an
example:

 > java -jar game.jar

This command starts the JRE and executes the main method of the class specified
by the manifest file in the game.jar archive file.

If your operating system is configured properly, you can also run the application
by double-clicking an icon for the jar file.
 */
