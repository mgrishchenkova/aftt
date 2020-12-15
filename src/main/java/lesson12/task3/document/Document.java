package lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Document {
    private Integer id;
    private Integer edocRefId;
    private String globalId;
    private Integer typeId;
    private String channel;
    private String documentNumber;
    private String documentDate;
    private Integer version;
    private Object read;
    private Client client;
    private Status status;
    private List<Object> checkResults;
    private Object sellingPoint;
    private IdentityDocument identityDocument;
    private List<Object> clientExternalIds;
    private BankAccount bankAccount;
    private OperBranch operBranch;
    private String operationDate;
    private String description;
    private Currency currency;
    private String amount;
    private List<SymbolAmount> symbolAmounts;
    private List<CashQuantity> cashQuantities;
    private Account commissionAccount;
    private Object budget;
    private List<Object> budgetAmounts;
    private Object classifier;
    private Object noteFromBank;
    private Object cancelRequest;
    private Boolean cancelReqInProgress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) &&
                Objects.equals(edocRefId, document.edocRefId) &&
                Objects.equals(globalId, document.globalId) &&
                Objects.equals(typeId, document.typeId) &&
                Objects.equals(channel, document.channel) &&
                Objects.equals(documentNumber, document.documentNumber) &&
                Objects.equals(documentDate, document.documentDate) &&
                Objects.equals(version, document.version) &&
                Objects.equals(read, document.read) &&
                Objects.equals(client, document.client) &&
                Objects.equals(status, document.status) &&
                Objects.equals(checkResults, document.checkResults) &&
                Objects.equals(sellingPoint, document.sellingPoint) &&
                Objects.equals(identityDocument, document.identityDocument) &&
                Objects.equals(clientExternalIds, document.clientExternalIds) &&
                Objects.equals(bankAccount, document.bankAccount) &&
                Objects.equals(operBranch, document.operBranch) &&
                Objects.equals(operationDate, document.operationDate) &&
                Objects.equals(description, document.description) &&
                Objects.equals(currency, document.currency) &&
                Objects.equals(amount, document.amount) &&
                Objects.equals(symbolAmounts, document.symbolAmounts) &&
                Objects.equals(cashQuantities, document.cashQuantities) &&
                Objects.equals(commissionAccount, document.commissionAccount) &&
                Objects.equals(budget, document.budget) &&
                Objects.equals(budgetAmounts, document.budgetAmounts) &&
                Objects.equals(classifier, document.classifier) &&
                Objects.equals(noteFromBank, document.noteFromBank) &&
                Objects.equals(cancelRequest, document.cancelRequest) &&
                Objects.equals(cancelReqInProgress, document.cancelReqInProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, edocRefId, globalId, typeId, channel, documentNumber, documentDate, version, read, client, status, checkResults, sellingPoint, identityDocument, clientExternalIds, bankAccount, operBranch, operationDate, description, currency, amount, symbolAmounts, cashQuantities, commissionAccount, budget, budgetAmounts, classifier, noteFromBank, cancelRequest, cancelReqInProgress);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdocRefId() {
        return edocRefId;
    }

    public void setEdocRefId(Integer edocRefId) {
        this.edocRefId = edocRefId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Object getRead() {
        return read;
    }

    public void setRead(Object read) {
        this.read = read;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Object> getCheckResults() {
        return checkResults;
    }

    public void setCheckResults(List<Object> checkResults) {
        this.checkResults = checkResults;
    }

    public Object getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(Object sellingPoint) {
        this.sellingPoint = sellingPoint;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    public List<Object> getClientExternalIds() {
        return clientExternalIds;
    }

    public void setClientExternalIds(List<Object> clientExternalIds) {
        this.clientExternalIds = clientExternalIds;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public OperBranch getOperBranch() {
        return operBranch;
    }

    public void setOperBranch(OperBranch operBranch) {
        this.operBranch = operBranch;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<SymbolAmount> getSymbolAmounts() {
        return symbolAmounts;
    }

    public void setSymbolAmounts(List<SymbolAmount> symbolAmounts) {
        this.symbolAmounts = symbolAmounts;
    }

    public List<CashQuantity> getCashQuantities() {
        return cashQuantities;
    }

    public void setCashQuantities(List<CashQuantity> cashQuantities) {
        this.cashQuantities = cashQuantities;
    }

    public Account getCommissionAccount() {
        return commissionAccount;
    }

    public void setCommissionAccount(Account commissionAccount) {
        this.commissionAccount = commissionAccount;
    }

    public Object getBudget() {
        return budget;
    }

    public void setBudget(Object budget) {
        this.budget = budget;
    }

    public List<Object> getBudgetAmounts() {
        return budgetAmounts;
    }

    public void setBudgetAmounts(List<Object> budgetAmounts) {
        this.budgetAmounts = budgetAmounts;
    }

    public Object getClassifier() {
        return classifier;
    }

    public void setClassifier(Object classifier) {
        this.classifier = classifier;
    }

    public Object getNoteFromBank() {
        return noteFromBank;
    }

    public void setNoteFromBank(Object noteFromBank) {
        this.noteFromBank = noteFromBank;
    }

    public Object getCancelRequest() {
        return cancelRequest;
    }

    public void setCancelRequest(Object cancelRequest) {
        this.cancelRequest = cancelRequest;
    }

    public Boolean getCancelReqInProgress() {
        return cancelReqInProgress;
    }

    public void setCancelReqInProgress(Boolean cancelReqInProgress) {
        this.cancelReqInProgress = cancelReqInProgress;
    }

    public Document(Integer id, Integer edocRefId, String globalId, Integer typeId, String channel, String documentNumber, String documentDate, Integer version, Object read, Client client, Status status, List<Object> checkResults, Object sellingPoint, IdentityDocument identityDocument, List<Object> clientExternalIds, BankAccount bankAccount, OperBranch operBranch, String operationDate, String description, Currency currency, String amount, List<SymbolAmount> symbolAmounts, List<CashQuantity> cashQuantities, Account commissionAccount, Object budget, List<Object> budgetAmounts, Object classifier, Object noteFromBank, Object cancelRequest, Boolean cancelReqInProgress) {
        this.id = id;
        this.edocRefId = edocRefId;
        this.globalId = globalId;
        this.typeId = typeId;
        this.channel = channel;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.version = version;
        this.read = read;
        this.client = client;
        this.status = status;
        this.checkResults = checkResults;
        this.sellingPoint = sellingPoint;
        this.identityDocument = identityDocument;
        this.clientExternalIds = clientExternalIds;
        this.bankAccount = bankAccount;
        this.operBranch = operBranch;
        this.operationDate = operationDate;
        this.description = description;
        this.currency = currency;
        this.amount = amount;
        this.symbolAmounts = symbolAmounts;
        this.cashQuantities = cashQuantities;
        this.commissionAccount = commissionAccount;
        this.budget = budget;
        this.budgetAmounts = budgetAmounts;
        this.classifier = classifier;
        this.noteFromBank = noteFromBank;
        this.cancelRequest = cancelRequest;
        this.cancelReqInProgress = cancelReqInProgress;
    }
}
