package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem
{
	private FileSystem() {}
	private LinkedList<Directory> rootDirs = new LinkedList<Directory>();

	private static FileSystem fs;
	public static FileSystem getFileSystem() {
		if (FileSystem.fs == null) {
    		FileSystem.fs = new FileSystem();
    	} else {
    		System.out.println("just one file system please");
    	}
		return FileSystem.fs;
	}
	public LinkedList<Directory> getRootDirs() {
		return this.rootDirs;
	}
	public void appendRootDir(Directory root) {
		this.rootDirs.add(root);

	}
}

