package org.launchcode.java.demos.lsn6inheritance.technology;

public abstract class  AbstractEntity {
    private int itemId;
    private static int id =1;
    public AbstractEntity(){
        itemId = id;
        id++;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
