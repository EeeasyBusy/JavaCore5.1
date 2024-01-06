package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @Test
    void parseXML() {
        final boolean b = true;
        File file = new File("data.xml");
        final boolean fileExist = file.exists();
        Assertions.assertTrue(fileExist);
    }
}