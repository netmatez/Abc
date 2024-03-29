package com.abc.tests.e2e;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class saleTest {

    // TC 2 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Verify CustomerId, DeviceType, TicketNumber from both topics stagea and stageb
    // TestRun status - PASS
    @Test
    @Scenario("e2e/tickets/sale_ticket_2.json")
    public void E2EInputFileJson2Test() throws Exception {
    }

    // TC 3 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Verify TaxByTaxRules[0].TaxRate from both topics stagea and stageb
    // TestRun status - FAILED, tried so many ways of different json paths
    // You can uncomment in assertions all commented lines 1 by 1 & run
    @Test
    @Scenario("e2e/tickets/sale_ticket_3.json")
    public void E2EInputFileJson3Test() throws Exception {
    }

    // TC 4 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Verify TaxByTaxRules[0] entire object from both topics stagea and stageb
    // TestRun status - FAILED
    @Test
    @Scenario("e2e/tickets/sale_ticket_4.json")
    public void E2EInputFileJson4Test() throws Exception {
    }

    // TC 5 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Verify Payments[0] entire object from both topics stagea and stageb
    // TestRun status - FAILED
    @Test
    @Scenario("e2e/tickets/sale_ticket_5.json")
    public void E2EInputFileJson5Test() throws Exception {
    }

    // TC 6 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Verify message entire object from both topics stagea and stageb
    // TestRun status - FAILED
    // IN THIS ONE :
    // Assumed payload shows RAW JSON
    // Actual value of JSON object is showing = instead of :, and quotes are removed for some fields.  Expected is showing correctly for entire object
    // Seems there is some serious issues in JSON parsing for validation whether you use assertions or validators.
    @Test
    @Scenario("e2e/tickets/sale_ticket_6.json")
    public void E2EInputFileJson6Test() throws Exception {
    }

    // TC 7 - Produce, Consume & Verify
    // Testdata file - Pure JSON & entire data is in singleline
    // Produce to kafka from JSON file for value, key is in scenario file
    // TestRun status - FAILED
      @Test
    @Scenario("e2e/tickets/sale_ticket_7.json")
    public void E2EInputFileJson7Test() throws Exception {
    }

    // TC 7 - Produce, Consume & Verify
    // Testdata file - Fully formatted Pure JSON file & validated in JSON validators
    // TestRun stats - FAILED
    // Failure Reason: Failing to produce a record to Kafka topic, because JSON is
    // PURE JSON & fully/pretty formatted
    @Test
    @Scenario("e2e/tickets/z_sale_ticket_pure_JSON.json")
    public void E2EInputFileJsonTest() throws Exception {
    }

}
