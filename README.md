# examsoft
this is a sample program that counts words. The program is a Maven project that builds an executable jar. 
Java version this was executed with

java version "18" 2022-03-22
Java(TM) SE Runtime Environment (build 18+36-2087)
Java HotSpot(TM) 64-Bit Server VM (build 18+36-2087, mixed mode, sharing)


To run the code you will need to clone the code base to your local environment if you have the git program installed.

git clone https://github.com/wilvel198/examsoft.git

If you dont have git installed in your machine you can also download the zip file containing the code base in Git

Once you have the project downloadd navigate to the base project directory where the pom.xml is located in a terminal session.

in the terminal session Issue a "mvn clean" command , then issue a "mvn compile" command and finally issue a "mvn package" command.

this will generate a target directory below the base directory.

this is what the directory listing looks like

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         12/7/2022  11:38 AM                archive-tmp
d-----         12/7/2022  11:38 AM                classes
d-----         12/7/2022  11:38 AM                generated-sources
d-----         12/7/2022  11:38 AM                generated-test-sources
d-----         12/7/2022  11:38 AM                maven-archiver
d-----         12/7/2022  11:38 AM                maven-status
d-----         12/7/2022  11:38 AM                surefire-reports
d-----         12/7/2022  11:38 AM                test-classes
-a----         12/7/2022  11:42 AM        3476405 examsoft-jar-with-dependencies.jar
-a----         12/7/2022  11:42 AM           3852 examsoft.jar
-a----         12/7/2022  11:39 AM             11 word.txt

To execute the jar issues the following command if you are using a file to use as the word count source.  you should see something similar to the sample below

***********************************************************************************************************************************
c:\work\projects\examsoft\target>java -jar examsoft-jar-with-dependencies.jar "C:\\work\\projects\\examsoft\\target\\word.txt"
file location for word counting --> C:\\work\\projects\\examsoft\\target\\word.txt
2 dee
1 b
1 a

*************************************************************************************************************************************

if you provide no file then the default test will be executed

c:\work\projects\examsoft\target>java -jar examsoft-jar-with-dependencies.jar
2 the
1 is
1 in
1 cat
1 bag


You can also run the program from an IDE such as InteliJ.  You would import the project as a maven project to the IDE.

Once you have the project imported you would go to the src\main\java\com.examsoft directory and open the CountWords file. From the CountWords class you can execute the program and see the results in the output screen.


