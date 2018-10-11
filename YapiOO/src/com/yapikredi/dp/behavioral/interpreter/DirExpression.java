package com.yapikredi.dp.behavioral.interpreter;

public class DirExpression implements IExpression {

	@Override
	public void interpret(final InterpreterContext context) {
		String[] strings = context.getStrings();
		String string = strings[1];
		System.out.println("Showing dir : " + string);
	}

}
