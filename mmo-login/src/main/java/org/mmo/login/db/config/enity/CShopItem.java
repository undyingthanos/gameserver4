package org.mmo.login.db.config.enity;

import org.bson.types.ObjectId;
import org.mmo.engine.util.JsonUtil;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 商城道具
 * @author jzy
 */
@Document(collection = "shop_item")
public class CShopItem {

    private ObjectId _id;

    @Id
    private int id;

    /**
     * 价格
     */
    private int price;

    /**
     * 物品
     */
    private String items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return JsonUtil.toJSONString(this);
    }
}
