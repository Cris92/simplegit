package com.simplegit.server.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

@Controller
public class CoreController {

	private Logger logger = Logger.getLogger(this.getClass());

	public Process executeGitCommand(String command) throws IOException {

		logger.debug("Command sent: " + command + " --porcelain");
		Runtime rt = Runtime.getRuntime();
		return rt.exec(command + " --p");
	}

	public Process executeCommand(String command) throws IOException {

		logger.debug("Command sent: " + command);
		Runtime rt = Runtime.getRuntime();
		return rt.exec(command);
	}
}
