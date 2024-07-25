package com.example.chain;

public class ConcreteHandlerA implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next= handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("ConcreteHandlerA handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
