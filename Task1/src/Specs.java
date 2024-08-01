public enum Specs {
    red_cab("Каберне Совиньон",true),
    red_mer("Мерло",true),
    red_ayr("Айрен",true),
    red_tem("Темпранильо",true),
    white_sha("Шардоне",false),
    red_cyr("Сира",true),
    red_gre("Гренаш",true),
    white_sav("Савиньон Блан",false),
    white_uni("Уни Блан",false),
    red_pin("Пино Нуар",true);

    private String nameValue;
    private boolean isRed;

    Specs(String nameValue, boolean isRed) {
        this.nameValue = nameValue;
        this.isRed = isRed;
    }

    public String getNameValue(){
        return nameValue;
    }

    public boolean getIsRed(){
        return isRed;
    }

    public String getColor(){
        return isRed?"Красное":"Белое";
    }



}
