package com.huaxia.test.utils.transaction;

import org.jooq.Transaction;
import org.jooq.TransactionContext;
import org.jooq.TransactionProvider;
import org.jooq.tools.JooqLogger;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class SpringTransactionProvider implements TransactionProvider {
    private static final JooqLogger log = JooqLogger.getLogger(SpringTransactionProvider.class);   
    DataSourceTransactionManager txMgr;
    public SpringTransactionProvider(DataSourceTransactionManager txMgr){
        this.txMgr = txMgr;
    }
    @Override
    public void begin(TransactionContext ctx) {
        log.debug("Begin transaction");
        TransactionStatus tx = txMgr.getTransaction(new DefaultTransactionDefinition());
        ctx.transaction(new SpringTransaction(tx));
    }
    @Override
    public void commit(TransactionContext ctx) {
        log.debug("commit transaction");
        txMgr.commit(((SpringTransaction) ctx.transaction()).tx);
    }
    @Override
    public void rollback(TransactionContext ctx) {
        log.debug("rollback transaction");
        txMgr.rollback(((SpringTransaction) ctx.transaction()).tx);
    }
}