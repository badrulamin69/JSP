/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Student {
    
    private int id;
    private String name;
    private String email;
    private String dob;
    private String fee;

    public Student() {
    }

    public Student(int id, String name, String email, String dob, String fee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.fee = fee;
    }

    public Student(String name, String email, String dob, String fee) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.fee = fee;
    }
    
    
    
}
