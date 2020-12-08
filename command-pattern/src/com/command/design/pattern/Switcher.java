package com.command.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	
	private List<Command> commandList;
	
	public Switcher() {
		this.commandList = new ArrayList();
	}
	
	public void addCommand(Command command) {
		this.commandList.add(command);
	}
	
	public void executeCommand() {
		for(Command command: commandList)
			command.execute();
	}

}
