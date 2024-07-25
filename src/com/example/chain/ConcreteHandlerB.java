package com.example.chain;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B processed the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
