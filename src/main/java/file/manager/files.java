package file.manager;
import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.String;

public class files {

    public static void main(String[] args) throws IOException {

            File uploadsMen = new File("C:\\Users\\unknow\\Desktop\\git-rep\\Jsontesting\\uploads\\Men");
//            File uploadsWomen = new File("C:\\Users\\unknow\\Desktop\\git-rep\\Jsontesting\\uploads\\Women");


                File[] fileMen = uploadsMen.listFiles();
//                File[] fileWomen = uploadsWomen.listFiles();

        String[] md =new String[fileMen.length];
//        String[] wd = new String[fileWomen.length];

        String[] m =new String[fileMen.length];
//        String[] w =new String[fileWomen.length];

                int i=0,y=0;
                for (File value : fileMen) {
                   if (value.isDirectory()){
                       md[i] =value.getPath();
                       m[i]= value.getName();
                       i++;
                   }
                }


//        for (File value : fileWomen) {
//            if (value.isDirectory()){
//                wd[y] =value.getPath();
//                w[y] = value.getName();
//                y++;
//            }
//        }

                for (int b=0; b<md.length;b++){
                    System.out.println("path is "+md[b]+ "\n\r" +
                            "folder name is : " +m[b] +"\n\r" );
                }
        System.out.println("============");

                product x= new product();
                x.setProductName(m[0]);
        System.out.println(x.getProductName());



//        for (int b=0; b<wd.length;b++){
//            System.out.println(wd[b]);
//        }


    }


}
