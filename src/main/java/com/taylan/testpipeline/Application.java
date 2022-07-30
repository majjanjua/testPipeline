package com.taylan.testpipeline;

public class Application {

    public String sayHello() {
        String stupidtestWord = "Hello World!";
        logger.log(stupidtestWord);
        return stupidtestWord;
    }

    public String doSomeStupid() {
        String stupidWord = "balbalba";
        logger.log(stupidWord);
        return stupidWord;
    }
}
