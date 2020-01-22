/*
 * This file is generated by jOOQ.
 */
package com.apon.elitefour.database;


import com.apon.elitefour.database.tables.FlywaySchemaHistory;
import com.apon.elitefour.database.tables.List;
import com.apon.elitefour.database.tables.ListItem;
import com.apon.elitefour.database.tables.ListItemEliminated;
import com.apon.elitefour.database.tables.Status;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 435130008;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = com.apon.elitefour.database.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.list</code>.
     */
    public final List LIST = com.apon.elitefour.database.tables.List.LIST;

    /**
     * The table <code>public.list_item</code>.
     */
    public final ListItem LIST_ITEM = com.apon.elitefour.database.tables.ListItem.LIST_ITEM;

    /**
     * The table <code>public.list_item_eliminated</code>.
     */
    public final ListItemEliminated LIST_ITEM_ELIMINATED = com.apon.elitefour.database.tables.ListItemEliminated.LIST_ITEM_ELIMINATED;

    /**
     * The table <code>public.status</code>.
     */
    public final Status STATUS = com.apon.elitefour.database.tables.Status.STATUS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final java.util.List<Table<?>> getTables() {
        java.util.List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final java.util.List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            List.LIST,
            ListItem.LIST_ITEM,
            ListItemEliminated.LIST_ITEM_ELIMINATED,
            Status.STATUS);
    }
}
