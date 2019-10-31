package com.example.codinginflowjavadagger2;

import dagger.Component;

//Component is the backbone of Java so it is very important
@Component
public interface CarComponent {


    Car getCar();
}
