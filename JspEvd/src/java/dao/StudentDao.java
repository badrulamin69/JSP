/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

/**
 *
 * @author Admin 
 */
public class StudentDao {

    static DbUtil util = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(Student s) {
       sql = "insert into student(name, email, dob, fee) values(?,?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setSQLXML(1, s.g);
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
