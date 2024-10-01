package org.example;

import org.example.entity.Person;

import java.io.*;

public class LockAheadInputStream extends ObjectInputStream {


    public LockAheadInputStream(InputStream in) throws IOException {
        super(in);
    }


    @Override
    protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        if (!desc.getName().equals(Person.class.getName())) {
            throw new InvalidClassException("Unauthorized deserialization attempt", desc.getName());
        }
        return super.resolveClass(desc);
    }

}
