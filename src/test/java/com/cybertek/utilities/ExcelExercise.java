package com.cybertek.utilities;

import java.util.*;

public class ExcelExercise {

    public static void main(String[] args) {
        String path="./src/test/resources/test_data/light-side-test-data.xlsx";
        String userSheet="light-side-users";
        ExcelUtil userData=new ExcelUtil(path,userSheet);

        //List<Map<String,String>>userTestData=userData.getDataList();

        //System.out.println(userTestData.get(22).get("name"));

       // System.out.println(userData.rowCount());



        String roomSheet="light-side-rooms";
        ExcelUtil roomData=new ExcelUtil(path,roomSheet);

        List<Map<String,String>>roomTestData=roomData.getDataList();
        System.out.println(roomTestData);

        System.out.println(roomData.rowCount());
        System.out.println(roomData.columnCount());

        String[][] arr=roomData.getDataArray();
        System.out.println(arr[5][0]);


//        System.out.println(roomTestData.get(0).get("name"));
//        System.out.println(roomTestData.get(1).get("name"));
//        System.out.println(roomTestData.get(2).get("name"));
//        System.out.println(roomTestData.get(3).get("name"));
//        System.out.println(roomTestData.get(4).get("name"));
//        System.out.println(roomTestData.get(5).get("name"));
         // System.out.println(roomTestData.get(6).get("name"));



    }


}

