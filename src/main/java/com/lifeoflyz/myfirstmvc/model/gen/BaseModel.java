package com.lifeoflyz.myfirstmvc.model.gen;

/**
 * Created by liyuanzhe on 16-12-13.
 */
public abstract class BaseModel {

    public abstract Long getId();

    public abstract void setCreatedBy(Long createdBy);

    public abstract void setUpdatedBy(Long updatedBy);
}
