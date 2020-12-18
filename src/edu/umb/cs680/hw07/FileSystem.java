package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem
{
	private FileSystem() {}
	private LinkedList<Directory> rootDirs = new LinkedList<Directory>();
	private static FileSystem fs = null;
	public static FileSystem getFileSystem() {
		if (fs == null) {
    		fs = new FileSystem();
    	} else {
    		System.out.println("just one file system please");
    	}
		return fs;
	}
	// returns a list of all root directories, there can be many
	public LinkedList<Directory> getRootDirs() {
		return rootDirs;
	}

	// adds a root directory to the file system
	public void appendRootDir(Directory root) {
		this.rootDirs.add(root);

	}
}

