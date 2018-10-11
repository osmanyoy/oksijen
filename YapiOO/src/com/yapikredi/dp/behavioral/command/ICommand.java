package com.yapikredi.dp.behavioral.command;

import java.util.Scanner;

public interface ICommand {
	public String getMenuDesc();

	public void execute(Scanner scanner);
}
