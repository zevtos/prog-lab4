package lab4.underwatersettlement.entities;

import lab4.exceptions.CustomCheckedException;

// Расширяем ранее созданный интерфейс Shoggoth
public interface Shoggoth{
    void describeShoggoth();

    void followCommands();

    void communicateWithElders();

    void makeSound();

    void describeBehavior() throws CustomCheckedException;
}

