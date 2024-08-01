public enum Trademarks {
    usa_ej_barefoot ("Barefoot","США","E&J Gallo Winery"),
    chili_ct_concha ("Concha y Toro","Чили","Concha y Toro"),
    china_cp_changyu("Changyu","Китай"," Changyu Pioneer Wine Co"),
    australia_cw_yellowtail ("Yellow Tail","Австралия","Casella Wines"),
    us_tfe_sutterhome ("Sutter Home","США","Trinchero Family Estates");

    private String nameValue,countryValue,companyValue;

    Trademarks(String companyValue, String countryValue, String nameValue) {
        this.companyValue = companyValue;
        this.countryValue = countryValue;
        this.nameValue = nameValue;
    }

    public String getCompanyValue() {
        return companyValue;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    public String getFullInfo(){
        return nameValue+" "+countryValue+" "+companyValue;
    }
}
