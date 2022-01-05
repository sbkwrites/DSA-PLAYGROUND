package com.deloitte.intrv;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7};

        //modify array to {2,1,4,3,6,5,7}

        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            ++i;
        }

        System.out.println(Arrays.toString(arr));

        HashMap<String,String> hm = new HashMap<>();


    }
    //Emp emp = new Emp
     /*
    * id
    * name
    * salary
    * city

    group by cities


    {"employee :
    "rohit","virat"}


    List.stream.



    * */





    /*
    *       List<Employee> employeeList ;
    *
    *
    *
    *       Hashmap<String,List<Employee>> cityMap= new HashMap<String,<>>;
    *
    *       //iterate emp list
    *           ->emp.getCity();
    *
    *       for( Employee employee : employeeList )
    *       {
    *
    *
    *           if(!cityMap.getKeys(employee.getCity()))
    *           {
    *               List<Emp
    *               cityMap.put(employee.getCity(),)
    *           }
    *           else
    *           {
    *               cityMap.
    *           }
    *       }
    *
    *
    *
    *
    * */
//--------------------------------------------------//
    /* EMPLOYEE
    * * id
     * name
     * salary
     * city
    *
    *   get city names and no of employes
    *
    *
    *   SELECT
    *         CITY_NAME, COUNT(EMPLOYEE_ID)
    *   FROM
    *       EMPLOYEE
    *   GROUP BY CITY_NAME;
    *   7
    *
    * */
}
