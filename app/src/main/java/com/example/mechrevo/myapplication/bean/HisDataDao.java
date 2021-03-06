package com.example.mechrevo.myapplication.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HIS_DATA".
*/
public class HisDataDao extends AbstractDao<HisData, Void> {

    public static final String TABLENAME = "HIS_DATA";

    /**
     * Properties of entity HisData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Data = new Property(0, String.class, "data", false, "DATA");
    }


    public HisDataDao(DaoConfig config) {
        super(config);
    }
    
    public HisDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HIS_DATA\" (" + //
                "\"DATA\" TEXT);"); // 0: data
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HIS_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HisData entity) {
        stmt.clearBindings();
 
        String data = entity.getData();
        if (data != null) {
            stmt.bindString(1, data);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HisData entity) {
        stmt.clearBindings();
 
        String data = entity.getData();
        if (data != null) {
            stmt.bindString(1, data);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public HisData readEntity(Cursor cursor, int offset) {
        HisData entity = new HisData( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0) // data
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HisData entity, int offset) {
        entity.setData(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(HisData entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(HisData entity) {
        return null;
    }

    @Override
    public boolean hasKey(HisData entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
