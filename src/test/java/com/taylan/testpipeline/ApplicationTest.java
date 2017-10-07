package com.taylan.testpipeline;

import com.taylan.testpipeline.testconfig.extension.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;

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
        assertThat(hello).isEqualTo("sHello World!");
    }

    @Test
    void should_do_something_stupid() {
        //given
        Application mockApplication = Mockito.mock(Application.class);

        //when
        mockApplication.doSomeStupid();

        //then
        InOrder inOrder = Mockito.inOrder(mockApplication);
        inOrder.verify(mockApplication).doSomeStupid();
        inOrder.verifyNoMoreInteractions();
    }
}