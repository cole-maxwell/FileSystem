package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement
{
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	private LinkedList<Directory> subDirectories = new LinkedList<Directory>();
	private LinkedList<File> files = new LinkedList<File>();;

	public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
		super(parent, name, size, creationTime);
	}

	public boolean isDirectory() {
		return true;
	}

	public boolean inDirectory(Directory dir) {
		return (dir == this.parent);
	}

	public void appendChild(FSElement child) {

		if (child.isDirectory()) {
			this.subDirectories.add((Directory)child);
			this.children.add(child);
			child.setParent(this);
		} else {
			this.files.add((File)child);
			this.children.add(child);
			child.setParent(this);
		}
	}

	public LinkedList<FSElement> getChildren() {
		return this.children;
	}

	public LinkedList<Directory> getSubDirectories() {
		return this.subDirectories;
	}
	
	public LinkedList<File> getFiles() {
		return this.files;
	}

	// returns the number of files and subdirectories in the directory
	public int countChildren() {
		return this.children.size();	
	}

	public int getTotalSize() {
		
		int totalSize = 0;
	
		for (File file: this.getFiles()) {
			totalSize = totalSize + file.getSize();
		}
		for (Directory dir: this.getSubDirectories())   {
			dir.getTotalSize();
		}
		return totalSize;
		
	}


	
}

