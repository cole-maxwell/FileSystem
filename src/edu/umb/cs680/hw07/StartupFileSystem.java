package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public class StartupFileSystem {
	public static void main(String[] args)
	{
        FileSystem fs = FileSystem.getFileSystem();
        Directory root = new Directory(null, "root", 0, LocalDateTime.now()); 
        Directory home = new Directory(root, "home", 0, LocalDateTime.now());
        Directory applications = new Directory(root, "applications", 0, LocalDateTime.now());
        Directory code = new Directory(home, "code", 0, LocalDateTime.now());
        
        File a = new File(null, "a.txt", 8, LocalDateTime.now());
        File b = new File(null, "b.txt", 16, LocalDateTime.now());
        File c = new File(null, "c.txt", 32, LocalDateTime.now());
        File d = new File(null, "d.txt", 64, LocalDateTime.now());
        File e = new File(null, "e.txt", 128, LocalDateTime.now());
        File f = new File(null, "f.txt", 256, LocalDateTime.now());
        
        fs.appendRootDir(root);
        root.appendChild(applications);
        root.appendChild(home);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        code.appendChild(e);
        code.appendChild(f);
        fs.getRootDirs();

        System.out.println("root name: " + root.getName());
        System.out.println("root size: " + root.getSize());
        System.out.println("isDirectory: " + root.isDirectory());

        
        System.out.println("file name: " + e.getName());
        System.out.println("file size: " + e.getSize());
        System.out.println("isDirectory: " + e.isDirectory());

        for (FSElement fsElement: root.getChildren())   {
            System.out.println("name: " + fsElement.getName());
            System.out.println("size: " + fsElement.getSize());
            System.out.println("creation time: " + fsElement.getCreationTime());
            System.out.println("is directory: " + fsElement.isDirectory());
            System.out.println("parent name: " + fsElement.getParent().getName());
        }
	}
}
