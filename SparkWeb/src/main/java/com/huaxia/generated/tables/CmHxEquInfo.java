/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.CmHxEquInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class CmHxEquInfo extends TableImpl<CmHxEquInfoRecord> {

    private static final long serialVersionUID = -1062606644;

    /**
     * The reference instance of <code>test.cm_hx_equ_info</code>
     */
    public static final CmHxEquInfo CM_HX_EQU_INFO = new CmHxEquInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmHxEquInfoRecord> getRecordType() {
        return CmHxEquInfoRecord.class;
    }

    /**
     * The column <code>test.cm_hx_equ_info.equ_id</code>.
     */
    public final TableField<CmHxEquInfoRecord, Long> EQU_ID = createField("equ_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.purpose</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> PURPOSE = createField("purpose", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.product_no</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> PRODUCT_NO = createField("product_no", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.remark</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.cpu_info</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> CPU_INFO = createField("cpu_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.memory_info</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> MEMORY_INFO = createField("memory_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.disk_info</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> DISK_INFO = createField("disk_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.width</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> WIDTH = createField("width", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.position</code>.
     */
    public final TableField<CmHxEquInfoRecord, String> POSITION = createField("position", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_equ_info.person_id</code>.
     */
    public final TableField<CmHxEquInfoRecord, Long> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>test.cm_hx_equ_info</code> table reference
     */
    public CmHxEquInfo() {
        this("cm_hx_equ_info", null);
    }

    /**
     * Create an aliased <code>test.cm_hx_equ_info</code> table reference
     */
    public CmHxEquInfo(String alias) {
        this(alias, CM_HX_EQU_INFO);
    }

    private CmHxEquInfo(String alias, Table<CmHxEquInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmHxEquInfo(String alias, Table<CmHxEquInfoRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CmHxEquInfoRecord> getPrimaryKey() {
        return Keys.KEY_CM_HX_EQU_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmHxEquInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CmHxEquInfoRecord>>asList(Keys.KEY_CM_HX_EQU_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxEquInfo as(String alias) {
        return new CmHxEquInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public CmHxEquInfo rename(String name) {
        return new CmHxEquInfo(name, null);
    }
}