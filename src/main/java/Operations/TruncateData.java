package Operations;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import java.io.IOException;

public class TruncateData {

    public static void truncateTable() throws IOException {

        Cluster cluster = Cluster.builder()
                .addContactPoints("127.0.0.1")
                .withoutJMXReporting()
                .build();

        Session session = cluster.connect();
        String atm_txns_by_customer = "TRUNCATE ifrm_atm_rule_engine.txns_by_customer ;";
        String transaction_daily = "TRUNCATE ifrm_transaction_monitoring.transaction_daily ;";
        String atm_txn_count_by_date = "TRUNCATE ifrm_atm_rule_engine.txn_count_by_date";
        String case_investigation = "TRUNCATE ifrm_case_review.case_investigation;";
        String pos_txns_by_customer = "TRUNCATE ifrm_pos_rule_engine.txns_by_customer ;";
        String pos_txn_count_by_date = "TRUNCATE ifrm_pos_rule_engine.txn_count_by_date ;";


        session.execute(atm_txns_by_customer);
        session.execute(transaction_daily);
        session.execute(atm_txn_count_by_date);
        session.execute(case_investigation);
        session.execute(pos_txns_by_customer);
        session.execute(pos_txn_count_by_date);

        System.out.println("Data Deleted");

    }
}