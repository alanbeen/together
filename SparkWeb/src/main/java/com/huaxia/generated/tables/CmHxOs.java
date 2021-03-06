/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.CmHxOsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmHxOs extends TableImpl<CmHxOsRecord> {

    private static final long serialVersionUID = 270351855;

    /**
     * The reference instance of <code>test.cm_hx_os</code>
     */
    public static final CmHxOs CM_HX_OS = new CmHxOs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmHxOsRecord> getRecordType() {
        return CmHxOsRecord.class;
    }

    /**
     * The column <code>test.cm_hx_os.os_id</code>.
     */
    public final TableField<CmHxOsRecord, Integer> OS_ID = createField("os_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_os.os</code>.
     */
    public final TableField<CmHxOsRecord, String> OS = createField("os", org.jooq.impl.SQLDataType.CHAR.length(50), this, "");

    /**
     * Create a <code>test.cm_hx_os</code> table reference
     */
    public CmHxOs() {
        this("cm_hx_os", null);
    }

    /**
     * Create an aliased <code>test.cm_hx_os</code> table reference
     */
    public CmHxOs(String alias) {
        this(alias, CM_HX_OS);
    }

    private CmHxOs(String alias, Table<CmHxOsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmHxOs(String alias, Table<CmHxOsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CmHxOsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CM_HX_OS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmHxOsRecord> getPrimaryKey() {
        return Keys.KEY_CM_HX_OS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmHxOsRecord>> getKeys() {
        return Arrays.<UniqueKey<CmHxOsRecord>>asList(Keys.KEY_CM_HX_OS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxOs as(String alias) {
        return new CmHxOs(alias, this);
    }

    /**
     * Rename this table
     */
    public CmHxOs rename(String name) {
        return new CmHxOs(name, null);
    }
}
