package com.example.myapplication;

@motif.Scope
interface JavaRootScope {

    JavaMainScope javaMainScope(String profileId, String postId);

    @motif.Dependencies
    interface Dependencies {}
}
