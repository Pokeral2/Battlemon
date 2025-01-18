package Database;

import java.util.Locale.Category;

public class MoveCategory
{
    public static MoveCategory PHYSICAL = new MoveCategory(1, "Physical");
    public static MoveCategory SPECIAL = new MoveCategory(2, "Special");
    public static MoveCategory STATUS = new MoveCategory(3, "Status");
    public int categoryId;
    public String categoryName;

    public MoveCategory(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    
}
    

