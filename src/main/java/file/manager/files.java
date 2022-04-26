package file.manager;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class files {

    private static void TOJSON(List<product> plist){
String s =new Gson().toJson(plist);
File data=new File("finaldata.json");
//
    }

    private static void FROMJSON(){
File data = new File("Existingdata.json");
//
    }


    public static void main(String[] args) throws IOException {

            File uploadsMen = new File("C:\\Users\\unknow\\Desktop\\git-rep\\Jsontesting\\uploads\\Men");
            File uploadsWomen = new File("C:\\Users\\unknow\\Desktop\\git-rep\\Jsontesting\\uploads\\Women");


                File[] fileMen = uploadsMen.listFiles();
                File[] fileWomen = uploadsWomen.listFiles();

        String[] md =new String[fileMen.length];
        String[] wd = new String[fileWomen.length];
        String[] m =new String[fileMen.length];
        String[] w =new String[fileWomen.length];

                int i=0,y=0;
                for (File value : fileMen) {
                   if (value.isDirectory()){
                       md[i] =value.getPath();
                       m[i]= value.getName();
                       i++;
                   }
                }


        for (File value : fileWomen) {
            if (value.isDirectory()){
                wd[y] =value.getPath();
                w[y] = value.getName();
                y++;
            }
        }

                for (int b=0; b<md.length;b++){
                    System.out.println("path is "+md[b]+ "\n\r" +
                            "folder name is : " +m[b] +"\n\r" );
                }
        System.out.println("============");

//        ArrayList<product> ProductList = new ArrayList<>();
//
//        for (int b=0; b<md.length;b++){
//
//    product x= new product();
//    x.name = m[b];
//    x.description="it'a a great product";
//    x.oldprice ="120";
//    x.setPrice("100");
//    ProductList.add(x);
//
//}
//        for (product f:ProductList
//             ) {
//            System.out.println(f.getName());
//
//        }

        //        for (int b=0; b<wd.length;b++){
//            System.out.println(wd[b]);
//        }



    }


}
