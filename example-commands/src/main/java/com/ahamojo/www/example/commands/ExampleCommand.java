package com.ahamojo.www.example.commands;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.apache.karaf.shell.api.console.Session;

@Command(name="example",scope=Session.SCOPE_GLOBAL,description="Test example")
@Service
public class ExampleCommand implements Action{

	@Argument(index = 0, name = "arg", description = "The command argument", required = false, multiValued = false)
    String arg = null;

	public Object execute() throws Exception {
        System.out.println("Executing My Command Demo");
        return null;
    }

}
