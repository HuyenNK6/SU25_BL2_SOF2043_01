/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau3.repository;

import demau1.util.XQuery;
import demau3.entity.Ve;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class VeRepository {
    String getAllSql= """
                      SELECT TOP (1000) [id]
                            ,[mave]
                            ,[tenve]
                            ,[ngayban]
                            ,[idloai]
                            ,[trangthai]
                        FROM [DB_DAM_Ve].[dbo].[Ve]
                      """;
    public List<Ve> getAll(){
        return XQuery.getBeanList(Ve.class, getAllSql);
    }
}
