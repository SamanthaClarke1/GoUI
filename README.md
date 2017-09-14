<html>
<head>
<title>Library Template &gt;&gt; Develop Processing </title>
<base href="http://dev.processing.org/libraries/" />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="../../processing_beta.css">
<style type="text/css">
ul {
   	list-style: none outside;
   }
 </style>


<script language="JavaScript" type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
//-->
</script>
</head>
<body bgcolor="#FFFFFF" text="#333333" link="#CC6600" vlink="#CC6600" alink="#CC6600" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table width="750" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
  <tr> 
    <td width="550" colspan="2"><img src="../images/processing_dev.gif" width="500" height="50"></td>

    <td width="180" align="right" valign="top" bgcolor="#FFFFFF"> <img src="images/1pix.gif" width="180" height="8"></td>

    <td width="20">&nbsp;</td>
  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td width="55" bgcolor="#CCCCBE" height="25">&nbsp;</td>
    <td width="675" valign="middle" rowspan="2"> 
      <table = width="675" valign="middle" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td width="1" height="25" bgcolor="#CCCCBE"><a href="../">Cover</a>&nbsp;</td>

          <td width="1" height="25" bgcolor="#CCCCBE"><font color="#999999">\</font>&nbsp;<a href="../build/">Build</a>&nbsp;</td>

          <td width="1" height="25" bgcolor="#CCCCBE"><font color="#999999">\</font>&nbsp;<a href="../source/">Source</a>&nbsp;</td>
          <td width="1" height="25" bgcolor="#CCCCBE"><font color="#999999">\</font>&nbsp;<a href="../bugs/">Bugs</a><font color="#CCCCBE">&nbsp; 
            </font></td>
          <td width="1" height="25" bgcolor="#CCCCBE"><font color="#999999">\</font>&nbsp;<a href="../reference/">Reference</a>&nbsp;</td>

          <td width="1" height="25" bgcolor="#CCCCBE"><font color="#999999">\</font>&nbsp;<a href="../libraries/"><font color="#666666">Libraries</font></a>&nbsp;</td>

          <td width="672" height="25" bgcolor="#CCCCBE">&nbsp;</td>
        </tr>
        <tr> 
          <td width="1" height="25" bgcolor="#FFFFFF">&nbsp;</td>
          <td width="1" height="25" bgcolor="#FFFFFF">&nbsp;</td>
          <td width="1" height="25" bgcolor="#FFFFFF">&nbsp;</td>
	  	  <td width="1" height="25" bgcolor="#FFFFFF">&nbsp;</td>

	  	  <td width="1" height="25" bgcolor="#FFFFFF">&nbsp;</td>
		  <td width="672" height="25" colspan="2" valign="middle" bgcolor="#DDDDCD"> 
            <img src="../images/nav_bottomarrow.gif" width="33" height="25" align="absmiddle"><a href="./index.html">Overview</a> <font color="#999999">\</font> <a href="./guidelines.html">Guidelines</a> <font color="#999999">\</font> <a href="./template.html"><font color="#666666">Template</font></a> <font color="#999999">\</font> <a href="./basics.html">Basics</a>

          </td>
        </tr>
      </table>
    </td>
    <td width="20" bgcolor="#CCCCBE" height="25" valign="middle">&nbsp;</td>
  </tr>
  <tr> 
    <td width="55" bgcolor="#FFFFFF" height="25" valign="middle">&nbsp;</td>

    <td width="20" bgcolor="#DDDDCD" height="25" valign="middle">&nbsp;</td>

  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
  <tr> 
    <td width="55"><img src="../images/1pix.gif" width="55" height="40"></td>
    <td width="695">&nbsp;</td>
  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
  <tr> 
    <td width="55"><img src="../images/1pix.gif" width="55" height="1"></td>

    <td width="695" valign="top">
    
    <table width="600" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
    <tr><td>
	 <h3>Eclipse Library Template</h3>
     <p>The following describe how to set up a Processing library project in Eclipse and build it successfully, and to make your library ready for distribution.</p>
     <ol>
     <li>Download the latest Eclipse template from <a href="http://code.google.com/p/processing-library-template/downloads/list" rel="nofollow">here</a>. <strong>Don&#x27;t unzip the .zip file yet</strong>.<br><br></li>

     <li>Create a new java project in eclipse. from the menubar choose File &rarr; New &rarr; Java Project. Give the project the name of your library. <br><br></li>
     <li>Right-click (ctrl-click) onto the folder icon of your newly created project in the &quot;Package Explorer&quot; and choose &quot;Import&quot; from the menu that pops up. Select General &rarr; Archive File, click &quot;Next&quot; and navigate to the zip file you downloaded earlier in step 1. Confirm the archive with &quot;Finish&quot;. <br><br></li>

     <li>Open your project&#x27;s &quot;Properties&quot; window. Under &quot;Java Build Path&quot;, select the &quot;Libraries&quot; tab and use &quot;add external JARs&quot; and add processing&#x27;s core.jar to your build path. It is recommended that a copy of core.jar is located in your eclipse workspace in a folder libs. If folder libs does not exist yet, create it. Read the section below regarding where to find the core.jar file. <br><br></li>
     <li>Confirm the setup with &quot;finish&quot;. <br><br></li>

     <li>Open the &quot;resources&quot; folder inside of your java project and double click the build.properties file. This file will be used to store properties required to compile your library using the ant based build.xml file. After double clicking the file, you should see its content in the eclipse editor. Edit the properties file, make changes to items 1-5 so that propeties, values and paths are properly set for your project to compile. A path can be a relative path or absolute. (1-4 are settings for compiling your project. under 5 you find settings for the automatically generated html document.) <br><br></li>
     <li>From the menu bar, choose Window &rarr; Show View &rarr; Ant. A tab with the title ant will pop up on the right side of your eclipse editor. Drag the resources/build.xml file in there, and a new item &quot;processingLibs&quot; will appear. Press the play button inside the ant tab. <br><br></li>
     <li>BUILD SUCCESSFUL. The library template will start to compile, control-messages will appear in the console window, warnings can be ignored. When finished it should say BUILD SUCCESSFUL. congratulations, you are set and you can start writing your own library by making changes to the source code in folder &quot;src&quot;. <br><br></li>

     <li>BUILD FAILED. In case the compile process fails, check the output in the console which will give you a closer idea of what went wrong. Wrrors may have been caused by<br><br>
     <ul>
     	<li>Incorrect path settings in the build.xml file. <br><br></li>
     	<li>Error &quot;Javadoc failed&quot;. if you are on windows, make sure you are using a JDK instead of a JRE in order to be able to create the javadoc for your library. JRE does not come with the javadoc application, but it is required to create libraries from this template. <br></li>
     </ul>
     </li>

     </ol>
     After having compiled and built your project successfully, you should be able to find your library in processing&#x27;s sketchbook folder, examples will be listed in processing&#x27;s sketchbook menu. Files that have been created for the distribution of the library are located in your eclipse&#x27;s workspace/yourProject/distribution folder. In there you find the web folder which contains the documentation, a zip file for downloading your library, a folder with examples as well as the index.html and css file.
     <p>To distribute your library please refer to the <a href="guidelines.html">guidelines</a>.</p>
     <br>


<b>Source code</b>

	<p>If you want to share your library's source code, we recommend to use an online repository available for free at <a href="http://code.google.com" target="_blank">code.google.com</a>, <a href="http://sourceforge.net" target="_blank">sourceforge.net</a>, or <a href="http://github.com/" target="_blank">github.com</a>.</p>
	<br>

<b>Adding core.jar and other .jar files to your classpath</b>
<br>
<p>The core.jar file contains the core classes of processing and has to be part of your classpath when building a library. On Windows and Linux, the file is located in the Processing distribution folder inside a folder named "lib". On Mac OS X, right-click Processing.app and use Show Package Contents to see the guts. The lib folder is at Contents &rarr; Resources &rarr; Java &rarr; lib. For further information about the classes in core.jar, you can see the source <a href="http://dev.processing.org/source/index.cgi/trunk/processing/" target="_blank">here</a> and the developer documentation <a href="http://dev.processing.org/reference/core/" target="_blank">here</a>.</p>

<p>If you created a "libs" folder as described above, put the libraries you need to add to your classpath in there. In the "Properties" of your java project, navigate to Java Build Path &rarr; Libraries, and click "Add External JARs". Select the .jar files from the libs folder that are required for compiling you project. Adjust the build.xml file accordingly.</p>

<p>The libs folder is recommended but not a requirement, nevertheless you need to specify where your jar files are located in your system in order to add them to the classpath.</p>

<p>In case a library depends on systems libraries, put these dependencies next to the jar file. For example processing's opengl.jar library depends on jogl hence the dlls (for windows) or jnilibs (for osx) have to be located next to the opengl.jar file.</p>

<br>
<b>What is the difference between JDK and JRE?</b>

<p>JDK stands for Java Development Kit whereas JRE stands for Java Runtime Environment.
For developers it is recommended to work with a JDK instead of a JRE since more Java development related applications such as Javadoc. Javadoc is a requirement to properly compile and document a Processing library as described on the guidelines page.</p>

<p>You can have both, a JDK and a JRE, installed on your system. in eclipse you need to specify which one you want to use.</p>

<br>
<b>The JRE System Library</b>

<p>This primarily affects Windows and Linux users (because the full JDK is installed by default on Mac OS X). It is recommended that you use the JDK instead of a JRE. The JDK can be downloaded from <a href="http://java.sun.com/javase/downloads/index.jsp">Sun's download site</a>. Also see the <a href="http://java.sun.com/javase/6/webnotes/install/index.html">Java webnotes </a> which contain useful information about installation.</p>

<p>To change the JRE used to compile your java project:

<ol>

<li>open the properties of your project from the menu Project &rarr; Properties", select "Java Build Path" and in its sub menu, click on the "Libraries" tab.
<li>A list of JARs and class folders in the build path will show up. In this list you can find the JRE System Library that is used to compile your code. Remove this JRE System library. 
<li>Click "Add Library..." In the popup window choose "JRE System Library" and press "Next". 
<li>Select an alternate JRE from the pull-down menu or click and modify the "installed JREs". Confirm with "Finish" and "OK".
</ol>
<br>
<b>Compiling with ant and javadoc</b>

<p>
Ant is a Java-based build tool. For more information visit the <a href="http://ant.apache.org/faq.html#what-is-ant">ant</a> web site. Ant uses a file named <tt>build.xml</tt> to store build settings for a project.

</p>

<p>
Javadoc is an application that creates an HTML-based API documentation of Java code. You can check for its existence by typing <tt>javadoc</tt> on the command line. On Mac OS X it is installed by default. On Windows and Linux, installing the JDK will also install the javadoc tool.
</p>
	</td></tr>
	</table>


</td>
  </tr>

</table>
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td width="55"><br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> 
      <br /> </td>

    <td width="20">&nbsp;</td>

  </tr>
  <tr> 
    <td width="55" height="25" bgcolor="#DDDDCD" valign="top">&nbsp;</td>
    <td width="675" valign="middle" bgcolor="#DDDDCD">Processing is an open project 
      initiated by <a href="http://benfry.com">Ben Fry</a> and <a href="http://reas.com">Casey 
      Reas</a></td>
    <td width="20" bgcolor="#DDDDCD" valign="top">&nbsp;</td>
  </tr>

  <tr> 
    <td width="55" height="25" bgcolor="#CCCCBE">&nbsp;</td>
    <td width="675" valign="middle" bgcolor="#CCCCBE"><a href="http://processing.org/copyright.html">&copy; 
      Info</a> &#92; Site hosted by <a href="">Media Temple!</a></td>
    <td width="20" bgcolor="#CCCCBE">&nbsp;</td>
  </tr>
</table>
</body>

</html>
