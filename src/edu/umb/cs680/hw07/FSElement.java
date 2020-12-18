package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

abstract class FSElement
{
	protected Directory parent;
	protected String name;
	protected int size;
	protected LocalDateTime creationTime;

	public FSElement(Directory parent, String name, int size, LocalDateTime creationTime) {
		this.parent = parent;
		this.name = name;
		this.size = size;
		this.creationTime = creationTime;
	}
	public Directory getParent() {
		return parent;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setParent(Directory parent) {
		this.parent = parent;
	}
	abstract boolean isDirectory();
	abstract boolean inDirectory(Directory dir);

}

