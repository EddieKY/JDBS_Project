package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utilities.Config;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

//public class studentTest {
//
//    @Before
//    public void setUp() throws SQLException {
//        DBUtility.openConnection(Config.getProperty("dbType"));
//    }
//
//    @After
//    public void tearDown() throws SQLException {
//
//        DBUtility.closeConnection();
//    }
//
//
//}