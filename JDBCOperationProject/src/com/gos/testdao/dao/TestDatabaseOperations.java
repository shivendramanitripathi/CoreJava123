package com.gos.testdao.dao;

import com.gos.testdao.exception.DaoException;
import com.gos.testdao.model.TestTable;

import java.util.List;


public class TestDatabaseOperations {

    public static void main(String[] args) {
        try {
            TestDao testDao = new TestDaoImpl();

            /*
             Insert data
             */
 /*           TestTable testTable = new TestTable();
            testTable.setColumn1(2);
            testTable.setColumn2("Raj");
            testTable.setColumn3(201);
            testTable.setColumn4("col4");
            int count = testDao.insertTestTableData(testTable);
            System.out.println("Number of records inserted are "+count);
*/
            /*
             Select data
             */
      /*      List<TestTable> selectedData = testDao.getTestTableData();
            System.out.println("Data found after doing select is "+selectedData.toString());*/
            /*
             Update data
             */
        /*    int updateCount = testDao.updateTestTableData(2, "shivendra");
            System.out.println("Number of records updated are "+updateCount);
*/
            /*
             Select data
             */
/*            List<TestTable> selectedData2 = testDao.getTestTableData();
            System.out.println("Data found after doing select is "+selectedData2.toString());*/

            /*
             Delete data
             */
       /*     int deleteCount = testDao.deleteTestTableData(2);
            System.out.println("Number of records deleted are "+deleteCount);*/


            /*
             Select data
             */
            List<TestTable> selectedData3 = testDao.getTestTableData();
            System.out.println("Data found after doing select is "+selectedData3.toString());


        } catch (DaoException e) {
            e.printStackTrace();
        }

    }
}