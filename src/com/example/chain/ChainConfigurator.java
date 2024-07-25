package com.example.chain;

public class ChainConfigurator {
    public Handler configureChain() {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNext(handlerB);
        
        return handlerA;
    }
}
