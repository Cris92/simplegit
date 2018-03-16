package com.simplegit.server.test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.simplegit.server.controller.CoreController;

public class MainTest {

	@Test
	public void gitStatus() throws IOException {
		CoreController coreController = new CoreController();
		Process pr = coreController.executeGitCommand("git status");
		BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line;
		System.out.println("Output:");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
