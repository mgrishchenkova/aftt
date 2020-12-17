package lesson12.task3;

import lesson12.task3.document.*;
import lesson12.task3.project.Permission;
import lesson12.task3.project.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDoc {
    private final String PATH = "src/main/java/lesson12/task3/document.json";

    @Test
    @DisplayName("�������� ������������ ����������� ��������� ������� document")
    void testDocumentDeserialization() throws IOException {
        FileHelper<Document> helper = new FileHelper<>();
        Document actualDocument = helper.getObjectFromJsonInFile(PATH, Document.class);

        Client expectedClient = new Client(657376, 9479, "6449042973", "��� \"���� � ������\"", "1026401974972");
        Status expectedStatus = new Status("SIGNED", "��������", null, null, null);
        IdentityDocType expectedIdentityDocType = new IdentityDocType(13, 0, 21, new MultiLang("������� ���������� ��"), "MANDATORY", "MANDATORY");
        IdentityDocument expectedIdentityDocument = new IdentityDocument(expectedIdentityDocType, "7009", "894549", "2016-09-29", "mZeJHLTRlb", "885236", "WiImcktJhx", "ndsFuaNGCB", "HBKdCEImRV");
        Branch expectedBranch = new Branch(97, 19, null, null, "���� � �.���������", "Europe/Moscow", null, true, "1234");
        Account expectedAccount = new Account(76827485, 332, "40701810683938574392", "042201234", expectedBranch);
        Bank expectedBank = new Bank(1234, 0, "042201234", null, null, null);
        BankAccount expectedBankAccount = new BankAccount(expectedAccount, expectedBank);
        OperBranch expectedOperBranch = new OperBranch(expectedBranch, expectedBank);
        Currency expectedCurrency = new Currency(156, 0, "RUR", "810", "���������� �����");
        List<SymbolAmount> expectedSymbolAmounts = Arrays.asList(
                new SymbolAmount("43000.00", new CashSymbol(40, null, "80", "����������� �������� ����� ����� ��������� ��������� �����������", null, null))
        );
        List<CashQuantity> expectedCashQuantities = Arrays.asList(
                new CashQuantity(8, new Cash(null, null, null, 5000.0, "5000,00 ���.", false)),
                new CashQuantity(1, new Cash(null, null, null, 2000.0, "2000,00 ���.", false)),
                new CashQuantity(1, new Cash(null, null, null, 1000.0, "1000,00 ���.", false))
        );

        Assertions.assertEquals(expectedClient, actualDocument.getClient());
        Assertions.assertEquals(expectedStatus, actualDocument.getStatus());
        Assertions.assertEquals(expectedIdentityDocument, actualDocument.getIdentityDocument());
        Assertions.assertEquals(expectedBankAccount, actualDocument.getBankAccount());
        Assertions.assertEquals(expectedOperBranch, actualDocument.getOperBranch());
        Assertions.assertEquals(expectedCurrency, actualDocument.getCurrency());

        Assertions.assertEquals(expectedSymbolAmounts, actualDocument.getSymbolAmounts());
        Assertions.assertEquals(expectedCashQuantities, actualDocument.getCashQuantities());

        Document expectedDocument = new Document(3163, 2663, "0000000441|00000000000000003163", 188, "WEB", "15",
                "2020-09-25", 4, null, expectedClient, expectedStatus, new ArrayList<>(), null, expectedIdentityDocument,
                null, expectedBankAccount, expectedOperBranch, "2020-10-02", "OabGcWdoxv", expectedCurrency, "43000.00",
                expectedSymbolAmounts, expectedCashQuantities, null, null, new ArrayList<>(), null, null, null, false);

        Assertions.assertEquals(expectedDocument, actualDocument);
    }
}
