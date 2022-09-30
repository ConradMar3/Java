package Book3_page235.Chapter08.ClassesInJAR.ArchivingAPAckage_page360;

// 1. Open a command window.
//     The easiest way to do that is to choose Start&#x27AA; Run, type cmd in the Open text
//     box, and click OK. On Windows 8, right-click the Start button, and then choose
//     Command Prompt on the menu that appears.
//
//     If you have trouble running the jar command in Step 3, you may need to open
//     the command prompt in Administrator mode. To do so, click the Start menu,
//     type cmd, right-click cmd.exe at the top of the Start menu, and choose Run as
//     Administrator.
//
// 2. Use a cd command to navigate to your package root.
//     For example, if your packages are stored in c:\javaclasses, use this
//     command:
//
//     > cd \javaclasses
//
// 3. Use a jar command that specifies the options cf, the name of the jar file,
//     and the path to the class files you want to archive.
//     For example, to create an archive named utils.jar that contains all the class
//     files in the com.lowewriter.util package, use this command:
//

//
// 4. To verify that the jar file was created correctly, use the jar command
//     that specifies the options tf and the name of the jar file.
//     For example, if the jar file is named utils.jar, use this command:
//
//     > jar tf utils.jar
//
//     This lists the contents of the jar file, so you can see what classes were added.
//     Here&rsquo;s some typical output from this command:
//
//     META-INF/
//     META-INF/MANIFEST.MF
//     com/lowewriter/util/Console.class
//
//     As you can see, the utils.jar file contains the Console class, which is in my
//     com.lowewriter.util package.
//
// 5. That&rsquo;s all!
//     You&rsquo;re done. You can leave the jar file where it is, or you can give it to your
//     friends, so they can use the classes it contains.
