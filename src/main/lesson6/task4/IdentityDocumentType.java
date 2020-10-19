package main.lesson6.task4;

public enum  IdentityDocumentType {

    MILITARY_ID("07"),
    DIPLOMATIC_PASS("09"),
  PASS_FOR_CIT("10"),
   PASS_RF("21"),
  FOR_PASS("22");

    private String idDoctype;

    IdentityDocumentType  ( String idDoctype){
        this.idDoctype=idDoctype;
    }

    public static IdentityDocumentType byCode(String idDoctype) {
        for (IdentityDocumentType documentType : values()) {
            if (documentType.idDoctype.equals(idDoctype)) return documentType;
        }
        return null;
    }

    public String getIdDoc(){
        return idDoctype;
    }


}
