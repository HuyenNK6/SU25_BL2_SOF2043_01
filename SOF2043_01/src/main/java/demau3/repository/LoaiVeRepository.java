/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau3.repository;

import demau3.util.XQuery;
import demau3.entity.LoaiVe;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class LoaiVeRepository {
    String getAllSql="""
                     SELECT TOP (1000) [id],[ma],[ten],[giave]
                       FROM [DB_DAM_Ve].[dbo].[LoaiVe]
                     """;
    String getByIDSql="""
                     SELECT [id] ,[ma] ,[ten], [giave]
                       FROM [DB_DAM_Ve].[dbo].[LoaiVe]
                     WHERE id = ?
                     """;
    public List<LoaiVe> getAll(){
        return XQuery.getBeanList(LoaiVe.class, getAllSql);
    }
    public LoaiVe getByID(int id){
        return XQuery.getSingleBean(LoaiVe.class, getByIDSql, id);
    }
}
