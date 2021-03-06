/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.CmHxIpRecord;

import java.sql.Timestamp;
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
public class CmHxIp extends TableImpl<CmHxIpRecord> {

    private static final long serialVersionUID = 1489784813;

    /**
     * The reference instance of <code>test.cm_hx_ip</code>
     */
    public static final CmHxIp CM_HX_IP = new CmHxIp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmHxIpRecord> getRecordType() {
        return CmHxIpRecord.class;
    }

    /**
     * The column <code>test.cm_hx_ip.id</code>.
     */
    public final TableField<CmHxIpRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_ip.port_id</code>.
     */
    public final TableField<CmHxIpRecord, Integer> PORT_ID = createField("port_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.cm_hx_ip.mac_address</code>.
     */
    public final TableField<CmHxIpRecord, String> MAC_ADDRESS = createField("mac_address", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_ip.ip_address</code>.
     */
    public final TableField<CmHxIpRecord, String> IP_ADDRESS = createField("ip_address", org.jooq.impl.SQLDataType.CHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_ip.mask</code>.
     */
    public final TableField<CmHxIpRecord, String> MASK = createField("mask", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_ip.last_modify_time</code>.
     */
    public final TableField<CmHxIpRecord, Timestamp> LAST_MODIFY_TIME = createField("last_modify_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>test.cm_hx_ip.last_modify_user</code>.
     */
    public final TableField<CmHxIpRecord, Timestamp> LAST_MODIFY_USER = createField("last_modify_user", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>test.cm_hx_ip.ip_info</code>.
     */
    public final TableField<CmHxIpRecord, String> IP_INFO = createField("ip_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_ip.equ_type</code>.
     */
    public final TableField<CmHxIpRecord, String> EQU_TYPE = createField("equ_type", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.cm_hx_ip.ip_long</code>.
     */
    public final TableField<CmHxIpRecord, Long> IP_LONG = createField("ip_long", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>test.cm_hx_ip</code> table reference
     */
    public CmHxIp() {
        this("cm_hx_ip", null);
    }

    /**
     * Create an aliased <code>test.cm_hx_ip</code> table reference
     */
    public CmHxIp(String alias) {
        this(alias, CM_HX_IP);
    }

    private CmHxIp(String alias, Table<CmHxIpRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmHxIp(String alias, Table<CmHxIpRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CmHxIpRecord> getPrimaryKey() {
        return Keys.KEY_CM_HX_IP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmHxIpRecord>> getKeys() {
        return Arrays.<UniqueKey<CmHxIpRecord>>asList(Keys.KEY_CM_HX_IP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxIp as(String alias) {
        return new CmHxIp(alias, this);
    }

    /**
     * Rename this table
     */
    public CmHxIp rename(String name) {
        return new CmHxIp(name, null);
    }
}
