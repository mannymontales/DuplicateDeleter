package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        //reference to the DuplicateDeleter class
        //this is the same as
        //public DuplicateDeleter(T[] intArray) {
        //        this.array = intArray;
        //    }
        //can reference the array in duplicate deleter
        super(intArray);
        //this.intArray = intArray
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

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

        int a[] = new int[array.length - setsOfDups];
        int aCounter = 0;

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            //if count is less than maxNumberOfDuplications add it to the new array and whatever variable it was being compared to
            if (count < maxNumberOfDuplications){
                a[aCounter] = array[i];
                aCounter++;
            }
        }

        //System.out.println(setsOfDups);
        //convert array to integer array
        Integer[] newArray = new Integer[a.length];
        int i = 0;
        for (int value : a) {
            newArray[i++] = Integer.valueOf(value);
        }
        return newArray;
    }
    //int[] newArr = new int[array.length - count];
//                    for (int k = 0; k < newArr.length; k++){
//        newArr[k] = array[count];
//        count++;
//        //i = i + count;
//    }
//
//                for (int l = 0; l < newArr.length; l++){
//        a[l] = newArr[l];
//    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        //first part of the method checks how many duplicates elements meet the maxNumberOfDuplications to create a new array with that specified size
        int setsOfDups = 0;

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            if (count >= exactNumberOfDuplications){
                setsOfDups++;
            }
        }

        int a[] = new int[array.length - setsOfDups];
        int aCounter = 0;

        for (int i = 0; i < array.length; i++){
            int count = 0;

            for (int j = 0; j < array.length; j++){
                if (array[i].equals(array[j])){
                    count++;
                }
            }

            //if count is less than maxNumberOfDuplications add it to the new array and whatever variable it was being compared to
            if (count != exactNumberOfDuplications){
                a[aCounter] = array[i];
                aCounter++;
            }
        }

        //System.out.println(setsOfDups);
        //convert array to integer array
        Integer[] newArray = new Integer[a.length];
        int i = 0;
        for (int value : a) {
            newArray[i++] = Integer.valueOf(value);
        }
        return newArray;

    }
}
