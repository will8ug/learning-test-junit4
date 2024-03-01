package me.will.learningtest.junit4.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TemporaryFolderRuleTest {
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void givenTempFolderRule_whenNewFile_thenFileIsCreated() throws IOException {
        File testFile = tmpFolder.newFile("test-file.txt");
        System.out.println(testFile.getAbsolutePath());

        assertTrue(testFile.isFile());
        assertEquals(tmpFolder.getRoot(), testFile.getParentFile());
    }
}
