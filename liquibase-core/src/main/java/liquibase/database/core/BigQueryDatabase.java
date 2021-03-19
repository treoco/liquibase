package liquibase.database.core;

import liquibase.CatalogAndSchema;
import liquibase.database.AbstractJdbcDatabase;
import liquibase.database.DatabaseConnection;
import liquibase.database.OfflineConnection;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.structure.DatabaseObject;
import liquibase.structure.core.Table;
import liquibase.util.JdbcUtils;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;

public class BigQueryDatabase extends AbstractJdbcDatabase {

    @Override
    public boolean isCorrectDatabaseImplementation(DatabaseConnection conn) throws DatabaseException {
        if(conn.getDatabaseProductName().equals("Google BigQuery")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDefaultDriver(String url) {
        return null;
    }

    @Override
    public String getShortName() {
        return "bigquery";
    }

    @Override
    public Integer getDefaultPort() {
        return null;
    }

    @Override
    public boolean supportsInitiallyDeferrableColumns() {
        return false;
    }

    @Override
    public boolean supportsTablespaces() {
        return false;
    }

    @Override
    protected String getDefaultDatabaseProductName() {
        return null;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public String getCurrentDateTimeFunction() {
        return "CURRENT_TIMESTAMP";
    }
}
