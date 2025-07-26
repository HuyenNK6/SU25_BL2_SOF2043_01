/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Huyen
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data//@Getter,@Setter, @ToString, @EqualAndHashCode, @..
public class Category {
    private String id;
    private String name;
//thay đổi cách show thông tin
    @Override
    public String toString() {
        return  name;
    }
    
}
