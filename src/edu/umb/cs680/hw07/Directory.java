package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;


public class Directory extends FSElement
{
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	private LinkedList<Directory> subDirectories = new LinkedList<Directory>();;
	private LinkedList<File> files = new LinkedList<File>();;

	public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
		super(parent, name, size, creationTime);
	}

	public boolean isDirectory() {
		return true;
	}

	public boolean inDirectory() {
		return true;
	}
	
	public LinkedList<FSElement> getChildren() {
		return this.children;
	}

	// returns the number of files and subdirectories in the directory
	public int countChildren() {
		int numberOfChildren = 0;
		for (FSElement child : this.getChildren())   {
			numberOfChildren++;
		}
		return numberOfChildren;	
	}

	public void appendChild(FSElement child) {
		this.children.add(child);
		child.setParent(this);
	}

	public LinkedList<Directory> getSubDirectories() {
		return subDirectories;
	}
	public LinkedList<File> getFiles() {
		return files;
	}
	public int getTotalSize() {
		// Returns the total disk consumption by all the files and subdirectories under the directory.
		// Call getTotalSize() recursively on all sub-directories
		return 0;
	}

	
}

