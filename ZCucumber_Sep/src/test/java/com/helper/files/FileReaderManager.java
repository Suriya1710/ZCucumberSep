package com.helper.files;

import java.io.IOException;

public class FileReaderManager {

	public static FileReaderManager manager;

	public static TestData_Reader reader;

	// SDP

	private FileReaderManager() {
	}

	public static FileReaderManager getInstanceFRM() {

		if (manager == null) {

			manager = new FileReaderManager();

		}

		return manager;

	}

	public TestData_Reader getInstanceTestData() throws IOException {

		if (reader == null) {

			reader = new TestData_Reader();

		}

		return reader; // return the TestData Constructor

	}

}
