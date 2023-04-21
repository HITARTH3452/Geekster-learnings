package com.geekster.User.management.System.Repository;

import com.geekster.User.management.System.models.UMS;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UMSDao {
    private List<UMS> umslist;

    public UMSDao(){
        umslist = new ArrayList<>();
    }

    public List<UMS> getUmsfromdataSources(){
        return umslist;
    }

    public boolean save(UMS ums){
        umslist.add(ums);
        return true;
    }

    public boolean remove(UMS ums){
        umslist.remove(ums);
        return true;
    }

    public boolean update(String id){
        boolean updateStatus = false;
        for(UMS ums : umslist)
        {
            if(ums.getId().equals(id))
            {
                remove(ums);
                return true;
            }
        }
        return false;
    }

}
