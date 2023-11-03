package org.railway.helper;

import com.github.javafaker.Faker;

public class DataHelper {

    static Faker faker = new Faker();

    public static int randomNumber(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

}
