package com.command.design.pattern;

public class TurnOnCommand implements Command {
	
	private Light light;
	
	public TurnOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.lightsOn();
		
	}

}
