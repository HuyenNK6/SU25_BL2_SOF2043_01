/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau3.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Huyen
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ve {
    private int id;
    private String maVe;
    private String tenVe;
    private Date ngayBan;
    private int idLoai;
    private int trangThai;
}
