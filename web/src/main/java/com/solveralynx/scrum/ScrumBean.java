package com.solveralynx.scrum;

import com.clients.SimpleClient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by zana on 21/02/16.
 */
@ManagedBean
@SessionScoped
public class ScrumBean implements Serializable {

    public String getZanasTasks() {
        String result = "";
        try {
            result = new SimpleClient().getZanasTasks();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
