package edu.umb.cs680.hw07;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DirectoryTest {

	@Test
	public void verifyDirectoryNameEquality() {
		FileSystem fs = FileSystem.getFileSystem();
		Directory root = new Directory(null, "root", 0, LocalDateTime.now()); 
		Directory code = new Directory(root, "code", 0, LocalDateTime.now()); 
		fs.appendRootDir(root);
		root.appendChild(code);
		Object expected = "code";
		Object actual = code.getName();
		assertEquals(expected, actual);
	}
}