package edu.umb.cs680.hw07;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	public void verifyFileSize() {
		FileSystem fs = FileSystem.getFileSystem();
		Directory root = new Directory(null, "root", 0, LocalDateTime.now()); 
		File a = new File(null, "a.txt", 8, LocalDateTime.now());
		fs.appendRootDir(root);
		root.appendChild(a);
		Object expected = 8;
		Object actual = a.getSize();
		assertEquals(expected, actual);
	}
}