/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau1.repository;

import demau1.entity.Category;
import demau1.util.XQuery;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class CategoryRepository {
    String getAllSql= """
                      SELECT TOP (1000) [Id]
                            ,[Name]
                        FROM [PolyCafe].[dbo].[Categories]
                      """;
    String getByIdSql= """
                      SELECT [Id],[Name]
                      FROM [PolyCafe].[dbo].[Categories]
                      WHERE id =?
                       """;
 
    public List<Category> getAll(){
        return XQuery.getBeanList(Category.class, getAllSql);
    }
    public Category getById(String id){
        return XQuery.getSingleBean(Category.class, getByIdSql, id ); //id- values cho câu lệnh sql
    }
    
}
