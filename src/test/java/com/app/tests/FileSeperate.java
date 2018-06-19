package com.app.tests;

import java.io.File;

public class FileSeperate {

	String fs = File.separator;
	String filePath1 = System.getProperty("user.home") + fs + "download"; // look for folder in the machine
	String filePath2 = System.getProperty("user.dir") + fs + "download"; // look for folder under project
	
}
