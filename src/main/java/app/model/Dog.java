package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Dog")

public class Dog extends Animal{

    @Override

    public String toString(){return "I am a dog";}
}