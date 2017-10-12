package com.taylan.testpipeline;

import com.taylan.testpipeline.testconfig.extension.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {


    @Test
    void should_say_hello_to_world() {
        //given
        Application application = new Application();

        //when
        String hello = application.sayHello();

        //then
        assertThat(hello).isEqualTo("Hello World!");
    }

    @Test
    void should_do_something_stupid() {
        //given
        Application application = new Application();

        //when
        String someStupid = application.doSomeStupid();

        //then
        assertThat(someStupid).isEqualTo("balbalba");
    }
}