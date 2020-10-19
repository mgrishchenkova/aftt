package main.lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private static final String number = "0123456789";
    private static final String RUSSIAN_CAPITALS = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String RANDOM_SYMBOL = "QAZXSWEDCVFRTGBNHYUJMKILOP0123456789";

    IdentityDocumentType identityDocumentTypes;
    String numberDoc;

    public String getNumberDoc() {
        return numberDoc;

    }

    private IdentityDocument(IdentityDocumentType identityDocumentTypes, String numberDoc) {

        this.identityDocumentTypes = identityDocumentTypes;
        this.numberDoc = numberDoc;
    }

    public IdentityDocumentType getIdentityDocumentTypeSet() {
        return identityDocumentTypes;
    }

    public static String generate(IdentityDocumentType identityDocumentTypes) {
        switch (identityDocumentTypes) {
            case MILITARY_ID:
                return generateStrMilId();
            case PASS_RF:
                return generatePassRF();
            case FOR_PASS:
                return generatePassFor();
            case PASS_FOR_CIT:
                return generateStrPassForCit();
            case DIPLOMATIC_PASS:
                return generateStrDipPass();
            default:
                throw new IllegalArgumentException("Не описан метод генерации серии и номера для переданного типа документа " + identityDocumentTypes.name());
        }
    }

    public static IdentityDocument random(){
IdentityDocumentType identityDocumentTypes= IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String numberDoc = generate(identityDocumentTypes);
        return new IdentityDocument(identityDocumentTypes, numberDoc);
    }

    public static String generateStrMilId() {
        return String.format(" %s %s", randomString(RUSSIAN_CAPITALS, 2), randomString(number, 7));

    }

    public static String generateStrDipPass() {
        return String.format(" %s %s", randomString(number, 2), randomString(number, 7));
    }

    public static String generateStrPassForCit() {
        return String.format("%s", randomString(RANDOM_SYMBOL, 25));
    }

    public static String generatePassRF() {
        return String.format("%s %s %s", randomString(number, 2), randomString(number, 2), randomString(number, 6));
    }

    public static String generatePassFor() {
        return String.format("%s %s", randomString(number, 2), randomString(number, 7));
    }

    private static String randomString(String str, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(new Random().nextInt(str.length())));
        }
        return sb.toString();
    }
}
