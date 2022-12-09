/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Model.Admin;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;

/**
 *
 * @author prathamesh
 */
public class DbUtils {

    private static DbUtils dbUtils;

    private DbUtils() {

    }

    public static DbUtils getInstance() {
        if (dbUtils == null) {
            dbUtils = new DbUtils();
        }
        return dbUtils;
    }

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().objectClass(Admin.class).updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(Admin.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, "database/riverstone.db4o");
        return db;
    }

    public synchronized void storeSystem(Admin system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public Admin retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<Admin> systems = conn.query(Admin.class); // Change to the object you want to save
            Admin system;
            if (systems.isEmpty()) {
                system = Admin.createSystemAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }

}