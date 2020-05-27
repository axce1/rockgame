package org.example.controller;

import org.example.service.IField;
import org.example.model.Field;

import java.util.Random;

public class Computer implements IField {

    public Field getField() {
        Field[] fields = Field.values();
        Random rnd = new Random();
        int idx = rnd.nextInt(fields.length);
        return fields[idx];
    }
}
