package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder sb = new StringBuilder();
        // create a `counter`
        int i = 0;
        // while `counter` is less than length of array
        while (i < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // -- use counter as the index of the "current person" array

            // get `string Representation` of `currentPerson`
            // create string to store the value of that index

            sb.append(personArray[i].toString());

            // append `stringRepresentation` to `result` variable
            // or "+=" / continous concatenation

            // end loop
            i++;
        }
        return sb.toString();
    }



    public String forLoop() {
        StringBuilder sb = new StringBuilder();
        // identify initial value
        int start = 0;
        // identify terminal condition
        int end = personArray.length;
        // identify increment


        // use the above clauses to declare for-loop signature
        for (int i = start; i < end; i++ ){
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            sb.append(personArray[i].toString());

            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return sb.toString();
    }



    public String forEachLoop() {
        StringBuilder sb = new StringBuilder();
        // identify array's type
        // identify array's variable-name


        // use the above discoveries to declare for-each-loop signature
        for (Person p : personArray) {
            // begin loop

            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            sb.append(p.toString());


            // end loop
        }

        return sb.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
