package com.ablylabs.appwithaardependencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ablylabs.my_kotlin_lib.NestedImplementation;
import com.ablylabs.my_kotlin_lib.SomeLibraryClassThatUsesNestedInterfaceAsParam;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SomeLibraryClassThatUsesNestedInterfaceAsParam instanceIWantToUse =
                new SomeLibraryClassThatUsesNestedInterfaceAsParam();
        instanceIWantToUse.doSomethingWith(new NestedImplementation());
    }
}