package com.corejava.oops.exeption;


import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsSamples {

    public static void main(String[] args) {

        /*
        ArithmeticException
         */
        // ExceptionsSamples.arthmeticExceptionOccurence(0);
        // ExceptionsSamples.arthmeticExceptionOccurence(100);


        /*
        NullPointerException
         */
       // ExceptionsSamples.nullPointerExceptionOccurence(null);
        //ExceptionsSamples.nullPointerExceptionOccurence("Hello");


        /*
        ArrayIndexOutOfBoundsException
         */
        int inputArray1[] = {1,2};
        int inputArray2[] = {1,2,3};
        // ExceptionsSamples.arrayIndexOutOfBoundsExceptionOccurence(inputArray1);
        //ExceptionsSamples.arrayIndexOutOfBoundsExceptionOccurence(inputArray2);

        /*
        IOException
         */
        String validFilePath = "C:\\Users\\user\\Desktop\\mani\\shivendra.txt";
        String invalidFilePath = "D:\\abc\\jjj";
       // ExceptionsSamples.IOExceptionOccurence(validFilePath);
       // ExceptionsSamples.IOExceptionOccurence(invalidFilePath);


    }

    public static void arthmeticExceptionOccurence(int divideBy){

        try{
            System.out.println(1000/divideBy);

        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void nullPointerExceptionOccurence(String inputString){

        try{
            System.out.println(inputString.toString());

        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void arrayIndexOutOfBoundsExceptionOccurence(int[] inputArray){

        try{
            System.out.println(inputArray[2]);

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void IOExceptionOccurence(String filePath){
        FileInputStream fin=null;
        int i;

        try{
            fin=new FileInputStream(filePath);
            while((i=fin.read())!=-1)
                System.out.print((char)i);
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }



}




