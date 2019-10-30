/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleDB;
import java.util.ArrayList;
import java.util.List;
import models.Role;

/**
 *
 * @author 778766
 */
public class RoleService {
    public List<Role> getAll() throws Exception {
        RoleDB db = new RoleDB();
        ArrayList<Role> roleList = (ArrayList<Role>) db.getAll();
        return roleList;
    }
    
    public int insert(int roleID, String roleName) throws Exception {
        RoleDB db = new RoleDB();
        Role role = new Role(roleID, roleName);
        int i = db.insert(role);
        return i;
    }
    
    public boolean delete(int roleID) throws Exception {
        RoleDB db = new RoleDB();
        Role role = db.getRole(roleID);
        boolean b = db.delete(role);
        return b;
    }
    
    public int update(int roleID, String roleName) throws Exception {
        RoleDB db = new RoleDB();
        Role role = new Role(roleID, roleName);
        int i = db.update(role);
        return i;
    }
}
