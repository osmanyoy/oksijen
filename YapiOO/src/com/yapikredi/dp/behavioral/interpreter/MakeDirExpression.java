package com.yapikredi.dp.behavioral.interpreter;

public class MakeDirExpression implements IExpression {

	@Override
	public void interpret(final InterpreterContext context) {
		String[] strings = context.getStrings();
		String string = strings[1];
		System.out.println("Making dir : " + string);
	}

}
