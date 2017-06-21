package lesson17.task1;

import java.io.File;

public class FileCopy {
    public static void main(String[] args) {
        File f1 = new File("src");

        printInfo(f1, " ");
    }
    private static void printInfo(File f1 ,String emptyString){
        if(f1.isDirectory()){
            System.out.println(emptyString +f1.getName());
            for(File f : f1.listFiles()){
                printInfo(f, emptyString + " ");
            }
        }
        else{
            System.out.println(emptyString + f1.getName());
        }
    }
}
