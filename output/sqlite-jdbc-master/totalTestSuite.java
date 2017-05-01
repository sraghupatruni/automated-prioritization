import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
org.sqlite.util.OSInfoTest.class,
org.sqlite.BusyHandlerTest.class,
org.sqlite.InsertQueryTest.class,
org.sqlite.ResultSetTest.class,
org.sqlite.UDFTest.class,
org.sqlite.ExtensionTest.class,
org.sqlite.PrepStmtTest.class,
org.sqlite.JSON1Test.class,
org.sqlite.DBMetaDataTest.class,
org.sqlite.SavepointTest.class,
org.sqlite.FetchSizeTest.class,
org.sqlite.SQLiteDataSourceTest.class,
org.sqlite.SQLiteJDBCLoaderTest.class,
org.sqlite.SQLiteConfigTest.class,
org.sqlite.JDBCTest.class,
org.sqlite.QueryTest.class,
org.sqlite.ConnectionTest.class,
org.sqlite.StatementTest.class,
org.sqlite.SQLiteConnectionPoolDataSourceTest.class,
org.sqlite.TransactionTest.class,
org.sqlite.ErrorMessageTest.class,
org.sqlite.RSMetaDataTest.class,
org.sqlite.ExtendedCommandTest.class,
org.sqlite.BackupTest.class,
org.sqlite.ProgressHandlerTest.class,
org.sqlite.ReadUncommittedTest.class
})
public class totalTestSuite {
}
