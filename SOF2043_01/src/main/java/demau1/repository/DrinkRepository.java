/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demau1.repository;

import demau1.entity.Drink;
import demau1.util.XJdbc;
import demau1.util.XQuery;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class DrinkRepository {

    //gõ 3 lần dấu nháy kép
    String getAllSql = """
                       SELECT TOP (1000) [Id]
                             ,[Name],[UnitPrice],[Discount]
                             ,[Image],[Available],[CategoryId]
                         FROM [PolyCafe].[dbo].[Drinks]
                       """;
    String insertSql = """
                      INSERT INTO [dbo].[Drinks]
                                 ([Id],[Name],[UnitPrice],[Discount],[Image],[Available],[CategoryId])
                      VALUES (?,?,?,?,?,?,?)
                       """;
    public List<Drink> getAll() {
        //XJdbc hay XQuery? => XQuery => getBeanList
        return XQuery.getBeanList(Drink.class, getAllSql);
    }
    public int add(Drink drink) { //lưu ý: đưa giá trị vào values đúng thứ tự ?
        Object[] values = {
            drink.getId(),
            drink.getName(),
            drink.getUnitPrice(),
            drink.getDiscount(),
            drink.getImage(),
            drink.isAvailable(),
            drink.getCategoryId()
        };
        return XJdbc.executeUpdate(insertSql, values);//trả về số bản ghi được thực hiện
    }

    // test trước
    public static void main(String[] args) {
        DrinkRepository repo = new DrinkRepository();
        List<Drink> list = repo.getAll();
        for (Drink drink : list) {
            System.out.println(drink.toString());
        }
    }
}
