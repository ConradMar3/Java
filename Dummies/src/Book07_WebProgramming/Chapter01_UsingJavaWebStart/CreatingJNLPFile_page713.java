/*
To deploy a Java application via Java Web Start, you must create a JNLP file that
contains the details needed to locate and run the application. The JNLP file is a
small XML file that contains information such as the name of the application, a
URL that points to the application’s JAR file, the vendor who created the application,
the Java version the application requires, and a URL that can be used to
download the Java runtime in case it isn’t already installed on the user’s computer.

! - JNLP stands for 'Java Network Launch Protocol', but that won’t be on the test.

If you aren’t already familiar with the basics of XML, you can learn about XML’s
syntax requirements in Book 8, Chapter 5.

Listing 1-2 shows a JNLP file named ClickMe.jnlp that can be used to run the
ClickMe application from the website www.lowewriter.com. for the ClickMe
application:
 */

// The JNLP File for the ClickMe Application:
<?xml version="1.0"encoding="UTF-8"?>
<jnlp spec="1.0+"
        codebase="http://www.lowewriter.com/ClickMe" ->3
        href="ClickMe.jnlp">                         ->4
            <information>
                <title>ClickMe</title>               ->6
                <vendor>LoweWriter</vendor>          ->7
                <offline-allowed/>
                </information>
        <resources>
            <!--Application Resources-->
            <j2se version="1.6+"
                href="http://www.oracle.com/technetwork/java/javase/downloads"/>
            <jar href="ClickMe.jar"
            main="true"/>                           ->14
        </resources>
    <application-desc main-class="ClickMe">         ->17
    </application-desc>
    <update check="background"/>
</jnlp>

/*
Most of the lines in this JNLP file are written the same for all Java Web Start
applications. The lines that you need to change for your particular Java Web Start
application are described in the following paragraphs:

→3  The codebase attribute should be changed to reflect the root location
    where your application is saved on your website. In this case, the
    application’s files are stored at http://www.lowewriter.com/ClickMe.
    Although the codebase attribute is not absolutely required, using it can
    simplify the rest of the JNLP file because URLs that appear elsewhere in
    the JNLP file are relative to the codebase path. You’ll see what I mean in
    the next paragraph.

→4  The href attribute indicates the path to the jnlp file. Note that in this
    example, I specified just the name of the file rather than the complete
    path. That’s because the path given here is relative to the path given in the
    codebase attribute. Because the jnlp file is in the http://lowewriter.
    com/ClickMe folder, specifying just the filename is sufficient here to
    identify the jnlp file.

→6  The <title> element provides the name of the application — in this
    case, “ClickMe.”

→7  The <vendor> attribute provides the name of the application’s vendor —
    in this case, “LoweWriter.”

→14 The href attribute of the jar element provides the location of the
    application’s JAR file. Again, because this file resides in the folder
    indicated by the codebase, I specified just the filename here.

→17 The main-class attribute of the application-desc element indicates
    the name of the application’s main class, which contains the main
    method that is called to start the application. In this case, the main class
    is ClickMe.
 */
