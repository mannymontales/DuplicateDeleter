package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        //first part of the method checks how many duplicates elements meet the maxNumberOfDuplications to create a new array with that specified size
        int setsOfDups = 0;

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            if (count >= maxNumberOfDuplications){
                setsOfDups++;
            }
        }
        System.out.println(setsOfDups);

        int a[] = new int[array.length - setsOfDups];
        int aCounter = 0;
        String completed = "";

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            //REVIEW WHY THIS DOESNT NEED COMPLETED + BUT THE OTHER ONE NEEDS COMPLETED +
            //if count is less than maxNumberOfDuplications add it to the new array and whatever variable it was being compared to
            if (count < maxNumberOfDuplications){
                completed = array[i] + " ";
                aCounter++;
            }
        }

        //System.out.println(setsOfDups);
        //convert array to integer array
        String[] newArray = new String[a.length];
        if (newArray.length == 0){
            return newArray;
        } else {
            String[] arr = completed.split(" ");
            return arr;
        }
//        String[] arr = completed.split(" ");
//        completed.
//        int i = 0;
//        for (int value : a) {
//            newArray[i++] = String.valueOf(Integer.valueOf(value));
//        }
//        return arr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        //first part of the method checks how many duplicates elements meet the maxNumberOfDuplications to create a new array with that specified size
        int setsOfDups = 0;

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            if (count == exactNumberOfDuplications){
                setsOfDups++;
            }
        }
        System.out.println(setsOfDups);

        int a[] = new int[array.length - setsOfDups];

        String completed = "";

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            //if count is less than maxNumberOfDuplications add it to the new array and whatever variable it was being compared to
            if (count != exactNumberOfDuplications){
                completed = completed + array[i] + " ";
            }
        }

        //System.out.println(setsOfDups);
        //convert array to integer array
        String[] newArray = new String[a.length];
        if (newArray.length == 0){
            return newArray;
        } else {
            String[] arr = completed.split(" ");
            return arr;
        }
    }
}
