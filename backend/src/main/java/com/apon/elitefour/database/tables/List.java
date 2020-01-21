/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database.tables;


import com.apon.elitefour.database.Indexes;
import com.apon.elitefour.database.Keys;
import com.apon.elitefour.database.Public;
import com.apon.elitefour.database.tables.records.ListRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class List extends TableImpl<ListRecord> {

    private static final long serialVersionUID = -1959969481;

    /**
     * The reference instance of <code>public.list</code>
     */
    public static final List LIST = new List();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListRecord> getRecordType() {
        return ListRecord.class;
    }

    /**
     * The column <code>public.list.id</code>.
     */
    public final TableField<ListRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.list.name</code>.
     */
    public final TableField<ListRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false), this, "");

    /**
     * The column <code>public.list.status_id</code>.
     */
    public final TableField<ListRecord, Integer> STATUS_ID = createField(DSL.name("status_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.list</code> table reference
     */
    public List() {
        this(DSL.name("list"), null);
    }

    /**
     * Create an aliased <code>public.list</code> table reference
     */
    public List(String alias) {
        this(DSL.name(alias), LIST);
    }

    /**
     * Create an aliased <code>public.list</code> table reference
     */
    public List(Name alias) {
        this(alias, LIST);
    }

    private List(Name alias, Table<ListRecord> aliased) {
        this(alias, aliased, null);
    }

    private List(Name alias, Table<ListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> List(Table<O> child, ForeignKey<O, ListRecord> key) {
        super(child, key, LIST);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public java.util.List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LIST_PKEY);
    }

    @Override
    public UniqueKey<ListRecord> getPrimaryKey() {
        return Keys.LIST_PKEY;
    }

    @Override
    public java.util.List<UniqueKey<ListRecord>> getKeys() {
        return Arrays.<UniqueKey<ListRecord>>asList(Keys.LIST_PKEY);
    }

    @Override
    public java.util.List<ForeignKey<ListRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ListRecord, ?>>asList(Keys.LIST__LIST_STATUS_ID_FKEY);
    }

    public Status status() {
        return new Status(this, Keys.LIST__LIST_STATUS_ID_FKEY);
    }

    @Override
    public List as(String alias) {
        return new List(DSL.name(alias), this);
    }

    @Override
    public List as(Name alias) {
        return new List(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public List rename(String name) {
        return new List(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public List rename(Name name) {
        return new List(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}