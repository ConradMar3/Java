package Book3_page235.Chapter08.ClassesInJAR.jarCLI_page359;

/*
The jar command is an old-fashioned Unix-like command, complete with arcane
command-line options that you have to get right if you expect to coax jar into
doing something useful.

The basic format of the jar command is this:

 > jar options jar-file [manifest-file] class-files...

The options specify the basic action you want jar to perform and provide additional
information about how you want the command to work. Table 8-1 lists the
options.

Options for the jar Command
Option Description
c - Creates a new jar file.
u - Updates an existing jar file.
x - Extracts files from an existing jar file.
t - Lists the contents of a jar file.
f - Indicates that the jar file is specified as an argument. You almost always
    want to use this option.
v - Verbose output. This option tells the jar command to display extra
    information while it works.
0 - Doesn't compress files when it adds them to the archive. This option isn’t
    used much.
m - Specifies that a manifest file is provided. It’s listed as the next argument
    following the jar file.
M - Specifies that a manifest file should not be added to the archive. This option
    is rarely used.

Note that you must specify at least the c, u, x, or t option to tell jar what action
you want to perform.
 */
