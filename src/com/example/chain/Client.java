package com.example.chain;

public class Client {
    public static void main(String[] args) {
    	ChainConfigurator configurator = new ChainConfigurator();
        Handler chain = configurator.configureChain();

        chain.handleRequest("A");
        chain.handleRequest("B");
        
    }
}
