/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau1.entity;

import lombok.*;

/**
 *
 * @author Huyen
 */
@NoArgsConstructor //constructor ko tham số
@AllArgsConstructor //constructor đầy đủ tham số
@Builder //tạo constructor tùy ý
@Data  //@Getter, @Setter, @ToString, @Equal...
public class Drink { 
    private String id; 
    private String name; 
    private String image ; 
    private double unitPrice; 
    private double discount; 
    private boolean available; 
    private String categoryId; 
} 
