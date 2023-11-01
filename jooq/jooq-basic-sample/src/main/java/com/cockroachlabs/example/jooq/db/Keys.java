/*
 * This file is generated by jOOQ.
 */
package com.cockroachlabs.example.jooq.db;


import com.cockroachlabs.example.jooq.db.tables.Accounts;
import com.cockroachlabs.example.jooq.db.tables.records.AccountsRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountsRecord> ACCOUNTS_PK = UniqueKeys0.ACCOUNTS_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountsRecord> ACCOUNTS_PK = Internal.createUniqueKey(Accounts.ACCOUNTS, "ACCOUNTS_PK", new TableField[] { Accounts.ACCOUNTS.ID }, true);
    }
}
