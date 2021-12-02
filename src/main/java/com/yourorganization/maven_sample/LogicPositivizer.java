package com.yourorganization.maven_sample;

import com.github.javaparser.utils.Log;

/**
 * Some code that uses JavaParser.
 */
public class LogicPositivizer {
    public static void main(String[] args) {
        Log.setAdapter(new Log.StandardOutStandardErrorAdapter());
        System.out.println("Hello World"); 
        Log.info("Hello World! First Project");
    }
}
