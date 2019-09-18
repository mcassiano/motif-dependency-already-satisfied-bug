package com.example.myapplication;

@motif.Scope
interface JavaMainScope {

    Controller controller();

    @motif.Objects
    abstract class Objects {
        abstract Controller controller();
    }
}
