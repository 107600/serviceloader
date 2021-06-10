//package com.jy.blog.serviceloader;
//
//import org.assertj.core.api.Assertions;
//import org.springframework.core.io.support.SpringFactoriesLoader;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class SpringFactoriesTest {
//
//    @Test
//    public void spring_factories_should_load_correct_implementations() {
//        List<Foo> foos = SpringFactoriesLoader.loadFactories(Foo.class, null);
//        Assertions.assertThat(foos)
//                .isNotNull()
//                .isNotEmpty()
//                .hasSize(2);
//    }
//}
