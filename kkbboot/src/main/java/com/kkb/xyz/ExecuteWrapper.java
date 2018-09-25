package com.kkb.xyz;


public class ExecuteWrapper implements IExecute {

    private final IExecute execute;

    public ExecuteWrapper(final IExecute execute) {
        this.execute = execute;

    }

    @Override
    public String execute() {
        return this.execute.execute();
    }


}
